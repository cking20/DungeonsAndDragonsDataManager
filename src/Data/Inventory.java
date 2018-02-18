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
public class Inventory implements Serializable{
    private ArrayList<Item> inv;
    public Item current;
    public int counter;
    
    public Inventory(){
        inv = new ArrayList<>();
        counter = 0;
    }
    
    public ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < inv.size(); i++) {
            names.add(inv.get(i).name);
        }
        return names;
    }
    
    public ArrayList<String> getEquipedes(){
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < inv.size(); i++) {
            if(inv.get(i).equiped)
                names.add(inv.get(i).name);
        }
        return names;
    }
    
    
    public void Remove(String key){
        Item temp = new Item(key);
        inv.remove(inv.indexOf(temp));
    }
    
    public void Add(String s){
        Item n = new Item(s);
        inv.add(n);
        current = n;
    }
    
    public void Update(String oldName){
        System.out.println("Data.Inventory.Update()");
        //Item temp = new Item(oldName);
        //int i = inv.indexOf(temp);
        int j = -1;
        for (int i = 0; i < inv.size(); i++) {
            if (inv.get(i).name.compareTo(oldName)==0) {
                j = i;
            }
            
        }
        System.out.println("index found: "+j);
        if(j == -1)
            return;
        inv.set(j, current);
    }
    
    public Item Find(String n){
        Item temp = new Item(n);
        int i = inv.indexOf(temp);
        if(i == -1)
            return null;
        return inv.get(i);
    }
    
    public class Item implements Serializable{
        public String name;
        public String desc;
        public int quantity;
        public int value;
        public boolean equiped;
        
        public Item(String s){
            if(!(s == null))
                name = s;
            else
                name = "New Item";
            desc  = "";
            quantity = 1;
            value = 0;
            equiped = false;
        }
        
        @Override
        public boolean equals(Object o){
            if(o == null)
                return false;
            if (o == this) {
                return true;
            }

            if (!(o instanceof Item)) {
                return false;
            }
            Item c = (Item) o;
            return name.compareTo(c.name) == 0;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 79 * hash + Objects.hashCode(this.name);
            return hash;
        }
    }
}
