/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.Inventory;
import Data.Level;
import Data.Notes;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.ListModel;

/**
 *
 * @author chrisrk192
 */
public class PlayerSheet extends javax.swing.JPanel {
    public static Data.CharacterSheet playerActiveChar;
    private String itemOldName;
            
    public void SetCharacterList(ListModel<String> lm){
        characterList.setModel(lm);
    }
    
    public void UpdatePlayerCharacter(){
        if(playerActiveChar == null){
            System.out.println("player NULL in UPdate");
            return;
        }
        playerActiveChar.name = nameField.getText();//playerActiveChar.name);
        playerActiveChar.classs = classField.getText();//playerActiveChar.classs);
        playerActiveChar.race = raceField.getText();//playerActiveChar.race);
        playerActiveChar.strength = Integer.parseInt(strValue.getText());//playerActiveChar.strength+"");
        playerActiveChar.dexterity = Integer.parseInt(dexValue.getText());//playerActiveChar.dexterity+"");
        playerActiveChar.constitution = Integer.parseInt(conValue.getText());//playerActiveChar.constitution+"");
        playerActiveChar.intelligence = Integer.parseInt(intValue.getText());//playerActiveChar.intelligence+"");
        playerActiveChar.wisdom = Integer.parseInt(wisValue.getText());//playerActiveChar.wisdom+"");
        playerActiveChar.charisma = Integer.parseInt(chaValue.getText());//playerActiveChar.charisma+"");

        playerActiveChar.armor_class = Integer.parseInt(armorClassVal1.getText());//playerActiveChar.armor_class+"");
        playerActiveChar.initiative = Integer.parseInt(initiativeVal1.getText());//playerActiveChar.initiative+"");
        playerActiveChar.speed = speedVal1.getText();//playerActiveChar.speed+"");
        playerActiveChar.inspiration = Integer.parseInt(intpiration.getText());//playerActiveChar.inspiration+"");
        //proficiency.getText();//playerActiveChar.pro+"");
        playerActiveChar.perception = Integer.parseInt(perception.getText());//CalcModValue(playerActiveChar.wisdom)+"");  
        playerActiveChar.currentHitPoints = Integer.parseInt(hitPointsCurrent1.getText());//playerActiveChar.hit_points+"");
        playerActiveChar.temp_hit_points = Integer.parseInt(hitPointsTemp1.getText());//playerActiveChar.temp_hit_points+"");
        playerActiveChar.hit_dice = hitDice1.getText();//playerActiveChar.hit_dice+"");
        playerActiveChar.level = Integer.parseInt(hitDiceTotal.getText());//playerActiveChar.level+"");

        playerActiveChar.alignment = alignmentField.getText();//playerActiveChar.alignment+"");
        playerActiveChar.age = ageFiled.getText();//playerActiveChar.age+"");
        playerActiveChar.height = heightField.getText();//playerActiveChar.height+"");
        playerActiveChar.weight = weightField.getText();//playerActiveChar.weight+"");
        playerActiveChar.eyes = eyesField.getText();//playerActiveChar.eyes+"");
        playerActiveChar.skin = skinField.getText();//playerActiveChar.skin+"");
        playerActiveChar.hair = hairField.getText();//playerActiveChar.hair+"");
        playerActiveChar.characterApperance = characterAppearanceField.getText();//playerActiveChar.characterApperance+"");
        playerActiveChar.characterBacktrory = characterBackstoryField.getText();//playerActiveChar.characterBacktrory+"");
        playerActiveChar.alliesAndOrgs = alliesAndOrgs.getText();//playerActiveChar.alliesAndOrgs+"");
        playerActiveChar.languages = languagesField.getText();//playerActiveChar.languages+"\n"+playerActiveChar.proficiencies);
        playerActiveChar.personality = personality.getText();//playerActiveChar.personality+"");
        playerActiveChar.flaws = flaws.getText();//playerActiveChar.flaws+"");
        playerActiveChar.ideals = ideals.getText();//playerActiveChar.ideals+"");
        playerActiveChar.bonds = bonds.getText();//playerActiveChar.bonds+"");
        
        
        playerActiveChar.selected_profs[0] = s1.isSelected();
        playerActiveChar.selected_profs[1] = s2.isSelected();
        playerActiveChar.selected_profs[2] = s3.isSelected();
        playerActiveChar.selected_profs[3] = s4.isSelected();
        playerActiveChar.selected_profs[4] = s5.isSelected();
        playerActiveChar.selected_profs[5] = s6.isSelected();
        playerActiveChar.selected_profs[6] = s7.isSelected();
        playerActiveChar.selected_profs[7] = s8.isSelected();
        playerActiveChar.selected_profs[8] = s9.isSelected();
        playerActiveChar.selected_profs[9] = s10.isSelected();
        playerActiveChar.selected_profs[10] = s11.isSelected();
        playerActiveChar.selected_profs[11] = s12.isSelected();
        playerActiveChar.selected_profs[12] = s13.isSelected();
        playerActiveChar.selected_profs[13] = s14.isSelected();
        playerActiveChar.selected_profs[14] = s15.isSelected();
        playerActiveChar.selected_profs[15] = s16.isSelected();
        playerActiveChar.selected_profs[16] = s17.isSelected();
        playerActiveChar.selected_profs[17] = s18.isSelected();
        
        
        playerActiveChar.selected_saving[0] = t1.isSelected();
        playerActiveChar.selected_saving[1] = t2.isSelected();
        playerActiveChar.selected_saving[2] = t3.isSelected();
        playerActiveChar.selected_saving[3] = t4.isSelected();
        playerActiveChar.selected_saving[4] = t5.isSelected();
        playerActiveChar.selected_saving[5] = t6.isSelected();
        
        
        
        
        
        
        
        
        
        
}
    /**
     * Should be called in situations of creating a new ActivePlayer CHar
     * @param cs 
     */
    public void SetPlayerCharacter(Data.CharacterSheet cs){
        if(cs == null){
            exp.setText("");
            expProgressBar.setValue(0);
            expProgressBar.setMaximum(10);
            nextLevel.setText("0");
            
            nameField.setText("");
            nameLabel.setText("");
            nameLabel2.setText("");
            classField.setText("");
            classLabel.setText("");
            classLabel2.setText("");
            raceField.setText("");
            raceLabel.setText("");
            raceLabel2.setText("");
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

            armorClassVal1.setText("");
            initiativeVal1.setText("");
            speedVal1.setText("");
            intpiration.setText("");
            //proficiency.setText(pro"");
            perception.setText("");  
            hitPointsCurrent1.setText("");
            hitPointsTemp1.setText("");
            hitDice1.setText("");
            hitDiceTotal.setText("");

            acrobatics.setText("");
            animalHandling.setText("");
            Arcana.setText("");
            athletics.setText("");
            deception.setText("");
            history.setText("");
            insight.setText("");
            intimidation.setText("");
            investigation.setText("");
            medicine.setText("");
            nature.setText("");
            perception.setText("");
            perception2.setText("");
            performance.setText("");
            persuasion.setText("");
            religion.setText("");
            slightOfHand.setText("");
            stealth.setText("");
            survival.setText("");

            alignmentField.setText("");
            ageFiled.setText("");
            heightField.setText("");
            weightField.setText("");
            eyesField.setText("");
            skinField.setText("");
            hairField.setText("");
            characterAppearanceField.setText("");
            characterBackstoryField.setText("");
            alliesAndOrgs.setText("");
            languagesField.setText("");
            personality.setText("");
            flaws.setText("");
            ideals.setText("");
            bonds.setText("");
            ClassTextArea.setText("");
            RaceTextArea.setText("");
            levelTextArea.setText("");
            
            
            s1.setSelected(false);
            s2.setSelected(false);
            s3.setSelected(false);
            s4.setSelected(false);
            s5.setSelected(false);
            s6.setSelected(false);
            s7.setSelected(false);
            s8.setSelected(false);
            s9.setSelected(false);
            s10.setSelected(false);
            s11.setSelected(false);
            s12.setSelected(false);
            s13.setSelected(false);
            s14.setSelected(false);
            s15.setSelected(false);
            s16.setSelected(false);
            s17.setSelected(false);
            s18.setSelected(false);
            
            t1.setSelected(false);
            t2.setSelected(false);
            t3.setSelected(false);
            t4.setSelected(false);
            t5.setSelected(false);
            t6.setSelected(false);
            
                    
            return;
        }
        
        
            playerActiveChar = cs;
            SetPlayerLevelInfo();
            //System.out.println("Called it: "+playerActiveChar.name);

            exp.setText(playerActiveChar.experience+"");
            expProgressBar.setValue(playerActiveChar.experience);
            expProgressBar.setMaximum(CalcExpNeededToLevel(playerActiveChar.level+1));
            nextLevel.setText((playerActiveChar.level+1)+"");
            
            ovEXP.setText(playerActiveChar.experience+"");
            ovProgressBar.setValue(playerActiveChar.experience);
            ovProgressBar.setMaximum(CalcExpNeededToLevel(playerActiveChar.level+1));
            ovNextLevel.setText((playerActiveChar.level+1)+"");
            ovHitPoints.setText(playerActiveChar.hit_points+"");
            
            nameField.setText(playerActiveChar.name);
            nameLabel.setText(playerActiveChar.name);
            nameLabel2.setText(playerActiveChar.name);
            classField.setText(playerActiveChar.classs);
            classLabel.setText(playerActiveChar.classs);
            classLabel2.setText(playerActiveChar.classs);
            raceField.setText(playerActiveChar.race);
            raceLabel.setText(playerActiveChar.race);
            raceLabel2.setText(playerActiveChar.race);
            strValue.setText(playerActiveChar.strength+"");
            dexValue.setText(playerActiveChar.dexterity+"");
            conValue.setText(playerActiveChar.constitution+"");
            intValue.setText(playerActiveChar.intelligence+"");
            wisValue.setText(playerActiveChar.wisdom+"");
            chaValue.setText(playerActiveChar.charisma+"");

            strMod.setText(CalcModValue(playerActiveChar.strength)+"");
            dexMod.setText(CalcModValue(playerActiveChar.dexterity)+"");
            conMod.setText(CalcModValue(playerActiveChar.constitution)+"");
            intMod.setText(CalcModValue(playerActiveChar.intelligence)+"");
            wisMod.setText(CalcModValue(playerActiveChar.wisdom)+"");
            chaMod.setText(CalcModValue(playerActiveChar.charisma)+"");

            srtMod2.setText(CalcModValue(playerActiveChar.strength)+"");
            dexMod2.setText(CalcModValue(playerActiveChar.dexterity)+"");
            conMod2.setText(CalcModValue(playerActiveChar.constitution)+"");
            intMod2.setText(CalcModValue(playerActiveChar.intelligence)+"");
            wisMod2.setText(CalcModValue(playerActiveChar.wisdom)+"");
            chaMod2.setText(CalcModValue(playerActiveChar.charisma)+"");

            armorClassVal1.setText(playerActiveChar.armor_class+"");
            initiativeVal1.setText(playerActiveChar.initiative+"");
            speedVal1.setText(playerActiveChar.speed+"");
            intpiration.setText(playerActiveChar.inspiration+"");
            //proficiency.setText(playerActiveChar.pro+"");
            perception.setText(CalcModValue(playerActiveChar.wisdom)+"");  
            hitPointsCurrent1.setText(playerActiveChar.hit_points+"");
            hitPointsTemp1.setText(playerActiveChar.temp_hit_points+"");
            hitDice1.setText(playerActiveChar.hit_dice+"");
            hitDiceTotal.setText(playerActiveChar.level+"");

            acrobatics.setText(CalcModValue(playerActiveChar.dexterity)+"");
            animalHandling.setText(CalcModValue(playerActiveChar.wisdom)+"");
            Arcana.setText(CalcModValue(playerActiveChar.intelligence)+"");
            athletics.setText(CalcModValue(playerActiveChar.strength)+"");
            deception.setText(CalcModValue(playerActiveChar.charisma)+"");
            history.setText(CalcModValue(playerActiveChar.intelligence)+"");
            insight.setText(CalcModValue(playerActiveChar.wisdom)+"");
            intimidation.setText(CalcModValue(playerActiveChar.charisma)+"");
            investigation.setText(CalcModValue(playerActiveChar.intelligence)+"");
            medicine.setText(CalcModValue(playerActiveChar.wisdom)+"");
            nature.setText(CalcModValue(playerActiveChar.intelligence)+"");
            perception.setText(CalcModValue(playerActiveChar.wisdom)+"");
            perception2.setText(CalcModValue(playerActiveChar.wisdom)+"");
            performance.setText(CalcModValue(playerActiveChar.charisma)+"");
            persuasion.setText(CalcModValue(playerActiveChar.charisma)+"");
            religion.setText(CalcModValue(playerActiveChar.intelligence)+"");
            slightOfHand.setText(CalcModValue(playerActiveChar.dexterity)+"");
            stealth.setText(CalcModValue(playerActiveChar.dexterity)+"");
            survival.setText(CalcModValue(playerActiveChar.wisdom)+"");

            alignmentField.setText(playerActiveChar.alignment+"");
            ageFiled.setText(playerActiveChar.age+"");
            heightField.setText(playerActiveChar.height+"");
            weightField.setText(playerActiveChar.weight+"");
            eyesField.setText(playerActiveChar.eyes+"");
            skinField.setText(playerActiveChar.skin+"");
            hairField.setText(playerActiveChar.hair+"");
            characterAppearanceField.setText(playerActiveChar.characterApperance+"");
            characterBackstoryField.setText(playerActiveChar.characterBacktrory+"");
            alliesAndOrgs.setText(playerActiveChar.alliesAndOrgs+"");
            languagesField.setText(playerActiveChar.languages+"\n"+playerActiveChar.proficiencies);
            personality.setText(playerActiveChar.personality+"");
            flaws.setText(playerActiveChar.flaws+"");
            ideals.setText(playerActiveChar.ideals+"");
            bonds.setText(playerActiveChar.bonds+"");

            if(playerActiveChar.classs !=null){
                if(playerActiveChar.classs.compareTo("") != 0){
                    ClassTextArea.setText("");
                    String theJSON = Data.IO.LoadJSONFile(Data.IO.classDir+"/"+playerActiveChar.classs+".ser");
                    Data.ClassArchtype classs = Data.DataCollection.FilterClassArchTypeJSON(theJSON);
                    String choices = "";
                    String profis = "";
                    String saving = "";
                     for(int i = 0; i < classs.savingThrows.size(); i++){
                        saving+="   "+classs.savingThrows.get(i).name+"\n";
                    }
                    for(int i = 0; i < classs.proficiencies.size(); i++){
                        profis+="   "+classs.proficiencies.get(i).name+"\n";
                    }
                    for(int i = 0; i < classs.profcncyChoices.size(); i++){
                        choices+="   "+classs.profcncyChoices.get(i).name+"\n";
                    }
                    ClassTextArea.setText(
                            "Hit Die: "+classs.hitDie+"\n\n"+
                            "Choices: Choose "+classs.numProfcncyToChoose+"\n"+choices+'\n'+
                            "Proficiencies:\n"+profis+"\n"+
                            "Saving Throws:\n"+saving+"\n"
                    );
                    
                    levelTextArea.setText("");
                    for(int i = playerActiveChar.level; i > 0; i--){
                        String theJSON2 = Data.IO.LoadJSONFile(Data.IO.classDir+"/"+playerActiveChar.classs+"/"+playerActiveChar.level+".ser");
                        Data.Level level = Data.DataCollection.FilterLevelJSON(theJSON2);
                        levelTextArea.setText(levelTextArea.getText()+
                                "Level "+i+"\n"+
                                "  Ability Score Bonus:" + level.ability_score_bonuses+"\n"+
                                "  Proficiency Bonus: " + level.prof_bonus+"\n"+
                                "  Features: \n" + PrintFeatures(level)+
                                "  Spells Known: "+level.spells_known+"\n"+
                                "  Cantrips Known:"+level.cantrips_known+"\n"+
                                "\n"
                        );
                    }
                }
                if(playerActiveChar.race.compareTo("") != 0){
                    String theJSON = Data.IO.LoadJSONFile(Data.IO.raceDir+"/"+playerActiveChar.race+".ser");
                    Data.Race race = Data.DataCollection.FilterRaceJSON(theJSON);

                    RaceTextArea.setText(
                            "Alignment: \n   "+race.alignment+"\n"+
                            "Size: \n   "+race.size+"\n"+
                            "Speed: \n   "+race.speed+"\n"+
                            "Age: \n   "+race.alignment+"\n");

                    RaceTextArea.setText(RaceTextArea.getText()+
                            "Traits: \n");
                    for(int i = 0; i < race.traits.size(); i++)        
                        RaceTextArea.setText(RaceTextArea.getText()+
                                "   "+race.traits.get(i).name+"\n");

                    RaceTextArea.setText(RaceTextArea.getText()+
                            "Proficiencies: \n");
                    for(int i = 0; i < race.starting_proficiencies.size(); i++)        
                        RaceTextArea.setText(RaceTextArea.getText()+
                                "   "+race.starting_proficiencies.get(i).name+"\n");

                    RaceTextArea.setText(RaceTextArea.getText()+
                            "Proficiency Choices: "+"Choose "+race.choose);
                    for(int i = 0; i < race.from.size(); i++)        
                        RaceTextArea.setText(RaceTextArea.getText()+
                                "   "+race.from.get(i).name+"\n");

                    RaceTextArea.setText(RaceTextArea.getText()+
                                    "Languages:\n"+race.language_desc+"\n"); 
                    for(int i = 0; i < race.languages.size(); i++)        
                        RaceTextArea.setText(RaceTextArea.getText()+
                                "   "+race.languages.get(i).name+"\n");       
                    
                }
            }
            
            DefaultListModel<String> abs = new DefaultListModel<>();
            for(int i = 0; i < playerActiveChar.actions.size(); i++){
                Data.Action a = playerActiveChar.actions.get(i);
                abs.addElement(a.name+": "+a.attack_bonus+"   "+a.damage_dice);
            }
            for(int i = 0; i < playerActiveChar.special_abilities.size(); i++){
                Data.Action a = playerActiveChar.special_abilities.get(i);
                abs.addElement(a.name+": "+a.attack_bonus+"   "+a.damage_dice);
            }
            for(int i = 0; i < playerActiveChar.legendary_actions.size(); i++){
                Data.Action a = playerActiveChar.legendary_actions.get(i);
                abs.addElement(a.name+": "+a.attack_bonus+"   "+a.damage_dice);
            }
            abilityList.setModel(abs);
            
            
            s1.setSelected(playerActiveChar.selected_profs[0]);
            s2.setSelected(playerActiveChar.selected_profs[1]);
            s3.setSelected(playerActiveChar.selected_profs[2]);
            s4.setSelected(playerActiveChar.selected_profs[3]);
            s5.setSelected(playerActiveChar.selected_profs[4]);
            s6.setSelected(playerActiveChar.selected_profs[5]);
            s7.setSelected(playerActiveChar.selected_profs[6]);
            s8.setSelected(playerActiveChar.selected_profs[7]);
            s9.setSelected(playerActiveChar.selected_profs[8]);
            s10.setSelected(playerActiveChar.selected_profs[9]);
            s11.setSelected(playerActiveChar.selected_profs[10]);
            s12.setSelected(playerActiveChar.selected_profs[11]);
            s13.setSelected(playerActiveChar.selected_profs[12]);
            s14.setSelected(playerActiveChar.selected_profs[13]);
            s15.setSelected(playerActiveChar.selected_profs[14]);
            s16.setSelected(playerActiveChar.selected_profs[15]);
            s17.setSelected(playerActiveChar.selected_profs[16]);
            s18.setSelected(playerActiveChar.selected_profs[17]);
            
            t1.setSelected(playerActiveChar.selected_saving[0]);
            t2.setSelected(playerActiveChar.selected_saving[1]);
            t3.setSelected(playerActiveChar.selected_saving[2]);
            t4.setSelected(playerActiveChar.selected_saving[3]);
            t5.setSelected(playerActiveChar.selected_saving[4]);
            t6.setSelected(playerActiveChar.selected_saving[5]);
            
            
            
            
            
        }
    public String PrintFeatures(Data.Level l){
        String ret = "";
        for(int i = 0; i < l.features.size(); i++){
            ret+="     "+l.features.get(i).name+"\n";
        }
        return ret;
    }
    public void AddPlayerCharacter(Data.CharacterSheet cs){
        Data.IO.SaveCharacterSheet(playerActiveChar);
        SetPlayerCharacter(cs);
        Data.IO.SaveCharacterSheet(playerActiveChar);
        UpdateCharacterList();
    }
    private int CalcModValue(int base){
        return (base - 10) >> 1;
    }
    
    private int CalcLevelFromExp(int exp){//2100 level 2
        int t = 0; int i;
        for(i =1; t < exp; i++){
            t = (i-1)*1000+t;
        }
        return i-1;
    }
    private int CalcExpNeededToLevel(int i){
        if(i == 1)
            return 0;
        return (i-1)*1000+CalcExpNeededToLevel(i-1);
        
    }
    
    private ListModel<String> PopulateNotes(){
        DefaultListModel<String> listModel = new DefaultListModel<>();
        ArrayList<String> fn = playerActiveChar.notes.getNames();
        for (int i = 0; i < fn.size(); i++) {
            listModel.addElement(fn.get(i));    
        }        
        return listModel;
    }    
    private ListModel<String> PopulateItems(){
        DefaultListModel<String> listModel = new DefaultListModel<>();
        ArrayList<String> fn = playerActiveChar.inventory.getNames();
        for (int i = 0; i < fn.size(); i++) {
            listModel.addElement(fn.get(i));    
        }        
        return listModel;
    }
    private void SetSpellLevelInfo(int level){
        
        DefaultListModel<String> listModel = new DefaultListModel<>();
        switch(level){
            case 0://cantrips
                for(int i = 0; i <playerActiveChar.cantrips.size(); i++){
                    listModel.addElement(playerActiveChar.cantrips.get(i).name);
                }
                knownSpellList.setModel(listModel);
                levelLabel.setText("Cantrips");
                slotsTotal.setText(playerActiveChar.levelSlotsTotalCantrips+"");
                slotsExpended.setText("N/A");
                
                break;
            case 1:
                for(int i = 0; i <playerActiveChar.level1.size(); i++){
                    listModel.addElement(playerActiveChar.level1.get(i).name);
                }
                knownSpellList.setModel(listModel);
                levelLabel.setText("Level 1");
                slotsTotal.setText(playerActiveChar.levelSlotsTotal1+"");
                slotsExpended.setText(playerActiveChar.levelSlotsLeft1+"");
                break;
            case 2:
                for(int i = 0; i <playerActiveChar.level2.size(); i++){
                    listModel.addElement(playerActiveChar.level2.get(i).name);
                }
                knownSpellList.setModel(listModel);
                levelLabel.setText("Level 2");
                slotsTotal.setText(playerActiveChar.levelSlotsTotal2+"");
                slotsExpended.setText(playerActiveChar.levelSlotsLeft2+"");
                break;
            case 3:
                for(int i = 0; i <playerActiveChar.level3.size(); i++){
                    listModel.addElement(playerActiveChar.level3.get(i).name);
                }
                knownSpellList.setModel(listModel);
                levelLabel.setText("Level 3");
                slotsTotal.setText(playerActiveChar.levelSlotsTotal3+"");
                slotsExpended.setText(playerActiveChar.levelSlotsLeft3+"");
                break;
            case 4:
                for(int i = 0; i <playerActiveChar.level4.size(); i++){
                    listModel.addElement(playerActiveChar.level4.get(i).name);
                }
                knownSpellList.setModel(listModel);
                levelLabel.setText("Level 4");
                slotsTotal.setText(playerActiveChar.levelSlotsTotal4+"");
                slotsExpended.setText(playerActiveChar.levelSlotsLeft4+"");
                break;
            case 5:
                for(int i = 0; i <playerActiveChar.level5.size(); i++){
                    listModel.addElement(playerActiveChar.level5.get(i).name);
                }
                knownSpellList.setModel(listModel);
                levelLabel.setText("Level 5");
                slotsTotal.setText(playerActiveChar.levelSlotsTotal5+"");
                slotsExpended.setText(playerActiveChar.levelSlotsLeft5+"");
                break;
            case 6:
                for(int i = 0; i <playerActiveChar.level6.size(); i++){
                    listModel.addElement(playerActiveChar.level6.get(i).name);
                }
                knownSpellList.setModel(listModel);
                levelLabel.setText("Level 6");
                slotsTotal.setText(playerActiveChar.levelSlotsTotal6+"");
                slotsExpended.setText(playerActiveChar.levelSlotsLeft6+"");
                break;
            case 7:
                for(int i = 0; i <playerActiveChar.level7.size(); i++){
                    listModel.addElement(playerActiveChar.level7.get(i).name);
                }
                knownSpellList.setModel(listModel);
                levelLabel.setText("Level 7");
                slotsTotal.setText(playerActiveChar.levelSlotsTotal7+"");
                slotsExpended.setText(playerActiveChar.levelSlotsLeft7+"");
                break;
            case 8:
                for(int i = 0; i <playerActiveChar.level8.size(); i++){
                    listModel.addElement(playerActiveChar.level8.get(i).name);
                }
                knownSpellList.setModel(listModel);
                levelLabel.setText("Level 8");
                slotsTotal.setText(playerActiveChar.levelSlotsTotal8+"");
                slotsExpended.setText(playerActiveChar.levelSlotsLeft8+"");
                break;
            case 9:
                for(int i = 0; i <playerActiveChar.level9.size(); i++){
                    listModel.addElement(playerActiveChar.level9.get(i).name);
                }
                knownSpellList.setModel(listModel);
                levelLabel.setText("Level 9");
                slotsTotal.setText(playerActiveChar.levelSlotsTotal9+"");
                slotsExpended.setText(playerActiveChar.levelSlotsLeft9+"");
                break;
            

        }
    }
    private void SetPlayerLevelInfo(){
        if(playerActiveChar == null)
            return;
        String path = Data.IO.levelDir+"/"+playerActiveChar.classs+"/"+playerActiveChar.level+".ser";
        if(playerActiveChar.classs == null)
            return;
        if(playerActiveChar.classs.compareTo("") == 0)
            return;
        System.out.println(path);
        String theJSON = Data.IO.LoadJSONFile(path);
        System.out.println(theJSON);
        Level l =  Data.DataCollection.FilterLevelJSON(theJSON);
        playerActiveChar.proficiency = l.prof_bonus;
        //playerActiveChar. = l.ability_score_bonuses;
        
        playerActiveChar.levelSlotsTotalCantrips = l.cantrips_known;
        System.out.println("l.cantrips_known= "+l.cantrips_known+"\n\n\n\n\n\n\n\n");
        playerActiveChar.levelSlotsTotal1 = l.spell_slots_level_1;
        playerActiveChar.levelSlotsTotal2 = l.spell_slots_level_2;
        playerActiveChar.levelSlotsTotal3 = l.spell_slots_level_3;
        playerActiveChar.levelSlotsTotal4 = l.spell_slots_level_4;
        playerActiveChar.levelSlotsTotal5 = l.spell_slots_level_5;
        playerActiveChar.levelSlotsTotal6 = l.spell_slots_level_6;
        playerActiveChar.levelSlotsTotal7 = l.spell_slots_level_7;
        playerActiveChar.levelSlotsTotal8 = l.spell_slots_level_8;
        playerActiveChar.levelSlotsTotal9 = l.spell_slots_level_9;
        
    }
    public void UpdateCharacterList(){
        System.out.println("UI.PlayerSheet.UpdateCharacterList()");
        characterList.setModel(PopulatePlayerCharacters());
    }
    private ListModel<String> PopulatePlayerCharacters(){
        DefaultListModel<String> listModel = new DefaultListModel<>();
        ArrayList<String> fn = Data.IO.GetFileNames(Data.IO.sheetDir);
        for (int i = 0; i < fn.size(); i++) {
            listModel.addElement(fn.get(i).replace(".ser", ""));    
        }        
        return listModel;
    }
    /*
    private Image getScaledImage(Image srcImg, int w, int h){
    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2 = resizedImg.createGraphics();

    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    g2.drawImage(srcImg, 0, 0, w, h, null);
    g2.dispose();

    return resizedImg;
    
    }
    */
    
    /**
     * Creates new form PlayerSheet
     */
    public PlayerSheet() {
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

        jTabbedPane3 = new javax.swing.JTabbedPane();
        overviewPanel = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        jPanel172 = new javax.swing.JPanel();
        jLabel364 = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        jLabel366 = new javax.swing.JLabel();
        raceLabel = new javax.swing.JLabel();
        jLabel368 = new javax.swing.JLabel();
        ovEXP = new javax.swing.JLabel();
        ovProgressBar = new javax.swing.JProgressBar();
        ovNextLevel = new javax.swing.JLabel();
        jPanel173 = new javax.swing.JPanel();
        jLabel371 = new javax.swing.JLabel();
        jLabel372 = new javax.swing.JLabel();
        ovHitPoints = new javax.swing.JLabel();
        jLabel374 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        characterList = new javax.swing.JList<>();
        jLabel95 = new javax.swing.JLabel();
        newCharacterButton = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        statsPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        strPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        strValue = new javax.swing.JLabel();
        strMod = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        strPanel1 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        dexValue = new javax.swing.JLabel();
        dexMod = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        strPanel2 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        conValue = new javax.swing.JLabel();
        conMod = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        strPanel3 = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        intValue = new javax.swing.JLabel();
        intMod = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        strPanel4 = new javax.swing.JPanel();
        title4 = new javax.swing.JLabel();
        wisValue = new javax.swing.JLabel();
        wisMod = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        strPanel5 = new javax.swing.JPanel();
        title5 = new javax.swing.JLabel();
        chaValue = new javax.swing.JLabel();
        chaMod = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        acPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        initiativeVal1 = new javax.swing.JFormattedTextField();
        acPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        speedVal1 = new javax.swing.JTextField();
        acPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        armorClassVal1 = new javax.swing.JFormattedTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hitPointsCurrent1 = new javax.swing.JFormattedTextField();
        hitPointsMax1 = new javax.swing.JFormattedTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        hitPointsTemp1 = new javax.swing.JFormattedTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        hitDiceTotal = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        hitDice1 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        successes = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        faliures = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        abilityList = new javax.swing.JList<>();
        newAbilityButton = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        proficiency = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        intpiration = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        perception = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        classLabel2 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        raceLabel2 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        expProgressBar = new javax.swing.JProgressBar();
        nextLevel = new javax.swing.JLabel();
        exp = new javax.swing.JFormattedTextField();
        jPanel65 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel16 = new javax.swing.JPanel();
        s1 = new javax.swing.JRadioButton();
        acrobatics = new javax.swing.JLabel();
        s2 = new javax.swing.JRadioButton();
        animalHandling = new javax.swing.JLabel();
        s3 = new javax.swing.JRadioButton();
        Arcana = new javax.swing.JLabel();
        s4 = new javax.swing.JRadioButton();
        athletics = new javax.swing.JLabel();
        s5 = new javax.swing.JRadioButton();
        s6 = new javax.swing.JRadioButton();
        s7 = new javax.swing.JRadioButton();
        s8 = new javax.swing.JRadioButton();
        deception = new javax.swing.JLabel();
        history = new javax.swing.JLabel();
        insight = new javax.swing.JLabel();
        intimidation = new javax.swing.JLabel();
        s10 = new javax.swing.JRadioButton();
        s11 = new javax.swing.JRadioButton();
        s12 = new javax.swing.JRadioButton();
        s13 = new javax.swing.JRadioButton();
        medicine = new javax.swing.JLabel();
        nature = new javax.swing.JLabel();
        perception2 = new javax.swing.JLabel();
        performance = new javax.swing.JLabel();
        s14 = new javax.swing.JRadioButton();
        s15 = new javax.swing.JRadioButton();
        s16 = new javax.swing.JRadioButton();
        s17 = new javax.swing.JRadioButton();
        persuasion = new javax.swing.JLabel();
        religion = new javax.swing.JLabel();
        slightOfHand = new javax.swing.JLabel();
        stealth = new javax.swing.JLabel();
        s18 = new javax.swing.JRadioButton();
        s9 = new javax.swing.JRadioButton();
        survival = new javax.swing.JLabel();
        investigation = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        t1 = new javax.swing.JRadioButton();
        t2 = new javax.swing.JRadioButton();
        t3 = new javax.swing.JRadioButton();
        t6 = new javax.swing.JRadioButton();
        t4 = new javax.swing.JRadioButton();
        t5 = new javax.swing.JRadioButton();
        srtMod2 = new javax.swing.JLabel();
        dexMod2 = new javax.swing.JLabel();
        intMod2 = new javax.swing.JLabel();
        conMod2 = new javax.swing.JLabel();
        wisMod2 = new javax.swing.JLabel();
        chaMod2 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        nameLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        levelTextArea = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ClassTextArea = new javax.swing.JTextArea();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        RaceTextArea = new javax.swing.JTextArea();
        spellsPanel = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        spellCastingAbilityLabel = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        spellSaveDC = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        spellAttackBonus = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        spellcastingClassLabel = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        knownSpellList = new javax.swing.JList<>();
        jLabel106 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        spellLevelList = new javax.swing.JList<>();
        jLabel113 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        levelLabel = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        slotsExpended = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        slotsTotal = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        spellLookUpPanel1 = new UI.SpellLookUpPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        removeSpell = new javax.swing.JButton();
        inventoryPanel = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        treasureList = new javax.swing.JList<>();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        itemList = new javax.swing.JList<>();
        jLabel88 = new javax.swing.JLabel();
        newItemButton = new javax.swing.JButton();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        decQuantityButton = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        quantity = new javax.swing.JLabel();
        incQuantityButton = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        itemDesc = new javax.swing.JTextArea();
        itemName = new javax.swing.JTextField();
        changeQuantityButton = new javax.swing.JButton();
        EquipButton = new javax.swing.JToggleButton();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        equipedList = new javax.swing.JList<>();
        jButton20 = new javax.swing.JButton();
        bgPanel = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        classField = new javax.swing.JTextField();
        raceField = new javax.swing.JTextField();
        alignmentField = new javax.swing.JTextField();
        ageFiled = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        heightField = new javax.swing.JTextField();
        weightField = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        skinField = new javax.swing.JTextField();
        eyesField = new javax.swing.JTextField();
        hairField = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        characterAppearanceField = new javax.swing.JTextArea();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        alliesAndOrgs = new javax.swing.JTextArea();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        characterBackstoryField = new javax.swing.JTextArea();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        languagesField = new javax.swing.JTextArea();
        jLabel87 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        personality = new javax.swing.JEditorPane();
        jLabel89 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        ideals = new javax.swing.JEditorPane();
        jLabel92 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        bonds = new javax.swing.JEditorPane();
        jLabel93 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        flaws = new javax.swing.JEditorPane();
        jLabel94 = new javax.swing.JLabel();
        notesPanel = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        notesList = new javax.swing.JList<>();
        jLabel90 = new javax.swing.JLabel();
        newNote = new javax.swing.JButton();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        deleteNoteButtol = new javax.swing.JButton();
        jLabel139 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        noteText = new javax.swing.JTextArea();
        noteName = new javax.swing.JTextField();

        overviewPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                overviewPanelComponentShown(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        nameLabel.setText("Name");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(0, 507, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel172.setBackground(new java.awt.Color(255, 255, 255));

        jLabel364.setText("CLASS");

        classLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classLabel.setText("NULL");

        jLabel366.setText("RACE");

        raceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        raceLabel.setText("NULL");

        jLabel368.setText("EXPERIENCE");

        ovEXP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ovEXP.setText("00");

        ovNextLevel.setText("00");

        javax.swing.GroupLayout jPanel172Layout = new javax.swing.GroupLayout(jPanel172);
        jPanel172.setLayout(jPanel172Layout);
        jPanel172Layout.setHorizontalGroup(
            jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel172Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel172Layout.createSequentialGroup()
                        .addComponent(ovProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ovNextLevel))
                    .addGroup(jPanel172Layout.createSequentialGroup()
                        .addGroup(jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel368, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jLabel366, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel364, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(raceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ovEXP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel172Layout.setVerticalGroup(
            jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel172Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel364)
                    .addComponent(classLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel366)
                    .addComponent(raceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel172Layout.createSequentialGroup()
                        .addGroup(jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel368)
                            .addComponent(ovEXP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ovProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel172Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ovNextLevel)))
                .addContainerGap())
        );

        jPanel173.setBackground(new java.awt.Color(255, 255, 255));

        jLabel371.setText("Hit Point Max:");

        jLabel372.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel372.setText("00");

        ovHitPoints.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ovHitPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ovHitPoints.setText("00");

        jLabel374.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel374.setText("CURRENT HIT POINTS");

        javax.swing.GroupLayout jPanel173Layout = new javax.swing.GroupLayout(jPanel173);
        jPanel173.setLayout(jPanel173Layout);
        jPanel173Layout.setHorizontalGroup(
            jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel173Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ovHitPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel173Layout.createSequentialGroup()
                        .addComponent(jLabel371)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel372, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel374, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel173Layout.setVerticalGroup(
            jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel173Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel371)
                    .addComponent(jLabel372))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ovHitPoints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel374))
        );

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton19.setText("Delete");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel172, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel43.setBackground(new java.awt.Color(204, 204, 204));

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));

        characterList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                characterListValueChanged(evt);
            }
        });
        jScrollPane18.setViewportView(characterList);

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("CHARACTERS");

        newCharacterButton.setText("New Character");
        newCharacterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCharacterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
            .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newCharacterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newCharacterButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel45.setBackground(new java.awt.Color(204, 204, 204));

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 967, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout overviewPanelLayout = new javax.swing.GroupLayout(overviewPanel);
        overviewPanel.setLayout(overviewPanelLayout);
        overviewPanelLayout.setHorizontalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        overviewPanelLayout.setVerticalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(overviewPanelLayout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Overview", overviewPanel);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        strPanel.setBackground(new java.awt.Color(255, 255, 255));

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("STRENGTH");

        strValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        strValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        strValue.setText("00");

        strMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        strMod.setText("+0");

        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout strPanelLayout = new javax.swing.GroupLayout(strPanel);
        strPanel.setLayout(strPanelLayout);
        strPanelLayout.setHorizontalGroup(
            strPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(strPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(strMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, strPanelLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(strValue, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        strPanelLayout.setVerticalGroup(
            strPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(strPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strValue)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
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

        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("+");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout strPanel1Layout = new javax.swing.GroupLayout(strPanel1);
        strPanel1.setLayout(strPanel1Layout);
        strPanel1Layout.setHorizontalGroup(
            strPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(strPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dexMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(strPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dexValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)))
                .addContainerGap())
        );
        strPanel1Layout.setVerticalGroup(
            strPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(strPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dexValue)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
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

        jButton8.setText("-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("+");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout strPanel2Layout = new javax.swing.GroupLayout(strPanel2);
        strPanel2.setLayout(strPanel2Layout);
        strPanel2Layout.setHorizontalGroup(
            strPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(strPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(strPanel2Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)))
                .addContainerGap())
        );
        strPanel2Layout.setVerticalGroup(
            strPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(strPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conValue)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
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

        jButton10.setText("-");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("+");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout strPanel3Layout = new javax.swing.GroupLayout(strPanel3);
        strPanel3.setLayout(strPanel3Layout);
        strPanel3Layout.setHorizontalGroup(
            strPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(strPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(intMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(strPanel3Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)))
                .addContainerGap())
        );
        strPanel3Layout.setVerticalGroup(
            strPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(strPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intValue)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
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

        jButton12.setText("-");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("+");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout strPanel4Layout = new javax.swing.GroupLayout(strPanel4);
        strPanel4.setLayout(strPanel4Layout);
        strPanel4Layout.setHorizontalGroup(
            strPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(strPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wisMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(strPanel4Layout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wisValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)))
                .addContainerGap())
        );
        strPanel4Layout.setVerticalGroup(
            strPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(strPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wisValue)
                    .addComponent(jButton12)
                    .addComponent(jButton13))
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

        jButton17.setText("-");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("+");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout strPanel5Layout = new javax.swing.GroupLayout(strPanel5);
        strPanel5.setLayout(strPanel5Layout);
        strPanel5Layout.setHorizontalGroup(
            strPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(strPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chaMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(strPanel5Layout.createSequentialGroup()
                        .addComponent(jButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chaValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18)))
                .addContainerGap())
        );
        strPanel5Layout.setVerticalGroup(
            strPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(strPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chaValue)
                    .addComponent(jButton17)
                    .addComponent(jButton18))
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

        acPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("INITATIVE");

        initiativeVal1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("00"))));
        initiativeVal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        initiativeVal1.setText("00");
        initiativeVal1.setCaretColor(new java.awt.Color(255, 255, 255));
        initiativeVal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        initiativeVal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initiativeVal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout acPanel1Layout = new javax.swing.GroupLayout(acPanel1);
        acPanel1.setLayout(acPanel1Layout);
        acPanel1Layout.setHorizontalGroup(
            acPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(initiativeVal1))
                .addContainerGap())
        );
        acPanel1Layout.setVerticalGroup(
            acPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(initiativeVal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        acPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("SPEED");

        speedVal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        speedVal1.setText("00 ft.");

        javax.swing.GroupLayout acPanel2Layout = new javax.swing.GroupLayout(acPanel2);
        acPanel2.setLayout(acPanel2Layout);
        acPanel2Layout.setHorizontalGroup(
            acPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(speedVal1))
                .addContainerGap())
        );
        acPanel2Layout.setVerticalGroup(
            acPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(speedVal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        acPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ARMOR");

        armorClassVal1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("00"))));
        armorClassVal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        armorClassVal1.setText("00");
        armorClassVal1.setCaretColor(new java.awt.Color(255, 255, 255));
        armorClassVal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        armorClassVal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armorClassVal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout acPanel3Layout = new javax.swing.GroupLayout(acPanel3);
        acPanel3.setLayout(acPanel3Layout);
        acPanel3Layout.setHorizontalGroup(
            acPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(armorClassVal1))
                .addContainerGap())
        );
        acPanel3Layout.setVerticalGroup(
            acPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(armorClassVal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel17))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setText("Hit Point Max:");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CURRENT HIT POINTS");

        hitPointsCurrent1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("00"))));
        hitPointsCurrent1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hitPointsCurrent1.setText("00");
        hitPointsCurrent1.setCaretColor(new java.awt.Color(255, 255, 255));
        hitPointsCurrent1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hitPointsCurrent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitPointsCurrent1ActionPerformed(evt);
            }
        });

        hitPointsMax1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("00"))));
        hitPointsMax1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hitPointsMax1.setText("00");
        hitPointsMax1.setCaretColor(new java.awt.Color(255, 255, 255));
        hitPointsMax1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitPointsMax1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hitPointsMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hitPointsCurrent1))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(hitPointsMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hitPointsCurrent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel11))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TEMPORARY HIT POINTS");

        hitPointsTemp1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("00"))));
        hitPointsTemp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hitPointsTemp1.setText("00");
        hitPointsTemp1.setCaretColor(new java.awt.Color(255, 255, 255));
        hitPointsTemp1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hitPointsTemp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitPointsTemp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hitPointsTemp1))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hitPointsTemp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setText("Total:");

        hitDiceTotal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        hitDiceTotal.setText("00");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("HIT DICE");

        hitDice1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hitDice1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hitDice1.setText("0d0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hitDiceTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addComponent(hitDice1))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(hitDiceTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hitDice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setText("SUCCESSES:");

        successes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        successes.setText("00");

        jLabel30.setText("FAILURES:");

        faliures.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        faliures.setText("00");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("DEATH SAVES");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(successes, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faliures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(successes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(faliures))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29))
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Abilities and Actions");

        jLabel72.setText("NAME            ATK BONUS    DAMAGE/TYPE");

        jScrollPane24.setViewportView(abilityList);

        newAbilityButton.setText("New Ability");
        newAbilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAbilityButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane24)
                    .addComponent(newAbilityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newAbilityButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(acPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(acPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setText("PROFICIENCY");

        proficiency.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        proficiency.setText("00");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(proficiency)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(proficiency))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setText("INSPIRATION");

        intpiration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        intpiration.setText("00");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intpiration)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(intpiration))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setText("PERCEPTION");

        perception.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        perception.setText("00");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perception)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(perception))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel64.setText("CLASS");

        classLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classLabel2.setText("NULL");

        jLabel66.setText("RACE");

        raceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        raceLabel2.setText("NULL");

        jLabel68.setText("EXPERIENCE");

        expProgressBar.setToolTipText("");

        nextLevel.setText("00");

        exp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("00"))));
        exp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        exp.setText("00");
        exp.setCaretColor(new java.awt.Color(255, 255, 255));
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exp)
                    .addComponent(classLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(raceLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(expProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextLevel))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jLabel66)
                            .addComponent(jLabel68))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(raceLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextLevel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel65.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        s1.setBackground(new java.awt.Color(255, 255, 255));
        s1.setText("Acrobatics");

        acrobatics.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        acrobatics.setText("+0");

        s2.setBackground(new java.awt.Color(255, 255, 255));
        s2.setText("Animal Handeling");
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });

        animalHandling.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        animalHandling.setText("+0");

        s3.setBackground(new java.awt.Color(255, 255, 255));
        s3.setText("Arcana");

        Arcana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Arcana.setText("+0");

        s4.setBackground(new java.awt.Color(255, 255, 255));
        s4.setText("Athletics");

        athletics.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        athletics.setText("+0");

        s5.setBackground(new java.awt.Color(255, 255, 255));
        s5.setText("Deception");

        s6.setBackground(new java.awt.Color(255, 255, 255));
        s6.setText("History");

        s7.setBackground(new java.awt.Color(255, 255, 255));
        s7.setText("Insight");

        s8.setBackground(new java.awt.Color(255, 255, 255));
        s8.setText("Intimidation");

        deception.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        deception.setText("+0");

        history.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        history.setText("+0");

        insight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        insight.setText("+0");

        intimidation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        intimidation.setText("+0");

        s10.setBackground(new java.awt.Color(255, 255, 255));
        s10.setText("Medicine");

        s11.setBackground(new java.awt.Color(255, 255, 255));
        s11.setText("Nature");

        s12.setBackground(new java.awt.Color(255, 255, 255));
        s12.setText("Perception");

        s13.setBackground(new java.awt.Color(255, 255, 255));
        s13.setText("Performance");

        medicine.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        medicine.setText("+0");

        nature.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nature.setText("+0");

        perception2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        perception2.setText("+0");

        performance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        performance.setText("+0");

        s14.setBackground(new java.awt.Color(255, 255, 255));
        s14.setText("Persuasion");

        s15.setBackground(new java.awt.Color(255, 255, 255));
        s15.setText("Religion");

        s16.setBackground(new java.awt.Color(255, 255, 255));
        s16.setText("Slight of Hand");

        s17.setBackground(new java.awt.Color(255, 255, 255));
        s17.setText("Stealth");

        persuasion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        persuasion.setText("+0");

        religion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        religion.setText("+0");

        slightOfHand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        slightOfHand.setText("+0");

        stealth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        stealth.setText("+0");

        s18.setBackground(new java.awt.Color(255, 255, 255));
        s18.setText("Survival");

        s9.setBackground(new java.awt.Color(255, 255, 255));
        s9.setText("Investigtion");

        survival.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        survival.setText("+0");

        investigation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        investigation.setText("+0");

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("SKILLS");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acrobatics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(animalHandling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Arcana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(s4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(athletics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deception, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(history, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(s8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intimidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(s9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(investigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(perception2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(s13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(performance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(persuasion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(religion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slightOfHand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(s17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(s18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(survival, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1)
                    .addComponent(acrobatics))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s2)
                    .addComponent(animalHandling))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3)
                    .addComponent(Arcana))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s4)
                    .addComponent(athletics))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s5)
                    .addComponent(deception))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s6)
                    .addComponent(history))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s7)
                    .addComponent(insight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s8)
                    .addComponent(intimidation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s9)
                    .addComponent(investigation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s10)
                    .addComponent(medicine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s11)
                    .addComponent(nature))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s12)
                    .addComponent(perception2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s13)
                    .addComponent(performance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s14)
                    .addComponent(persuasion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s15)
                    .addComponent(religion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s16)
                    .addComponent(slightOfHand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s17)
                    .addComponent(stealth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s18)
                    .addComponent(survival))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel16);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        t1.setBackground(new java.awt.Color(255, 255, 255));
        t1.setText("Strength");

        t2.setBackground(new java.awt.Color(255, 255, 255));
        t2.setText("Dexterity");

        t3.setBackground(new java.awt.Color(255, 255, 255));
        t3.setText("Constitution");

        t6.setBackground(new java.awt.Color(255, 255, 255));
        t6.setText("Charisma");

        t4.setBackground(new java.awt.Color(255, 255, 255));
        t4.setText("Intelligence");

        t5.setBackground(new java.awt.Color(255, 255, 255));
        t5.setText("Wisdom");

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
                        .addComponent(t1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srtMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(t2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dexMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(t6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chaMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(t4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(intMod2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(t3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(t5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wisMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1)
                    .addComponent(srtMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2)
                    .addComponent(dexMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t3)
                    .addComponent(conMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t4)
                    .addComponent(intMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t5)
                    .addComponent(wisMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t6)
                    .addComponent(chaMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(215, Short.MAX_VALUE)))
        );

        jButton14.setText("Add Exp");
        jButton14.setEnabled(false);

        jButton15.setText("jButton15");
        jButton15.setEnabled(false);

        jButton16.setText("jButton16");
        jButton16.setEnabled(false);

        nameLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel2.setText("Firstname LastName");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LEVEL INFORMATION");

        jScrollPane4.setBorder(null);
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));

        levelTextArea.setColumns(20);
        levelTextArea.setRows(5);
        levelTextArea.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(levelTextArea);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CLASS INFORMATION");

        jScrollPane5.setBorder(null);
        jScrollPane5.setForeground(new java.awt.Color(255, 255, 255));

        ClassTextArea.setColumns(20);
        ClassTextArea.setRows(5);
        jScrollPane5.setViewportView(ClassTextArea);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel37.setBackground(new java.awt.Color(204, 204, 204));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RACE INFORMATION");

        jScrollPane13.setBorder(null);
        jScrollPane13.setForeground(new java.awt.Color(255, 255, 255));

        RaceTextArea.setColumns(20);
        RaceTextArea.setRows(5);
        jScrollPane13.setViewportView(RaceTextArea);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout statsPanelLayout = new javax.swing.GroupLayout(statsPanel);
        statsPanel.setLayout(statsPanelLayout);
        statsPanelLayout.setHorizontalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14)
                        .addGap(33, 33, 33)
                        .addComponent(jButton16)
                        .addGap(34, 34, 34)
                        .addComponent(jButton15)
                        .addContainerGap())
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))))
        );
        statsPanelLayout.setVerticalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton14)
                        .addComponent(jButton15)
                        .addComponent(jButton16))
                    .addComponent(nameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Statistics", statsPanel);

        spellsPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                spellsPanelComponentShown(evt);
            }
        });

        jPanel51.setBackground(new java.awt.Color(204, 204, 204));

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));

        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("SPELLCASTING ABILITY");

        spellCastingAbilityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spellCastingAbilityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spellCastingAbilityLabel.setText("|");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spellCastingAbilityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(spellCastingAbilityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103))
        );

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));

        spellSaveDC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spellSaveDC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spellSaveDC.setText("00");

        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("SPELL SAVE DC");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spellSaveDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel53Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(spellSaveDC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel112))
        );

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));

        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("SPELL ATTACK BONUS");

        spellAttackBonus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spellAttackBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spellAttackBonus.setText("00");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spellAttackBonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(spellAttackBonus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel105))
        );

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));

        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("SPELLCASTING CLASS");

        spellcastingClassLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spellcastingClassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spellcastingClassLabel.setText("|");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spellcastingClassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(spellcastingClassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102))
        );

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel56.setBackground(new java.awt.Color(204, 204, 204));

        jPanel57.setBackground(new java.awt.Color(255, 255, 255));

        knownSpellList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane21.setViewportView(knownSpellList);

        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("KNOWN SPELLS");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addComponent(jScrollPane21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel106))
        );

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel58.setBackground(new java.awt.Color(204, 204, 204));

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane22.setBorder(null);

        spellLevelList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cantrips", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6", "Level 7", "Level 8", "Level 9" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        spellLevelList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spellLevelList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                spellLevelListValueChanged(evt);
            }
        });
        jScrollPane22.setViewportView(spellLevelList);

        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("SPELL LEVELS");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane22)
            .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel113))
        );

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel60.setBackground(new java.awt.Color(204, 204, 204));

        jPanel61.setBackground(new java.awt.Color(255, 255, 255));

        levelLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        levelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        levelLabel.setText("0");

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(levelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(levelLabel)
                .addContainerGap())
        );

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));

        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("SLOTS EXPENDED");

        slotsExpended.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slotsExpended.setText("00");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slotsExpended, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slotsExpended)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel115))
        );

        jPanel62.setBackground(new java.awt.Color(255, 255, 255));

        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("SLOTS TOTAL");

        slotsTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slotsTotal.setText("00");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slotsTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slotsTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel114))
        );

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel63, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(97, 97, 97))
        );

        spellLookUpPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                spellLookUpPanel1ComponentShown(evt);
            }
        });

        jButton1.setText("Learn Current Spell");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cast Current Spell");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Create Spell");
        jButton3.setEnabled(false);

        removeSpell.setText("Remove Spell");
        removeSpell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSpellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout spellsPanelLayout = new javax.swing.GroupLayout(spellsPanel);
        spellsPanel.setLayout(spellsPanelLayout);
        spellsPanelLayout.setHorizontalGroup(
            spellsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spellsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(spellsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(spellsPanelLayout.createSequentialGroup()
                        .addGroup(spellsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(spellsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(spellsPanelLayout.createSequentialGroup()
                                .addGroup(spellsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(spellsPanelLayout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(removeSpell)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))
                                    .addComponent(spellLookUpPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        spellsPanelLayout.setVerticalGroup(
            spellsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spellsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(spellsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(spellsPanelLayout.createSequentialGroup()
                        .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(spellsPanelLayout.createSequentialGroup()
                        .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(spellsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(removeSpell))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spellLookUpPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Spellcasting", spellsPanel);

        inventoryPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                inventoryPanelComponentShown(evt);
            }
        });

        jPanel25.setBackground(new java.awt.Color(204, 204, 204));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("TREASURES");

        jScrollPane3.setViewportView(treasureList);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel29.setBackground(new java.awt.Color(204, 204, 204));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        itemList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                itemListValueChanged(evt);
            }
        });
        jScrollPane11.setViewportView(itemList);

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("ITEMS");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jScrollPane11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88))
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        newItemButton.setText("New Item");
        newItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemButtonActionPerformed(evt);
            }
        });

        jPanel47.setBackground(new java.awt.Color(204, 204, 204));

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));

        decQuantityButton.setText("-");
        decQuantityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decQuantityButtonActionPerformed(evt);
            }
        });

        jLabel99.setText("Quantity:");

        quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity.setText("000000");

        incQuantityButton.setText("+");
        incQuantityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incQuantityButtonActionPerformed(evt);
            }
        });

        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("DESCRIPTION");

        itemDesc.setColumns(20);
        itemDesc.setRows(5);
        itemDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemDescKeyTyped(evt);
            }
        });
        jScrollPane19.setViewportView(itemDesc);

        itemName.setText("NAME");
        itemName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                itemNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                itemNameFocusLost(evt);
            }
        });
        itemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemNameKeyTyped(evt);
            }
        });

        changeQuantityButton.setText("Change");

        EquipButton.setText("Equip");
        EquipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19)
                    .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(decQuantityButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(incQuantityButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeQuantityButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EquipButton)
                        .addGap(0, 585, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(decQuantityButton)
                        .addComponent(jLabel99)
                        .addComponent(quantity)
                        .addComponent(incQuantityButton))
                    .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(changeQuantityButton)
                        .addComponent(EquipButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101))
        );

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel49.setBackground(new java.awt.Color(204, 204, 204));

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));

        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("EQUIPMENT");

        jScrollPane1.setViewportView(equipedList);

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98))
        );

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton20.setText("Delete Item");

        javax.swing.GroupLayout inventoryPanelLayout = new javax.swing.GroupLayout(inventoryPanel);
        inventoryPanel.setLayout(inventoryPanelLayout);
        inventoryPanelLayout.setHorizontalGroup(
            inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inventoryPanelLayout.createSequentialGroup()
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        inventoryPanelLayout.setVerticalGroup(
            inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventoryPanelLayout.createSequentialGroup()
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                        .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20)))
                .addGap(12, 12, 12))
        );

        jTabbedPane3.addTab("Inventory", inventoryPanel);

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel78.setText("CLASS:");

        jLabel79.setText("RACE:");

        jLabel80.setText("ALIGNMENT:");

        classField.setText("NULL");

        raceField.setText("NULL");

        alignmentField.setText("NULL");

        ageFiled.setText("NULL");

        jLabel81.setText("AGE:");

        jLabel82.setText("HEIGHT:");

        jLabel83.setText("WEIGHT:");

        heightField.setText("NULL");

        weightField.setText("NULL");

        jLabel84.setText("SKIN:");

        jLabel85.setText("HAIR:");

        skinField.setText("NULL");

        eyesField.setText("NULL");

        hairField.setText("NULL");

        jLabel86.setText("EYES:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(raceField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(classField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alignmentField))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(weightField)
                    .addComponent(heightField)
                    .addComponent(ageFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hairField)
                    .addComponent(skinField)
                    .addComponent(eyesField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(eyesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(skinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(hairField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(ageFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel82)
                            .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel78)
                            .addComponent(classField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(raceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel80)
                            .addComponent(alignmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.setBackground(new java.awt.Color(204, 204, 204));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("CHARACTER APPEARANCE");

        characterAppearanceField.setColumns(20);
        characterAppearanceField.setRows(5);
        jScrollPane7.setViewportView(characterAppearanceField);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addComponent(jScrollPane7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel31.setBackground(new java.awt.Color(204, 204, 204));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("ALLIES & ORGANIZATIONS");

        alliesAndOrgs.setColumns(20);
        alliesAndOrgs.setRows(5);
        jScrollPane8.setViewportView(alliesAndOrgs);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane8)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75))
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel35.setBackground(new java.awt.Color(204, 204, 204));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("CHARACTER BACKSTORY");

        characterBackstoryField.setColumns(20);
        characterBackstoryField.setRows(5);
        jScrollPane9.setViewportView(characterBackstoryField);

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane9)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addComponent(jScrollPane9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel76))
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel33.setBackground(new java.awt.Color(204, 204, 204));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("LANGUAGES &  PROFICIENCIES");

        languagesField.setColumns(20);
        languagesField.setRows(5);
        jScrollPane10.setViewportView(languagesField);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addComponent(jScrollPane10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77))
        );

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel87.setText("NAME:");

        nameField.setText("NULL");

        jPanel39.setBackground(new java.awt.Color(204, 204, 204));

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane12.setViewportView(personality);

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("PERSONALITY TRAITS");

        jScrollPane15.setViewportView(ideals);

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("IDEALS");

        jScrollPane16.setViewportView(bonds);

        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("BONDS");

        jScrollPane17.setViewportView(flaws);

        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("FLAWS");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
            .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93))
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Background", bgPanel);

        notesPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                notesPanelComponentShown(evt);
            }
        });

        jPanel41.setBackground(new java.awt.Color(204, 204, 204));

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));

        notesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                notesListValueChanged(evt);
            }
        });
        jScrollPane14.setViewportView(notesList);

        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("Notes");

        newNote.setText("New Note");
        newNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
            .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(newNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90))
        );

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel67.setBackground(new java.awt.Color(204, 204, 204));

        jPanel68.setBackground(new java.awt.Color(255, 255, 255));

        deleteNoteButtol.setText("Delete Note");
        deleteNoteButtol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNoteButtolActionPerformed(evt);
            }
        });

        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel139.setText("DESCRIPTION");

        noteText.setColumns(20);
        noteText.setRows(5);
        noteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noteTextKeyTyped(evt);
            }
        });
        jScrollPane23.setViewportView(noteText);

        noteName.setText("NAME");
        noteName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                noteNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                noteNameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addComponent(noteName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 867, Short.MAX_VALUE)
                        .addComponent(deleteNoteButtol)))
                .addContainerGap())
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noteName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteNoteButtol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel139))
        );

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout notesPanelLayout = new javax.swing.GroupLayout(notesPanel);
        notesPanel.setLayout(notesPanelLayout);
        notesPanelLayout.setHorizontalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        notesPanelLayout.setVerticalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesPanelLayout.createSequentialGroup()
                .addGroup(notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Notes", notesPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void characterListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_characterListValueChanged
        
        if(playerActiveChar != null){
            UpdatePlayerCharacter();
            Data.IO.SaveCharacterSheet(playerActiveChar);
        }
        
        String name = characterList.getSelectedValue();
        if(name != null){
            System.out.println("UI.Main.characterListValueChanged()");
            System.out.println("name = " + name);
            SetPlayerCharacter(
                Data.IO.LoadCharacterSheet(Data.IO.sheetDir+"/"+name+".ser"));

        }
    }//GEN-LAST:event_characterListValueChanged

    private void newCharacterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCharacterButtonActionPerformed
        
        NewCharacter nc = new NewCharacter();
        nc.setVisible(true);
        nc.setLocationRelativeTo(null);
        nc.returnTo  = this;
        if(playerActiveChar != null){
            System.out.println("player isnt null");
            UpdatePlayerCharacter();
            Data.IO.SaveCharacterSheet(playerActiveChar);
        }
        playerActiveChar = new Data.CharacterSheet();
    }//GEN-LAST:event_newCharacterButtonActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        
    }//GEN-LAST:event_s2ActionPerformed

    private void newItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemButtonActionPerformed
        
        playerActiveChar.inventory.counter++;
        playerActiveChar.inventory.Add("New Item"+playerActiveChar.inventory.counter);
        itemList.setModel(PopulateItems());
        /*
        int in = 0;
        for(int i = 0; i < itemList.getModel().getSize(); i++)
            if(itemList.getModel().getElementAt(i).compareTo("New Item") == 0)
                in = i;
        itemList.setSelectedIndex(in);*/
    }//GEN-LAST:event_newItemButtonActionPerformed

    private void incQuantityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incQuantityButtonActionPerformed
        
        int i = Integer.parseInt(quantity.getText());
        if(i < 999999)
            i++;
        playerActiveChar.inventory.current.quantity = i;
        quantity.setText(i+"");
    }//GEN-LAST:event_incQuantityButtonActionPerformed

    private void EquipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipButtonActionPerformed
        
    }//GEN-LAST:event_EquipButtonActionPerformed
    
    private void deleteNoteButtolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNoteButtolActionPerformed
        
        playerActiveChar.notes.remove(playerActiveChar.notes.current);
        noteName.setText("");
        noteText.setText("");
        notesList.setModel(PopulateNotes());
    }//GEN-LAST:event_deleteNoteButtolActionPerformed

    private void newNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNoteActionPerformed
        
        if (playerActiveChar.notes == null) {
            playerActiveChar.notes = new Notes();
        }
        Notes.counter++;
        playerActiveChar.notes.add("New Note"+Notes.counter, "Test");
        noteName.setText("New Note"+Notes.counter);
        noteText.setText(playerActiveChar.notes.getText("New Note"+Notes.counter));
        notesList.setModel(PopulateNotes());
    }//GEN-LAST:event_newNoteActionPerformed

    private void noteNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noteNameFocusGained
        
        playerActiveChar.notes.current = noteName.getText();
    }//GEN-LAST:event_noteNameFocusGained

    private void noteNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noteNameFocusLost
        
        playerActiveChar.notes.rename(playerActiveChar.notes.current, noteName.getText());
        playerActiveChar.notes.current = noteName.getText();
        notesList.setModel(PopulateNotes());
    }//GEN-LAST:event_noteNameFocusLost

    private void notesPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_notesPanelComponentShown
        
        if (playerActiveChar.notes == null) {
            playerActiveChar.notes = new Notes();
        }
        notesList.setModel(PopulateNotes());
    }//GEN-LAST:event_notesPanelComponentShown

    private void notesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_notesListValueChanged
        
        playerActiveChar.notes.current = notesList.getSelectedValue();
        noteName.setText(playerActiveChar.notes.current);
        noteText.setText(playerActiveChar.notes.getText(playerActiveChar.notes.current));
    }//GEN-LAST:event_notesListValueChanged

    private void noteTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noteTextKeyTyped
        
        playerActiveChar.notes.update(playerActiveChar.notes.current, noteText.getText());
    }//GEN-LAST:event_noteTextKeyTyped

    private void inventoryPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_inventoryPanelComponentShown
        
        itemList.setModel(PopulateItems());
    }//GEN-LAST:event_inventoryPanelComponentShown

    private void itemListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_itemListValueChanged
        
        System.out.println("UI.PlayerSheet.itemListValueChanged()");
        System.out.println("item list selected value = "+itemList.getSelectedValue());
        if(itemList.getSelectedValue() == null){ 
            int index = 0;
            if(itemOldName != null){
                for(int i = 0; i < itemList.getModel().getSize(); i++){
                    if(itemOldName.compareTo(itemList.getModel().getElementAt(i)) == 0)
                            index = i;
                }
                
                itemList.setSelectionInterval(index, index);
                playerActiveChar.inventory.current = playerActiveChar.inventory.Find(itemList.getSelectedValue());
                itemDesc.setText(playerActiveChar.inventory.current.desc);
                itemName.setText(playerActiveChar.inventory.current.name);
                quantity.setText(playerActiveChar.inventory.current.quantity+"");
                return;
            }
            itemDesc.setText("");
            itemName.setText("");
            quantity.setText("0");
            return;}
        playerActiveChar.inventory.current = playerActiveChar.inventory.Find(itemList.getSelectedValue());
        itemDesc.setText(playerActiveChar.inventory.current.desc);
        itemName.setText(playerActiveChar.inventory.current.name);
        quantity.setText(playerActiveChar.inventory.current.quantity+"");
    }//GEN-LAST:event_itemListValueChanged

    private void decQuantityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decQuantityButtonActionPerformed
        
        int i = Integer.parseInt(quantity.getText());
        if(i > 0)
            i--;
        playerActiveChar.inventory.current.quantity = i;
        quantity.setText(i+"");
        
    }//GEN-LAST:event_decQuantityButtonActionPerformed

    private void itemDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemDescKeyTyped
        
        playerActiveChar.inventory.current.desc = itemDesc.getText();
    }//GEN-LAST:event_itemDescKeyTyped

    private void itemNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemNameKeyTyped
        
        playerActiveChar.inventory.current.name = itemName.getText();
    }//GEN-LAST:event_itemNameKeyTyped

    private void itemNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemNameFocusGained
        
        itemOldName = itemName.getText();
    }//GEN-LAST:event_itemNameFocusGained

    private void itemNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemNameFocusLost
        
        System.out.println("UI.PlayerSheet.itemNameFocusLost()");
        System.out.println("oldName = "+itemOldName);
        playerActiveChar.inventory.current.name = itemName.getText();
        System.out.println("newName = "+playerActiveChar.inventory.current.name);
        
        playerActiveChar.inventory.Update(itemOldName);
        itemOldName = playerActiveChar.inventory.current.name;
        itemList.setModel(PopulateItems());
    }//GEN-LAST:event_itemNameFocusLost
 
    private void overviewPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_overviewPanelComponentShown
        
        //ImageIcon i = new ImageIcon(getClass().getResource("/resources/bigmap.png"));
        //ImageIcon ii = new ImageIcon(getScaledImage(i.getImage(), jScrollPane6.getWidth(), jScrollPane6.getHeight()));
        //jLabel10.setIcon(i);
        characterList.setModel(PopulatePlayerCharacters());
    }//GEN-LAST:event_overviewPanelComponentShown

    private void spellLookUpPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_spellLookUpPanel1ComponentShown
        
        
    }//GEN-LAST:event_spellLookUpPanel1ComponentShown

    private void spellsPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_spellsPanelComponentShown
        
        spellLookUpPanel1.UpdateSpellList();
        //playerActiveChar
        spellcastingClassLabel.setText(playerActiveChar.classs);
        String ability = "";
        switch(playerActiveChar.classs){
            case "Barbarian":
                ability = "None";
                break;
            case "Bard":
                ability = "Charisma";
                break;
            case "Cleric":
                ability = "Wisdom";
                break;    
            case "Dragonborn":
                ability = "Constitution";
                break;
            case "Druid":
                ability = "Wisdom";
                break;
            case "Fighter":
                ability = "Intelligence";
                break;
            case "High Elf":
                ability = "Intelligence";
                break;
            case "Monk":
                ability = "Wisdom";
                break;
            case "Paladin":
                ability = "Charisma";
                break;
            case "Ranger":
                ability = "Wisdom";
                break;
            case "Rouge":
                ability = "Intelligence";
                break;
            case "Sorcerer":
                ability = "Charisma";
                break;
            case "Warlock":
                ability = "Charisma";
                break;
            case "Wizard":
                ability = "Intelligence";
                break;
            default:
                ability = "None";    
        }
        spellCastingAbilityLabel.setText(ability);
        
        switch(ability){
            case "Charisma":
                spellAttackBonus.setText("+"+(CalcModValue(playerActiveChar.charisma)+playerActiveChar.proficiency));
                spellSaveDC.setText("+"+(8+CalcModValue(playerActiveChar.charisma)+playerActiveChar.proficiency));
                break;
            case "Intelligence":
                spellAttackBonus.setText("+"+(CalcModValue(playerActiveChar.intelligence)+playerActiveChar.proficiency));
                spellSaveDC.setText("+"+(8+CalcModValue(playerActiveChar.intelligence)+playerActiveChar.proficiency));
                break;
            case "Wisdom":
                spellAttackBonus.setText("+"+(CalcModValue(playerActiveChar.wisdom)+playerActiveChar.proficiency));
                spellSaveDC.setText("+"+(8+CalcModValue(playerActiveChar.wisdom)+playerActiveChar.proficiency));
                break;
            case "Constitution":
                spellAttackBonus.setText("+"+(CalcModValue(playerActiveChar.constitution)+playerActiveChar.proficiency));
                spellSaveDC.setText("+"+(8+CalcModValue(playerActiveChar.constitution)+playerActiveChar.proficiency));
                break;
            case "Dexterity":
                spellAttackBonus.setText("+"+(CalcModValue(playerActiveChar.dexterity)+playerActiveChar.proficiency));
                spellSaveDC.setText("+"+(8+CalcModValue(playerActiveChar.dexterity)+playerActiveChar.proficiency));
                break;
            case "Strength":
                spellAttackBonus.setText("+"+(CalcModValue(playerActiveChar.strength)+playerActiveChar.proficiency));
                spellSaveDC.setText("+"+(8+CalcModValue(playerActiveChar.strength)+playerActiveChar.proficiency));
                break;
            
        }  
        
        
    }//GEN-LAST:event_spellsPanelComponentShown

    private void spellLevelListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_spellLevelListValueChanged
        
        String levelName = spellLevelList.getSelectedValue();
        switch(levelName){
            case "Cantrips":
                SetSpellLevelInfo(0);
                break;
            case "Level 1":
                SetSpellLevelInfo(1);
                break;
            case "Level 2":
                SetSpellLevelInfo(2);
                break;
            case "Level 3":
                SetSpellLevelInfo(3);
                break;
            case "Level 4":
                SetSpellLevelInfo(4);
                break;
            case "Level 5":
                SetSpellLevelInfo(5);
                break;
            case "Level 6":
                SetSpellLevelInfo(6);
                break;
            case "Level 7":
                SetSpellLevelInfo(7);
                break;
            case "Level 8":
                SetSpellLevelInfo(8);
                break;
            case "Level 9":
                SetSpellLevelInfo(9);
                break;
            
        }
        
        
        
    }//GEN-LAST:event_spellLevelListValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Data.Spell s = spellLookUpPanel1.GetCurrentSpell();
        if (s == null || playerActiveChar == null) {
            return;
        }
        /*
        boolean sameClass = false;
        for(int i = 0; i < s.classes.size(); i++){
            if(s.classes.get(i).name.compareTo(playerActiveChar.classs) == 0)
                sameClass = true;
        }
        if(!sameClass)
            return;
        */
        switch(s.level){
            case 0:
                /*if the player hasnt learned all the spells fo rthat level, add it
                */
                if(playerActiveChar.levelSlotsTotalCantrips > playerActiveChar.cantrips.size()){
                    playerActiveChar.cantrips.add(s);
                    SetSpellLevelInfo(0);
                }
                break;
            case 1:
                if(playerActiveChar.levelSlotsTotal1 > playerActiveChar.level1.size()){
                    playerActiveChar.level1.add(s);
                    SetSpellLevelInfo(1);
                }
                break;
            case 2:
                if(playerActiveChar.levelSlotsTotal2 > playerActiveChar.level2.size()){
                    playerActiveChar.level2.add(s);
                    SetSpellLevelInfo(2);
                }
                break;
            case 3:
                if(playerActiveChar.levelSlotsTotal3 > playerActiveChar.level3.size()){
                    playerActiveChar.level3.add(s);
                    SetSpellLevelInfo(3);
                }
                break;
            case 4:
                if(playerActiveChar.levelSlotsTotal4 > playerActiveChar.level4.size()){
                    playerActiveChar.level4.add(s);
                    SetSpellLevelInfo(4);
                }
                break;
            case 5:
                if(playerActiveChar.levelSlotsTotal5 > playerActiveChar.level5.size()){
                    playerActiveChar.level5.add(s);
                    SetSpellLevelInfo(5);
                }
                break;
            case 6:
                if(playerActiveChar.levelSlotsTotal6 > playerActiveChar.level6.size()){
                    playerActiveChar.level6.add(s);
                    SetSpellLevelInfo(6);
                }
                break;
            case 7:
                if(playerActiveChar.levelSlotsTotal7 > playerActiveChar.level7.size()){
                    playerActiveChar.level7.add(s);
                    SetSpellLevelInfo(7);
                }
                break;
            case 8:
                if(playerActiveChar.levelSlotsTotal8 > playerActiveChar.level8.size()){
                    playerActiveChar.level8.add(s);
                    SetSpellLevelInfo(8);
                }
                break;
            case 9:
                if(playerActiveChar.levelSlotsTotal9 > playerActiveChar.level9.size()){
                    playerActiveChar.level9.add(s);
                    SetSpellLevelInfo(9);
                }
                break;
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int i = spellLookUpPanel1.GetCurrentSpell().level;
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if(playerActiveChar  == null)
            return;
        if(playerActiveChar.strength > 0)
            playerActiveChar.strength--;
        strValue.setText(playerActiveChar.strength+"");
        SetPlayerCharacter(playerActiveChar);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        if(playerActiveChar  == null)
            return;
        if(playerActiveChar.strength < 50)
            playerActiveChar.strength++;
        strValue.setText(playerActiveChar.strength+"");
        SetPlayerCharacter(playerActiveChar);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        if(playerActiveChar  == null)
            return;
        if(playerActiveChar.dexterity > 0)
            playerActiveChar.dexterity--;
        dexValue.setText(playerActiveChar.dexterity+"");
        SetPlayerCharacter(playerActiveChar);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        if(playerActiveChar  == null)
            return;
        if(playerActiveChar.dexterity < 50)
            playerActiveChar.dexterity++;
        dexValue.setText(playerActiveChar.dexterity+"");
        SetPlayerCharacter(playerActiveChar);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        if(playerActiveChar  == null)
            return;
        if(playerActiveChar.constitution > 0)
            playerActiveChar.constitution--;
        conValue.setText(playerActiveChar.constitution+"");
        SetPlayerCharacter(playerActiveChar);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        
        if(playerActiveChar  == null)
            return;
        if(playerActiveChar.constitution <50)
            playerActiveChar.constitution++;
        conValue.setText(playerActiveChar.constitution+"");
        SetPlayerCharacter(playerActiveChar);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        
        if(playerActiveChar  == null)
            return;
        if(playerActiveChar.intelligence > 0)
            playerActiveChar.intelligence--;
        intValue.setText(playerActiveChar.intelligence+"");
        SetPlayerCharacter(playerActiveChar);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        if(playerActiveChar  == null)
            return;
        if(playerActiveChar.intelligence < 50)
            playerActiveChar.intelligence++;
        intValue.setText(playerActiveChar.intelligence+"");
        SetPlayerCharacter(playerActiveChar);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        if(playerActiveChar  == null)
            return;
        if(playerActiveChar.wisdom > 0)
            playerActiveChar.wisdom--;
        wisValue.setText(playerActiveChar.wisdom+"");
        SetPlayerCharacter(playerActiveChar);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        if(playerActiveChar  == null)
            return;
        if(playerActiveChar.wisdom <50)
            playerActiveChar.wisdom++;
        wisValue.setText(playerActiveChar.wisdom+"");
        SetPlayerCharacter(playerActiveChar);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
        if(playerActiveChar  == null)
            return;
        if(playerActiveChar.charisma > 0)
            playerActiveChar.charisma--;
        chaValue.setText(playerActiveChar.charisma+"");
        SetPlayerCharacter(playerActiveChar);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        
        if(playerActiveChar  == null)
            return;
        if(playerActiveChar.charisma <50)
            playerActiveChar.charisma++;
        chaValue.setText(playerActiveChar.charisma+"");
        SetPlayerCharacter(playerActiveChar);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void armorClassVal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armorClassVal1ActionPerformed
        
    }//GEN-LAST:event_armorClassVal1ActionPerformed

    private void hitPointsCurrent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitPointsCurrent1ActionPerformed
        
    }//GEN-LAST:event_hitPointsCurrent1ActionPerformed

    private void initiativeVal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initiativeVal1ActionPerformed
        
    }//GEN-LAST:event_initiativeVal1ActionPerformed

    private void hitPointsTemp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitPointsTemp1ActionPerformed
        
    }//GEN-LAST:event_hitPointsTemp1ActionPerformed

    private void hitPointsMax1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitPointsMax1ActionPerformed
        
    }//GEN-LAST:event_hitPointsMax1ActionPerformed

    private void removeSpellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSpellActionPerformed
        
        spellLookUpPanel1.SetCurrentSpell(knownSpellList.getSelectedValue());   
        Data.Spell s = spellLookUpPanel1.GetCurrentSpell();
        if (s == null || playerActiveChar == null) {
            return;
        }
        boolean sameClass = false;
        for(int i = 0; i < s.classes.size(); i++){
            if(s.classes.get(i).name.compareTo(playerActiveChar.classs) == 0)
                sameClass = true;
        }
        if(!sameClass)
            return;
        switch(s.level){
            case 0:
                /*if the player hasnt learned all the spells fo rthat level, remove it
                */
                //if(playerActiveChar.levelSlotsTotalCantrips > playerActiveChar.cantrips.size()){
                    playerActiveChar.cantrips.remove(s);
                    SetSpellLevelInfo(0);
                //}
                break;
            case 1:
                //if(playerActiveChar.levelSlotsTotal1 > playerActiveChar.level1.size()){
                    playerActiveChar.level1.remove(s);
                    SetSpellLevelInfo(1);
                //}
                break;
            case 2:
                //if(playerActiveChar.levelSlotsTotal2 > playerActiveChar.level2.size()){
                    playerActiveChar.level2.remove(s);
                    SetSpellLevelInfo(2);
                //}
                break;
            case 3:
                //if(playerActiveChar.levelSlotsTotal3 > playerActiveChar.level3.size()){
                    playerActiveChar.level3.remove(s);
                    SetSpellLevelInfo(3);
                //}
                break;
            case 4:
                //if(playerActiveChar.levelSlotsTotal4 > playerActiveChar.level4.size()){
                    playerActiveChar.level4.remove(s);
                    SetSpellLevelInfo(4);
                //}
                break;
            case 5:
                //if(playerActiveChar.levelSlotsTotal5 > playerActiveChar.level5.size()){
                    playerActiveChar.level5.remove(s);
                    SetSpellLevelInfo(5);
                //}
                break;
            case 6:
                //if(playerActiveChar.levelSlotsTotal6 > playerActiveChar.level6.size()){
                    playerActiveChar.level6.remove(s);
                    SetSpellLevelInfo(6);
                //}
                break;
            case 7:
                //if(playerActiveChar.levelSlotsTotal7 > playerActiveChar.level7.size()){
                    playerActiveChar.level7.remove(s);
                    SetSpellLevelInfo(7);
                //}
                break;
            case 8:
                //if(playerActiveChar.levelSlotsTotal8 > playerActiveChar.level8.size()){
                    playerActiveChar.level8.remove(s);
                    SetSpellLevelInfo(8);
                //}
                break;
            case 9:
                //if(playerActiveChar.levelSlotsTotal9 > playerActiveChar.level9.size()){
                    playerActiveChar.level9.remove(s);
                    SetSpellLevelInfo(9);
               // }
                break;
            
        }
    }//GEN-LAST:event_removeSpellActionPerformed

    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
        
        System.out.println("UI.PlayerSheet.expActionPerformed()");
        if(playerActiveChar == null)
            return;
        playerActiveChar.experience = Integer.parseInt(exp.getText());
        playerActiveChar.level = CalcLevelFromExp(Integer.parseInt(exp.getText()));
        expProgressBar.setValue(playerActiveChar.experience);
        expProgressBar.setMaximum(CalcExpNeededToLevel(playerActiveChar.level+1));
        nextLevel.setText((playerActiveChar.level+1)+"");
    }//GEN-LAST:event_expActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        
        if(playerActiveChar == null){
            System.out.println("player null");
            return;
        }
        System.out.println("Deleting: "+Data.IO.sheetDir+"/"+playerActiveChar.name+".ser");
        Data.IO.DeleteFile(Data.IO.sheetDir+"/"+playerActiveChar.name+".ser");
        playerActiveChar = null;
        characterList.setModel(PopulatePlayerCharacters());
        SetPlayerCharacter(null);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void newAbilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAbilityButtonActionPerformed
        
        NewAbility na = new NewAbility();
        na.setVisible(true);
        na.setLocationRelativeTo(null);
        na.returnTo = this;
    }//GEN-LAST:event_newAbilityButtonActionPerformed

    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arcana;
    private javax.swing.JTextArea ClassTextArea;
    private javax.swing.JToggleButton EquipButton;
    private javax.swing.JTextArea RaceTextArea;
    private javax.swing.JList<String> abilityList;
    private javax.swing.JPanel acPanel1;
    private javax.swing.JPanel acPanel2;
    private javax.swing.JPanel acPanel3;
    private javax.swing.JLabel acrobatics;
    private javax.swing.JTextField ageFiled;
    private javax.swing.JTextField alignmentField;
    private javax.swing.JTextArea alliesAndOrgs;
    private javax.swing.JLabel animalHandling;
    private javax.swing.JFormattedTextField armorClassVal1;
    private javax.swing.JLabel athletics;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JEditorPane bonds;
    private javax.swing.JLabel chaMod;
    private javax.swing.JLabel chaMod2;
    private javax.swing.JLabel chaValue;
    private javax.swing.JButton changeQuantityButton;
    private javax.swing.JTextArea characterAppearanceField;
    private javax.swing.JTextArea characterBackstoryField;
    private javax.swing.JList<String> characterList;
    private javax.swing.JTextField classField;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel classLabel2;
    private javax.swing.JLabel conMod;
    private javax.swing.JLabel conMod2;
    private javax.swing.JLabel conValue;
    private javax.swing.JButton decQuantityButton;
    private javax.swing.JLabel deception;
    private javax.swing.JButton deleteNoteButtol;
    private javax.swing.JLabel dexMod;
    private javax.swing.JLabel dexMod2;
    private javax.swing.JLabel dexValue;
    private javax.swing.JList<String> equipedList;
    private javax.swing.JFormattedTextField exp;
    private javax.swing.JProgressBar expProgressBar;
    private javax.swing.JTextField eyesField;
    private javax.swing.JLabel faliures;
    private javax.swing.JEditorPane flaws;
    private javax.swing.JTextField hairField;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel history;
    private javax.swing.JTextField hitDice1;
    private javax.swing.JLabel hitDiceTotal;
    private javax.swing.JFormattedTextField hitPointsCurrent1;
    private javax.swing.JFormattedTextField hitPointsMax1;
    private javax.swing.JFormattedTextField hitPointsTemp1;
    private javax.swing.JEditorPane ideals;
    private javax.swing.JButton incQuantityButton;
    private javax.swing.JFormattedTextField initiativeVal1;
    private javax.swing.JLabel insight;
    private javax.swing.JLabel intMod;
    private javax.swing.JLabel intMod2;
    private javax.swing.JLabel intValue;
    private javax.swing.JLabel intimidation;
    private javax.swing.JLabel intpiration;
    private javax.swing.JPanel inventoryPanel;
    private javax.swing.JLabel investigation;
    private javax.swing.JTextArea itemDesc;
    private javax.swing.JList<String> itemList;
    private javax.swing.JTextField itemName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel364;
    private javax.swing.JLabel jLabel366;
    private javax.swing.JLabel jLabel368;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JList<String> knownSpellList;
    private javax.swing.JTextArea languagesField;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextArea levelTextArea;
    private javax.swing.JLabel medicine;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nature;
    private javax.swing.JButton newAbilityButton;
    private javax.swing.JButton newCharacterButton;
    private javax.swing.JButton newItemButton;
    private javax.swing.JButton newNote;
    private javax.swing.JLabel nextLevel;
    private javax.swing.JTextField noteName;
    private javax.swing.JTextArea noteText;
    private javax.swing.JList<String> notesList;
    private javax.swing.JPanel notesPanel;
    private javax.swing.JLabel ovEXP;
    private javax.swing.JLabel ovHitPoints;
    private javax.swing.JLabel ovNextLevel;
    private javax.swing.JProgressBar ovProgressBar;
    private javax.swing.JPanel overviewPanel;
    private javax.swing.JLabel perception;
    private javax.swing.JLabel perception2;
    private javax.swing.JLabel performance;
    private javax.swing.JEditorPane personality;
    private javax.swing.JLabel persuasion;
    private javax.swing.JLabel proficiency;
    private javax.swing.JLabel quantity;
    private javax.swing.JTextField raceField;
    private javax.swing.JLabel raceLabel;
    private javax.swing.JLabel raceLabel2;
    private javax.swing.JLabel religion;
    private javax.swing.JButton removeSpell;
    private javax.swing.JRadioButton s1;
    private javax.swing.JRadioButton s10;
    private javax.swing.JRadioButton s11;
    private javax.swing.JRadioButton s12;
    private javax.swing.JRadioButton s13;
    private javax.swing.JRadioButton s14;
    private javax.swing.JRadioButton s15;
    private javax.swing.JRadioButton s16;
    private javax.swing.JRadioButton s17;
    private javax.swing.JRadioButton s18;
    private javax.swing.JRadioButton s2;
    private javax.swing.JRadioButton s3;
    private javax.swing.JRadioButton s4;
    private javax.swing.JRadioButton s5;
    private javax.swing.JRadioButton s6;
    private javax.swing.JRadioButton s7;
    private javax.swing.JRadioButton s8;
    private javax.swing.JRadioButton s9;
    private javax.swing.JTextField skinField;
    private javax.swing.JLabel slightOfHand;
    private javax.swing.JLabel slotsExpended;
    private javax.swing.JLabel slotsTotal;
    private javax.swing.JTextField speedVal1;
    private javax.swing.JLabel spellAttackBonus;
    private javax.swing.JLabel spellCastingAbilityLabel;
    private javax.swing.JList<String> spellLevelList;
    private UI.SpellLookUpPanel spellLookUpPanel1;
    private javax.swing.JLabel spellSaveDC;
    private javax.swing.JLabel spellcastingClassLabel;
    private javax.swing.JPanel spellsPanel;
    private javax.swing.JLabel srtMod2;
    private javax.swing.JPanel statsPanel;
    private javax.swing.JLabel stealth;
    private javax.swing.JLabel strMod;
    private javax.swing.JPanel strPanel;
    private javax.swing.JPanel strPanel1;
    private javax.swing.JPanel strPanel2;
    private javax.swing.JPanel strPanel3;
    private javax.swing.JPanel strPanel4;
    private javax.swing.JPanel strPanel5;
    private javax.swing.JLabel strValue;
    private javax.swing.JLabel successes;
    private javax.swing.JLabel survival;
    private javax.swing.JRadioButton t1;
    private javax.swing.JRadioButton t2;
    private javax.swing.JRadioButton t3;
    private javax.swing.JRadioButton t4;
    private javax.swing.JRadioButton t5;
    private javax.swing.JRadioButton t6;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JList<String> treasureList;
    private javax.swing.JTextField weightField;
    private javax.swing.JLabel wisMod;
    private javax.swing.JLabel wisMod2;
    private javax.swing.JLabel wisValue;
    // End of variables declaration//GEN-END:variables
}
