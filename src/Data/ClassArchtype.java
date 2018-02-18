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
public class ClassArchtype implements Serializable {
    public String id;
    public int index;
    public String name;
    public int hitDie;
    public ArrayList<DataUrl> profcncyChoices;
    public int numProfcncyToChoose;
    public ArrayList<DataUrl> proficiencies;
    public ArrayList<DataUrl> savingThrows;
    public DataUrl startingEquip;
    public DataUrl classLevels;
    public ArrayList<DataUrl> subClasses;
    public String url; 
}
