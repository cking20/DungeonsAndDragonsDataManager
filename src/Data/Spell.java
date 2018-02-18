/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author chrisrk192
 */
public class Spell implements Serializable{
    public String _id;
    public int  index;// 1,
    public String name;// public String Acid Arrowpublic String ,
    public String page;// public String phb 259public String ,
    public String range;// public String 90 feetpublic String ,
    public String material;//
    public String ritual;// public String nopublic String ,
    public String duration;// public String Instantaneouspublic String ,
    public String concentration;// public String nopublic String ,
    public String casting_time;// public String 1 actionpublic String ,
    public int level;// 2,
    public DataUrl school;
    
    public ArrayList<String> desc;// [public String A spublic String ],
    public ArrayList<String> higher_level;// [public String When yopublic String ],
    public ArrayList<String> components;// 
    public ArrayList<DataUrl> classes;//
    public ArrayList<DataUrl> subclasses;// [	
    public String url;//
    
    
@Override
public boolean equals(Object obj) {
    if (obj == null) {
        return false;
    }
    if (!Spell.class.isAssignableFrom(obj.getClass())) {
        return false;
    }
    final Spell other = (Spell) obj;
    if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
        return false;
    }
    
    return true;
}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.name);
        return hash;
    }

}
