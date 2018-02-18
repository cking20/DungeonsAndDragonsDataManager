/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author chrisrk192
 */
public class CharacterSheet extends Monster implements Serializable{
    public int level;
    public int experience;
    public String race;
    public String classs;
    public int inspiration;
    public int initiative;
    public int proficiency;
    public int temp_hit_points;
    public int deathSaveSucs;
    public int deathSaveFail;
    public int currentHitPoints;
    //spell stuff
    public String spellcasting_class;
    public String spellcasting_ability;
    public int spell_save_dc;
    public int spell_attack_bonus;
    public int levelSlotsTotalCantrips; public int levelSlotsLeftCantrips;
    public int levelSlotsTotal1; public int levelSlotsLeft1;
    public int levelSlotsTotal2; public int levelSlotsLeft2;
    public int levelSlotsTotal3; public int levelSlotsLeft3;
    public int levelSlotsTotal4; public int levelSlotsLeft4;
    public int levelSlotsTotal5; public int levelSlotsLeft5;
    public int levelSlotsTotal6; public int levelSlotsLeft6;
    public int levelSlotsTotal7; public int levelSlotsLeft7;
    public int levelSlotsTotal8; public int levelSlotsLeft8;
    public int levelSlotsTotal9; public int levelSlotsLeft9;
    
    public ArrayList<Spell> cantrips;
    public ArrayList<Spell> level1;
    public ArrayList<Spell> level2;
    public ArrayList<Spell> level3;
    public ArrayList<Spell> level4;
    public ArrayList<Spell> level5;
    public ArrayList<Spell> level6;
    public ArrayList<Spell> level7;
    public ArrayList<Spell> level8;
    public ArrayList<Spell> level9;
            
    //Background stuff
    public String age; 
    public String height; 
    public String weight; 
    public String eyes; 
    public String skin; 
    public String hair; 
    public String characterApperance; 
    public String characterBacktrory; 
    public String alliesAndOrgs; 
    public String proficiencies; 
    public String personality; 
    public String flaws; 
    public String ideals; 
    public String bonds; 
    
    //inventory stuff
    public Inventory inventory;
    
    //Notes Stuff
    public Notes notes;
    
    public boolean [] selected_profs;
    public boolean [] selected_saving;
    
    
    public CharacterSheet(){
        currentHitPoints = hit_points;
        level = 1;
        experience = 0;
        race = "";
        classs = "";
        inspiration = 0;
        initiative = 0;
        proficiency = 0;
        temp_hit_points = 0;
        deathSaveSucs = 0;
        deathSaveFail = 0;

        //spell stuff
        spellcasting_class = "";
        spellcasting_ability = "";
        spell_save_dc = 0;
        spell_attack_bonus = 0;
        levelSlotsTotalCantrips = 0; levelSlotsLeftCantrips = 0;
        levelSlotsTotal1 = 0; levelSlotsLeft1 = 0;
        levelSlotsTotal2 = 0; levelSlotsLeft2 = 0;
        levelSlotsTotal3 = 0; levelSlotsLeft3 = 0;
        levelSlotsTotal4 = 0; levelSlotsLeft4 = 0;
        levelSlotsTotal5 = 0; levelSlotsLeft5 = 0;
        levelSlotsTotal6 = 0; levelSlotsLeft6 = 0;
        levelSlotsTotal7 = 0; levelSlotsLeft7 = 0;
        levelSlotsTotal8 = 0; levelSlotsLeft8 = 0;
        levelSlotsTotal9 = 0; levelSlotsLeft9 = 0;

        cantrips = new ArrayList<>();
        level1 = new ArrayList<>();
        level2 = new ArrayList<>();
        level3 = new ArrayList<>();
        level4 = new ArrayList<>();
        level5 = new ArrayList<>();
        level6 = new ArrayList<>();
        level7 = new ArrayList<>();
        level8 = new ArrayList<>();
        level9 = new ArrayList<>();

        //Background stuff
        age = ""; 
        height = ""; 
        weight = ""; 
        eyes = ""; 
        skin = ""; 
        hair = ""; 
        characterApperance = ""; 
        characterBacktrory = ""; 
        alliesAndOrgs = ""; 
        proficiencies = ""; 
        personality = ""; 
        flaws = ""; 
        ideals = ""; 
        bonds = ""; 
        
        id = "";// 592f6c32c9e7ce9f72157fce,
        index = 0;// 3,
        name = "";// Adult Black Dragon,
        size = "";// Huge,
        type = "";// dragon,
        subtype = "";// ,
        alignment = "";// chaotic evil,
        armor_class = 0;// 19,
        hit_points = 0;// 195,
        hit_dice = "";// 17d12,
        speed = "0 ft.";// 4"" ft., fly 8"" ft., swim 4"" ft.,
        strength = 0;// 23,
        dexterity = 0;// 14,
        constitution = 0;// 21,
        intelligence = 0;// 14,
        wisdom = 0;// 13,
        charisma = 0;// 17,
        strength_save = 0;
        dexterity_save = 0;// 7,
        constitution_save = 0;// 10,
        intelligence_save = 0;
        wisdom_save = 0;// 6,
        charisma_save = 0;// 8,
        deception = 0;
        insight = 0;
        perception = 0;// 11,
        stealth = 0;// 7,
        damage_vulnerabilities = "";// ,
        damage_resistances = "";// ,
        damage_immunities = "";// acid,
        condition_immunities = "";// ,
        senses = "";// blindsight 6"" ft., darkvision 12"" ft., passive Perception 21,
        languages = "";// Common, Draconic,
        challenge_rating = 0;// 14,
        special_abilities = new ArrayList<>();
        actions = new ArrayList<>();
        legendary_actions = new ArrayList<>();
        url = "";
        
        notes = new Notes();
        inventory = new Inventory();
        
        
        selected_profs = new boolean[18];
        selected_saving = new boolean[6];
    }
    
    public static CharacterSheet TransformCharacterSheet(Monster m){
        CharacterSheet c = new CharacterSheet();
        c.id = m.id;// 592f6c32c9e7ce9f72157fce,
        c.index = m.index;// 3,
        c.name = m.name;// Adult Black Dragon,
        c.size = m.size;// Huge,
        c.type = m.type;// dragon,
        c.subtype = m.subtype;// ,
        c.alignment = m.alignment;// chaotic evil,
        c.armor_class = m.armor_class;// 19,
        c.hit_points = m.hit_points;// 195,
        c.hit_dice = m.hit_dice;// 17d12,
        c.speed = m.speed;// 40 ft., fly 80 ft., swim 40 ft.,
        c.strength = m.strength;// 23,
        c.dexterity = m.dexterity;// 14,
        c.constitution = m.constitution;// 21,
        c.intelligence = m.intelligence;// 14,
        c.wisdom = m.wisdom;// 13,
        c.charisma = m.charisma;// 17,
        c.strength_save = m.strength_save;
        c.dexterity_save = m.dexterity_save;// 7,
        c.constitution_save = m.constitution_save;// 10,
        c.intelligence_save = m.intelligence_save;
        c.wisdom_save = m.wisdom_save;// 6,
        c.charisma_save = m.charisma_save;// 8,
        c.deception = m.deception;
        c.insight = m.insight;
        c.perception = m.perception;// 11,
        c.stealth = m.stealth;// 7,
        c.damage_vulnerabilities = m.damage_vulnerabilities;// ,
        c.damage_resistances = m.damage_resistances;// ,
        c.damage_immunities = m.damage_immunities;// acid,
        c.condition_immunities = m.condition_immunities;// ,
        c.senses = m.senses;// blindsight 60 ft., darkvision 120 ft., passive Perception 21,
        c.languages = m.languages;// Common, Draconic,
        c.challenge_rating = m.challenge_rating;// 14,
        c.special_abilities = m.special_abilities;
        c.actions = m.actions;
        c.legendary_actions = m.legendary_actions;
        c.url = m.url;
        c.experience = (int)UI.MonsterSheet.CalcExpFromLevel(m.challenge_rating);
        
        
        
        return c;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
