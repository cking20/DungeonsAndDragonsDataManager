/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.Action;
import java.util.ArrayList;

/**
 *
 * @author chrisrk192
 */
public class MonsterSheet extends javax.swing.JPanel {
     public static Data.CharacterSheet monsterActiveChar;
    
    
    public void UpdatePlayerCharacter(){
        if(monsterActiveChar == null){
            System.out.println("player NULL in UPdate");
            return;
        }
        monsterActiveChar.strength = Integer.parseInt(strValue.getText());//playerActiveChar.strength+"");
        monsterActiveChar.dexterity = Integer.parseInt(dexValue.getText());//playerActiveChar.dexterity+"");
        monsterActiveChar.constitution = Integer.parseInt(conValue.getText());//playerActiveChar.constitution+"");
        monsterActiveChar.intelligence = Integer.parseInt(intValue.getText());//playerActiveChar.intelligence+"");
        monsterActiveChar.wisdom = Integer.parseInt(wisValue.getText());//playerActiveChar.wisdom+"");
        monsterActiveChar.charisma = Integer.parseInt(chaValue.getText());//playerActiveChar.charisma+"");

        monsterActiveChar.armor_class = Integer.parseInt(armorClassVal.getText());//playerActiveChar.armor_class+"");
        monsterActiveChar.speed = speedVal.getText();//playerActiveChar.speed+"");
        monsterActiveChar.currentHitPoints = Integer.parseInt(hitpointsCurrent.getText());//playerActiveChar.hit_points+"");
        monsterActiveChar.hit_dice = hitDice.getText();//playerActiveChar.hit_dice+"");
        
}
    /**
     * Should be called in situations of creating a new ActivePlayer CHar
     * @param cs 
     */
    public void SetPlayerCharacter(Data.CharacterSheet cs){
            ClearValues();
            monsterActiveChar = cs;
            System.out.println("Called it: "+monsterActiveChar.name);

            nameLabel2.setText(monsterActiveChar.name);
            challengeRating.setText(monsterActiveChar.challenge_rating+"");
            exp.setText(((int)CalcExpFromLevel(monsterActiveChar.challenge_rating))+"");
            typeLabel.setText(monsterActiveChar.classs);
            subTypeLabel.setText(monsterActiveChar.race);
            strValue.setText(monsterActiveChar.strength+"");
            dexValue.setText(monsterActiveChar.dexterity+"");
            conValue.setText(monsterActiveChar.constitution+"");
            intValue.setText(monsterActiveChar.intelligence+"");
            wisValue.setText(monsterActiveChar.wisdom+"");
            chaValue.setText(monsterActiveChar.charisma+"");

            strMod.setText(CalcModValue(monsterActiveChar.strength)+"");
            dexMod.setText(CalcModValue(monsterActiveChar.dexterity)+"");
            conMod.setText(CalcModValue(monsterActiveChar.constitution)+"");
            intMod.setText(CalcModValue(monsterActiveChar.intelligence)+"");
            wisMod.setText(CalcModValue(monsterActiveChar.wisdom)+"");
            chaMod.setText(CalcModValue(monsterActiveChar.charisma)+"");

            srtMod2.setText(CalcModValue(monsterActiveChar.strength)+"");
            dexMod2.setText(CalcModValue(monsterActiveChar.dexterity)+"");
            conMod2.setText(CalcModValue(monsterActiveChar.constitution)+"");
            intMod2.setText(CalcModValue(monsterActiveChar.intelligence)+"");
            wisMod2.setText(CalcModValue(monsterActiveChar.wisdom)+"");
            chaMod2.setText(CalcModValue(monsterActiveChar.charisma)+"");

            armorClassVal.setText(monsterActiveChar.armor_class+"");
            speedVal.setText(monsterActiveChar.speed+"");
            hitpointsCurrent.setText(monsterActiveChar.hit_points+"");
            hitDice.setText(monsterActiveChar.hit_dice+"");
            
            typeLabel.setText(monsterActiveChar.type);
            subTypeLabel.setText(monsterActiveChar.subtype);
            senses.setText(monsterActiveChar.senses.replace(", ", "\n"));
            for(int i = 0; i < monsterActiveChar.special_abilities.size(); i++){
                Action a = monsterActiveChar.special_abilities.get(i);
                abilities.setText(abilities.getText()+a.name + ": "+a.damage_dice+"\n   Damage Bonus: "+a.damage_bonus+"\n   Attack Bonus: "+a.attack_bonus+"\n   "+a.desc+"\n\n");
            }
            
            for(int i = 0; i < monsterActiveChar.actions.size(); i++){
                Action a = monsterActiveChar.actions.get(i);
                actions.setText(actions.getText()+a.name + ": "+a.damage_dice+"\n   Damage Bonus: "+a.damage_bonus+"\n   Attack Bonus: "+a.attack_bonus+"\n   "+a.desc+"\n\n");
            }
            for(int i = 0; i < monsterActiveChar.legendary_actions.size(); i++){
                Action a = monsterActiveChar.legendary_actions.get(i);
                legendActions.setText(legendActions.getText()+a.name + ": "+a.damage_dice+"\n   Damage Bonus: "+a.damage_bonus+"\n   Attack Bonus: "+a.attack_bonus+"\n   "+a.desc+"\n\n");
            }

            
            vulnerabAndResistance.setText("Vulnerabilities\n   "+monsterActiveChar.damage_vulnerabilities
                    +"\nResistances\n   "+monsterActiveChar.damage_resistances
                    +"\nImmunities\n   "+monsterActiveChar.damage_immunities
            );
            
        }
    
    private void ClearValues(){
            nameLabel2.setText("");
            challengeRating.setText("");
            typeLabel.setText("");
            subTypeLabel.setText("");
            strValue.setText("");
            dexValue.setText("");
            conValue.setText("");
            intValue.setText("");
            wisValue.setText("");
            chaValue.setText("");

            strMod.setText("");
            dexMod.setText("");
            conMod.setText("");
            intMod.setText("");
            wisMod.setText("");
            chaMod.setText("");

            srtMod2.setText("");
            dexMod2.setText("");
            conMod2.setText("");
            intMod2.setText("");
            wisMod2.setText("");
            chaMod2.setText("");

            armorClassVal.setText("");
            speedVal.setText("");
            hitpointsCurrent.setText("");
            hitDice.setText("");
            
            typeLabel.setText("");
            subTypeLabel.setText("");
            senses.setText("");
            
            abilities.setText("");
            actions.setText("");
            legendActions.setText("");
            

            
            vulnerabAndResistance.setText(""
            );
    }
    private int CalcModValue(int base){
        return (base - 10) >> 1;
    }
    public static double CalcExpFromLevel(double level){
        double exp = 0;
        if(level < 1){// will never happen with ints
            exp = level *200;
        } else if ( level <= 20 ){
            exp = 64.794*Math.pow(level,2) - 79.543*level + 222.14;
        } else {
            exp = 564.39*Math.pow(level,2) - 15148*level + 101214;
        }
        
        return exp;
    }
    /**
     * Creates new form PlayerSheet
     */
    public MonsterSheet() {
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

        statsPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        strPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        strValue = new javax.swing.JLabel();
        strMod = new javax.swing.JLabel();
        strPanel1 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        dexValue = new javax.swing.JLabel();
        dexMod = new javax.swing.JLabel();
        strPanel2 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        conValue = new javax.swing.JLabel();
        conMod = new javax.swing.JLabel();
        strPanel3 = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        intValue = new javax.swing.JLabel();
        intMod = new javax.swing.JLabel();
        strPanel4 = new javax.swing.JPanel();
        title4 = new javax.swing.JLabel();
        wisValue = new javax.swing.JLabel();
        wisMod = new javax.swing.JLabel();
        strPanel5 = new javax.swing.JPanel();
        title5 = new javax.swing.JLabel();
        chaValue = new javax.swing.JLabel();
        chaMod = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        actions = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        abilities = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        vulnerabAndResistance = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        legendActions = new javax.swing.JTextArea();
        jLabel75 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        srtMod2 = new javax.swing.JLabel();
        dexMod2 = new javax.swing.JLabel();
        intMod2 = new javax.swing.JLabel();
        conMod2 = new javax.swing.JLabel();
        wisMod2 = new javax.swing.JLabel();
        chaMod2 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        subTypeLabel = new javax.swing.JLabel();
        acPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        speedVal = new javax.swing.JLabel();
        acPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        senses = new javax.swing.JTextArea();
        acPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        armorClassVal = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        hitpointsCurrent = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        hitDice = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        challengeRating = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exp = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        strPanel.setBackground(new java.awt.Color(255, 255, 255));

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("STRENGTH");

        strValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        strValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        strValue.setText("00");

        strMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        strMod.setText("+0");

        javax.swing.GroupLayout strPanelLayout = new javax.swing.GroupLayout(strPanel);
        strPanel.setLayout(strPanelLayout);
        strPanelLayout.setHorizontalGroup(
            strPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(strPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(strMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(strValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        strPanelLayout.setVerticalGroup(
            strPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(strValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(strMod)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        strPanel1.setBackground(new java.awt.Color(255, 255, 255));

        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("DEXTERITY");

        dexValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dexValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dexValue.setText("00");

        dexMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dexMod.setText("+0");

        javax.swing.GroupLayout strPanel1Layout = new javax.swing.GroupLayout(strPanel1);
        strPanel1.setLayout(strPanel1Layout);
        strPanel1Layout.setHorizontalGroup(
            strPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(strPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dexMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dexValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        strPanel1Layout.setVerticalGroup(
            strPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dexValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dexMod)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        strPanel2.setBackground(new java.awt.Color(255, 255, 255));

        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("CONSTITUTION");

        conValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        conValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conValue.setText("00");

        conMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conMod.setText("+0");

        javax.swing.GroupLayout strPanel2Layout = new javax.swing.GroupLayout(strPanel2);
        strPanel2.setLayout(strPanel2Layout);
        strPanel2Layout.setHorizontalGroup(
            strPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(strPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        strPanel2Layout.setVerticalGroup(
            strPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conMod)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        strPanel3.setBackground(new java.awt.Color(255, 255, 255));

        title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3.setText("INTELLIGENCE");

        intValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        intValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        intValue.setText("00");

        intMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        intMod.setText("+0");

        javax.swing.GroupLayout strPanel3Layout = new javax.swing.GroupLayout(strPanel3);
        strPanel3.setLayout(strPanel3Layout);
        strPanel3Layout.setHorizontalGroup(
            strPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(strPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(intMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(intValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        strPanel3Layout.setVerticalGroup(
            strPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intMod)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        strPanel4.setBackground(new java.awt.Color(255, 255, 255));

        title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title4.setText("WISDOM");

        wisValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wisValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wisValue.setText("00");

        wisMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wisMod.setText("+0");

        javax.swing.GroupLayout strPanel4Layout = new javax.swing.GroupLayout(strPanel4);
        strPanel4.setLayout(strPanel4Layout);
        strPanel4Layout.setHorizontalGroup(
            strPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(strPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wisMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wisValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        strPanel4Layout.setVerticalGroup(
            strPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wisValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wisMod)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        strPanel5.setBackground(new java.awt.Color(255, 255, 255));

        title5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title5.setText("CHARISMA");

        chaValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chaValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chaValue.setText("00");

        chaMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chaMod.setText("+0");

        javax.swing.GroupLayout strPanel5Layout = new javax.swing.GroupLayout(strPanel5);
        strPanel5.setLayout(strPanel5Layout);
        strPanel5Layout.setHorizontalGroup(
            strPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(strPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chaMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chaValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        strPanel5Layout.setVerticalGroup(
            strPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chaValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chaMod)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(strPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(strPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(strPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(strPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(strPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(strPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(strPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(strPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(strPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(strPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(strPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(strPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("ABILITIES ");

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("ACTIONS");

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("LEGENDARY ACTIONS");

        actions.setColumns(20);
        actions.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        actions.setLineWrap(true);
        actions.setRows(5);
        actions.setWrapStyleWord(true);
        jScrollPane1.setViewportView(actions);

        abilities.setColumns(20);
        abilities.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        abilities.setLineWrap(true);
        abilities.setRows(5);
        abilities.setWrapStyleWord(true);
        jScrollPane2.setViewportView(abilities);

        vulnerabAndResistance.setColumns(20);
        vulnerabAndResistance.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        vulnerabAndResistance.setLineWrap(true);
        vulnerabAndResistance.setRows(5);
        vulnerabAndResistance.setWrapStyleWord(true);
        jScrollPane3.setViewportView(vulnerabAndResistance);

        legendActions.setColumns(20);
        legendActions.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        legendActions.setLineWrap(true);
        legendActions.setRows(5);
        legendActions.setWrapStyleWord(true);
        jScrollPane4.setViewportView(legendActions);

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("VULNERABILITIES AND RESISTANCES");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jLabel71))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Strength");

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Dexterity");

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Constitution");

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Charisma");

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Intelligence");

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Wisdom");

        srtMod2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        srtMod2.setText("+0");

        dexMod2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dexMod2.setText("+0");

        intMod2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        intMod2.setText("+0");

        conMod2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        conMod2.setText("+0");

        wisMod2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        wisMod2.setText("+0");

        chaMod2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chaMod2.setText("+0");

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("SAVING THROWS");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srtMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dexMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chaMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(intMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wisMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(srtMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(dexMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(conMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(intMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(wisMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(chaMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel64.setText("Type");

        typeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeLabel.setText("NULL");

        jLabel66.setText("SubType");

        subTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTypeLabel.setText("NULL");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jLabel66))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subTypeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        acPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("SPEED");

        speedVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        speedVal.setText("00");

        javax.swing.GroupLayout acPanel2Layout = new javax.swing.GroupLayout(acPanel2);
        acPanel2.setLayout(acPanel2Layout);
        acPanel2Layout.setHorizontalGroup(
            acPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(speedVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        acPanel2Layout.setVerticalGroup(
            acPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(speedVal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15))
        );

        acPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("SENSES");

        senses.setColumns(20);
        senses.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        senses.setRows(5);
        jScrollPane5.setViewportView(senses);

        javax.swing.GroupLayout acPanel5Layout = new javax.swing.GroupLayout(acPanel5);
        acPanel5.setLayout(acPanel5Layout);
        acPanel5Layout.setHorizontalGroup(
            acPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        acPanel5Layout.setVerticalGroup(
            acPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18))
        );

        acPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ARMOR");

        armorClassVal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        armorClassVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        armorClassVal.setText("00");

        javax.swing.GroupLayout acPanel3Layout = new javax.swing.GroupLayout(acPanel3);
        acPanel3.setLayout(acPanel3Layout);
        acPanel3Layout.setHorizontalGroup(
            acPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(armorClassVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        acPanel3Layout.setVerticalGroup(
            acPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(armorClassVal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        hitpointsCurrent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hitpointsCurrent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hitpointsCurrent.setText("00");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("HIT POINTS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hitpointsCurrent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hitpointsCurrent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("HIT DICE");

        hitDice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hitDice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hitDice.setText("0d0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hitDice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hitDice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(acPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(acPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        nameLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel2.setText("Firstname LastName");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Challenge Rating:");

        challengeRating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        challengeRating.setText("00");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Experience:");

        exp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exp.setText("00");

        javax.swing.GroupLayout statsPanelLayout = new javax.swing.GroupLayout(statsPanel);
        statsPanel.setLayout(statsPanelLayout);
        statsPanelLayout.setHorizontalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(challengeRating)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exp)
                        .addContainerGap(149, Short.MAX_VALUE))
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        statsPanelLayout.setVerticalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(exp))
                    .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(challengeRating)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea abilities;
    private javax.swing.JPanel acPanel2;
    private javax.swing.JPanel acPanel3;
    private javax.swing.JPanel acPanel5;
    private javax.swing.JTextArea actions;
    private javax.swing.JLabel armorClassVal;
    private javax.swing.JLabel chaMod;
    private javax.swing.JLabel chaMod2;
    private javax.swing.JLabel chaValue;
    private javax.swing.JLabel challengeRating;
    private javax.swing.JLabel conMod;
    private javax.swing.JLabel conMod2;
    private javax.swing.JLabel conValue;
    private javax.swing.JLabel dexMod;
    private javax.swing.JLabel dexMod2;
    private javax.swing.JLabel dexValue;
    private javax.swing.JLabel exp;
    private javax.swing.JLabel hitDice;
    private javax.swing.JLabel hitpointsCurrent;
    private javax.swing.JLabel intMod;
    private javax.swing.JLabel intMod2;
    private javax.swing.JLabel intValue;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea legendActions;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JTextArea senses;
    private javax.swing.JLabel speedVal;
    private javax.swing.JLabel srtMod2;
    private javax.swing.JPanel statsPanel;
    private javax.swing.JLabel strMod;
    private javax.swing.JPanel strPanel;
    private javax.swing.JPanel strPanel1;
    private javax.swing.JPanel strPanel2;
    private javax.swing.JPanel strPanel3;
    private javax.swing.JPanel strPanel4;
    private javax.swing.JPanel strPanel5;
    private javax.swing.JLabel strValue;
    private javax.swing.JLabel subTypeLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JTextArea vulnerabAndResistance;
    private javax.swing.JLabel wisMod;
    private javax.swing.JLabel wisMod2;
    private javax.swing.JLabel wisValue;
    // End of variables declaration//GEN-END:variables
}
