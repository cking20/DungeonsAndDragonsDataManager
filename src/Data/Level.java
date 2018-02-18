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
public class Level implements Serializable{
    public String _id;
    public int level;// 1,
    public int ability_score_bonuses;// 0,
    public int prof_bonus;// 2,
    public ArrayList<DataUrl> feature_choices;// [],
    public ArrayList<DataUrl> features;// 

    public int cantrips_known;// 3,
    public int spells_known;// 4,
    public int spell_slots_level_1;// 2,
    public int spell_slots_level_2;// 0,
    public int spell_slots_level_3;// 0,
    public int spell_slots_level_4;// 0,
    public int spell_slots_level_5;// 0,
    public int spell_slots_level_6;// 0,
    public int spell_slots_level_7;// 0,
    public int spell_slots_level_8;// 0,
    public int spell_slots_level_9;// 0

    public ArrayList<DataUrl> class_specific;// {

    public int index;// 41,
    public ArrayList<DataUrl> classs;// 

    public String url;

}
