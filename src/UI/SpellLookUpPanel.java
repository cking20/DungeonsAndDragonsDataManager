/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author chrisrk192
 */
public class SpellLookUpPanel extends javax.swing.JPanel {
    private Data.Spell theSpell;
    
    public ListModel<String> FilterSpellList(String classs, int level){
        DefaultListModel<String> listModel = new DefaultListModel<>();
        
        ArrayList<String> fn = Data.IO.GetFileNames(Data.IO.spellDir);
        String theJSON;// = Data.IO.LoadJSONFile(Data.IO.spellDir+"/"+fn.get(0));
        Data.Spell s;// = Data.DataCollection.FilterSpellJSON(theJSON);
        boolean classMatches;
        
        if(classs.compareTo("All Classes") == 0 && level == -1){
            for (int i = 0; i < fn.size(); i++) {
                listModel.addElement(fn.get(i).replace(".ser", ""));    
            }
        }else if(classs.compareTo("All Classes") == 0 && level != -1){//match by level only  
            for (int i = 0; i < fn.size(); i++) {
                theJSON = Data.IO.LoadJSONFile(Data.IO.spellDir+"/"+fn.get(i));
                s = Data.DataCollection.FilterSpellJSON(theJSON);
                classMatches = true;
                if(classMatches && s.level == level)
                    listModel.addElement(fn.get(i).replace(".ser", ""));    
            }
        }else if(classs.compareTo("All Classes") != 0 && level == -1){ //match by class only
            for (int i = 0; i < fn.size(); i++) {
                theJSON = Data.IO.LoadJSONFile(Data.IO.spellDir+"/"+fn.get(i));
                s = Data.DataCollection.FilterSpellJSON(theJSON);
                classMatches = false;
                if(s != null && s.classes != null)
                for(int j = 0; j < s.classes.size(); j++)
                    if(s.classes.get(j).name.compareTo(classs) == 0)
                        classMatches = true;
                if(classMatches)
                    listModel.addElement(fn.get(i).replace(".ser", ""));    
            }
        }else{ //both
            for (int i = 0; i < fn.size(); i++) {
                theJSON = Data.IO.LoadJSONFile(Data.IO.spellDir+"/"+fn.get(i));
                s = Data.DataCollection.FilterSpellJSON(theJSON);
                classMatches = false;
                if(s != null && s.classes != null)
                for(int j = 0; j < s.classes.size(); j++)
                    if(s.classes.get(j).name.compareTo(classs) == 0)
                        classMatches = true;
                if(classMatches && s.level == level)
                    listModel.addElement(fn.get(i).replace(".ser", ""));    
            }   
        }
        return listModel;
    }
    public void UpdateSpellList(){
        System.out.println("UI.SpellLookUpPanel.UpdateSpellList()");
         spellList.setModel(PopulateAllSpells());
         classFilter.setModel(PopulateClasses());
    }
    private ListModel<String> PopulateAllSpells(){
        DefaultListModel<String> listModel = new DefaultListModel<>();
        ArrayList<String> fn = Data.IO.GetFileNames(Data.IO.spellDir);
        for (int i = 0; i < fn.size(); i++) {
            listModel.addElement(fn.get(i).replace(".ser", ""));    
        }        
        return listModel;
    }
    private ComboBoxModel<String> PopulateClasses(){
        DefaultComboBoxModel<String> listModel = new DefaultComboBoxModel<>();
        ArrayList<String> fn = Data.IO.GetFileNames(Data.IO.classDir);
        listModel.addElement("All Classes");
        for (int i = 0; i < fn.size(); i++) {
            if(fn.get(i).contains(".ser"))
                listModel.addElement(fn.get(i).replace(".ser", ""));    
        }        
        return listModel;
    }
    public void SetCurrentSpell(String name){
        if(name == null)
            return;
        refSpellComponent.setText("");
        refSpellDicr1.setText("");   
        String path = Data.IO.spellDir+"/"+name+".ser";
        String theJSON = Data.IO.LoadJSONFile(path);
        theSpell = Data.DataCollection.FilterSpellJSON(theJSON);
        refSpellName.setText(theSpell.name);
        refSpellType.setText(theSpell.school.name);
        refSpellCastTime.setText(theSpell.casting_time);
        refSpellDuration.setText(theSpell.duration);
        refSpellLevel.setText(theSpell.level+"");
        refSpellRange.setText(theSpell.range);
        refSpellRitual.setText(theSpell.ritual);
        if(theSpell.components != null)
        for(int i = 0; i < theSpell.components.size();i++)
        refSpellComponent.setText(refSpellComponent.getText() + theSpell.components.get(i));
        refSpellComponent.setText(refSpellComponent.getText()+"\n"+theSpell.material);
        if(theSpell.desc != null)
        for(int i = 0; i < theSpell.desc.size();i++)
        refSpellDicr1.setText(refSpellDicr1.getText() + theSpell.desc.get(i)+"\n");
        
        refSpellDicr1.setText(refSpellDicr1.getText() + "Usable By:" +"\n");
        for(int i = 0; i < theSpell.classes.size(); i++)
            refSpellDicr1.setText(refSpellDicr1.getText() + "   " +theSpell.classes.get(i).name+"\n");
    }
    public Data.Spell GetCurrentSpell(){
        return theSpell;
    }
    
    /**
     * Creates new form SpellLookUpPanel
     */
    public SpellLookUpPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel154 = new javax.swing.JPanel();
        jPanel155 = new javax.swing.JPanel();
        jScrollPane48 = new javax.swing.JScrollPane();
        spellList = new javax.swing.JList<>();
        jLabel344 = new javax.swing.JLabel();
        jPanel156 = new javax.swing.JPanel();
        jPanel157 = new javax.swing.JPanel();
        jLabel345 = new javax.swing.JLabel();
        jLabel346 = new javax.swing.JLabel();
        jLabel347 = new javax.swing.JLabel();
        jLabel348 = new javax.swing.JLabel();
        jLabel349 = new javax.swing.JLabel();
        jLabel351 = new javax.swing.JLabel();
        jLabel352 = new javax.swing.JLabel();
        jLabel354 = new javax.swing.JLabel();
        refSpellName = new javax.swing.JLabel();
        refSpellType = new javax.swing.JLabel();
        refSpellLevel = new javax.swing.JLabel();
        refSpellCastTime = new javax.swing.JLabel();
        refSpellRange = new javax.swing.JLabel();
        refSpellDuration = new javax.swing.JLabel();
        refSpellRitual = new javax.swing.JLabel();
        jScrollPane52 = new javax.swing.JScrollPane();
        refSpellDicr1 = new javax.swing.JTextArea();
        jScrollPane50 = new javax.swing.JScrollPane();
        refSpellComponent = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        classFilter = new javax.swing.JComboBox<>();
        levelFilter = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel154.setBackground(new java.awt.Color(204, 204, 204));
        jPanel154.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel154ComponentShown(evt);
            }
        });

        jPanel155.setBackground(new java.awt.Color(255, 255, 255));

        spellList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        spellList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                spellListValueChanged(evt);
            }
        });
        jScrollPane48.setViewportView(spellList);

        jLabel344.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel344.setText("ALL SPELLS");

        javax.swing.GroupLayout jPanel155Layout = new javax.swing.GroupLayout(jPanel155);
        jPanel155.setLayout(jPanel155Layout);
        jPanel155Layout.setHorizontalGroup(
            jPanel155Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane48)
            .addComponent(jLabel344, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel155Layout.setVerticalGroup(
            jPanel155Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel155Layout.createSequentialGroup()
                .addComponent(jScrollPane48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel344))
        );

        javax.swing.GroupLayout jPanel154Layout = new javax.swing.GroupLayout(jPanel154);
        jPanel154.setLayout(jPanel154Layout);
        jPanel154Layout.setHorizontalGroup(
            jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel154Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel154Layout.setVerticalGroup(
            jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel154Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel156.setBackground(new java.awt.Color(204, 204, 204));

        jPanel157.setBackground(new java.awt.Color(255, 255, 255));

        jLabel345.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel345.setText("SPELL DISCRIPTION");

        jLabel346.setText("NAME:");

        jLabel347.setText("SCHOOL:");

        jLabel348.setText("CASTING TIME:");

        jLabel349.setText("RANGE:");

        jLabel351.setText("DURATION:");

        jLabel352.setText("RITUAL:");

        jLabel354.setText("LEVEL:");

        refSpellName.setText("NULL");

        refSpellType.setText("NULL");

        refSpellLevel.setText("NULL");

        refSpellCastTime.setText("NULL");

        refSpellRange.setText("NULL");

        refSpellDuration.setText("NULL");

        refSpellRitual.setText("NULL");

        refSpellDicr1.setColumns(20);
        refSpellDicr1.setLineWrap(true);
        refSpellDicr1.setRows(5);
        refSpellDicr1.setWrapStyleWord(true);
        jScrollPane52.setViewportView(refSpellDicr1);

        refSpellComponent.setColumns(20);
        refSpellComponent.setLineWrap(true);
        refSpellComponent.setRows(5);
        refSpellComponent.setWrapStyleWord(true);
        jScrollPane50.setViewportView(refSpellComponent);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("COMPONENTS/MATERIALS");

        javax.swing.GroupLayout jPanel157Layout = new javax.swing.GroupLayout(jPanel157);
        jPanel157.setLayout(jPanel157Layout);
        jPanel157Layout.setHorizontalGroup(
            jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel157Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel345, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel157Layout.createSequentialGroup()
                        .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel346, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel347, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel352, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel348, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel349, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel351, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel354, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(refSpellDuration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(refSpellRange, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refSpellCastTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refSpellLevel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refSpellType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refSpellName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refSpellRitual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane50, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane52, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel157Layout.setVerticalGroup(
            jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel157Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel157Layout.createSequentialGroup()
                        .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel346)
                            .addComponent(refSpellName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel347)
                            .addComponent(refSpellType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel354)
                            .addComponent(refSpellLevel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel348)
                            .addComponent(refSpellCastTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel349)
                            .addComponent(refSpellRange))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel351)
                            .addComponent(refSpellDuration)))
                    .addComponent(jScrollPane50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel352)
                    .addComponent(refSpellRitual)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane52, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel345))
        );

        javax.swing.GroupLayout jPanel156Layout = new javax.swing.GroupLayout(jPanel156);
        jPanel156.setLayout(jPanel156Layout);
        jPanel156Layout.setHorizontalGroup(
            jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel156Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel156Layout.setVerticalGroup(
            jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel156Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        classFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Classes", "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rouge", "Sorcerer", "Warlock", "Wizard" }));
        classFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classFilterActionPerformed(evt);
            }
        });
        classFilter.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                classFilterPropertyChange(evt);
            }
        });

        levelFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Levels", "Cantrips", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6", "Level 7", "Level 8", "Level 9" }));
        levelFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelFilterActionPerformed(evt);
            }
        });
        levelFilter.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                levelFilterPropertyChange(evt);
            }
        });

        jButton1.setText("Create New Spell");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel156, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(classFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(levelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void spellListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_spellListValueChanged
        // TODO add your handling code here:
        SetCurrentSpell(spellList.getSelectedValue());//spell selected
    }//GEN-LAST:event_spellListValueChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formComponentShown

    private void jPanel154ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel154ComponentShown
        // TODO add your handling code here:
        System.out.println("UI.SpellLookUpPanel.formComponentShown()");
        spellList.setModel(PopulateAllSpells());
    }//GEN-LAST:event_jPanel154ComponentShown

    private void classFilterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_classFilterPropertyChange
        // TODO add your handling code here:
        String className = (String)classFilter.getSelectedItem();
        System.out.println(className);
        int level = (levelFilter.getSelectedIndex()-1);
        System.out.println(level);
        //spellList.setModel(FilterSpellList(className, level));
    }//GEN-LAST:event_classFilterPropertyChange

    private void levelFilterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_levelFilterPropertyChange
        // TODO add your handling code here:
        String className = (String)classFilter.getSelectedItem();
        System.out.println(className);
        int level = (levelFilter.getSelectedIndex()-1);
        System.out.println(level);
        //spellList.setModel(FilterSpellList(className, level));
    }//GEN-LAST:event_levelFilterPropertyChange

    private void classFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classFilterActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String className = (String)classFilter.getSelectedItem();
        System.out.println(className);
        int level = (levelFilter.getSelectedIndex()-1);
        System.out.println(level);
        spellList.setModel(FilterSpellList(className, level));
    }//GEN-LAST:event_classFilterActionPerformed

    private void levelFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelFilterActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String className = (String)classFilter.getSelectedItem();
        System.out.println(className);
        int level = (levelFilter.getSelectedIndex()-1);
        System.out.println(level);
        spellList.setModel(FilterSpellList(className, level));
    }//GEN-LAST:event_levelFilterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        NewSpell s = new NewSpell();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * 
     * @param classs use "All Classes" for all classes
     * @param level use "-1" for all levels
     * @return 
     */
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> classFilter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel352;
    private javax.swing.JLabel jLabel354;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JComboBox<String> levelFilter;
    private javax.swing.JLabel refSpellCastTime;
    private javax.swing.JTextArea refSpellComponent;
    private javax.swing.JTextArea refSpellDicr1;
    private javax.swing.JLabel refSpellDuration;
    private javax.swing.JLabel refSpellLevel;
    private javax.swing.JLabel refSpellName;
    private javax.swing.JLabel refSpellRange;
    private javax.swing.JLabel refSpellRitual;
    private javax.swing.JLabel refSpellType;
    private javax.swing.JList<String> spellList;
    // End of variables declaration//GEN-END:variables
}
