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
public class Race implements Serializable{
    public String _id;// public String 58f40b94c9e7ce9f7215325fpublic String ,
    public int index;// 1,
    public String name;// public String Dwarfpublic String ,
    public int speed;// 30,
    public int[] ability_bonuses;// [//array of ints
          
    public String alignment;// ,
    public String age;// 
    public String size;// public String Mediumpublic String ,
    public String size_description;// public String
    public ArrayList<DataUrl> starting_proficiencies;// [
    
    public ArrayList<DataUrl> from;//proficiency choices of
    public String type;// public String proficienciespublic String ,
    public int choose;// 1
    
    public ArrayList<DataUrl> languages;// [
    public String language_desc;
    public ArrayList<DataUrl> traits;// [
            
    public ArrayList<DataUrl> subraces;// [
            
    public String url;
}
