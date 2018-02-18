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
public class Monster implements Serializable{
    public String id;// 592f6c32c9e7ce9f72157fce,
    public int index;// 3,
    public String name;// Adult Black Dragon,
    public String size;// Huge,
    public String type;// dragon,
    public String subtype;// ,
    public String alignment;// chaotic evil,
    public int armor_class;// 19,
    public int hit_points;// 195,
    public String hit_dice;// 17d12,
    public String speed;// 40 ft., fly 80 ft., swim 40 ft.,
    public int strength;// 23,
    public int dexterity;// 14,
    public int constitution;// 21,
    public int intelligence;// 14,
    public int wisdom;// 13,
    public int charisma;// 17,
    public int strength_save;
    public int dexterity_save;// 7,
    public int constitution_save;// 10,
    public int intelligence_save;
    public int wisdom_save;// 6,
    public int charisma_save;// 8,
    public int deception;
    public int insight;
    public int perception;// 11,
    public int stealth;// 7,
    public String damage_vulnerabilities;// ,
    public String damage_resistances;// ,
    public String damage_immunities;// acid,
    public String condition_immunities;// ,
    public String senses;// blindsight 60 ft., darkvision 120 ft., passive Perception 21,
    public String languages;// Common, Draconic,
    public double challenge_rating;// 14,
    public ArrayList<Action> special_abilities;
    public ArrayList<Action> actions;
    public ArrayList<Action> legendary_actions;
    public String url;

    
    public Monster(){
        special_abilities = new ArrayList<>();
        actions = new ArrayList<>();
        legendary_actions = new ArrayList<>();
    }
}
