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
public class Notes implements Serializable{
    ArrayList<String> names;
    ArrayList<String> text;
    public String current;
    public static int counter;
    
    public Notes(){
        counter = 0;
        names = new ArrayList<>();
        text = new ArrayList<>();
    }
    
    
    public ArrayList<String> getNames(){
        return names;
    }
    
    public void add(String n, String t){
        names.add(names.size(), n);
        text.add(text.size(),t);
    }
    public void remove(String n){
        //find index of n
        int i = names.indexOf(n);
        //remove data @ index in both
        names.remove(i);
        text.remove(i);
    }
    
    public String getText(String n){
        int i = names.indexOf(n);
        //remove data @ index in both
        return text.get(i);
    }
    
    public void rename(String oldName, String newName){
        int i = names.indexOf(oldName);
        names.set(i, newName);
    }
    
    public void update(String name, String newText){
        int i = names.indexOf(name);
        text.set(i, newText);
    }
            
}
