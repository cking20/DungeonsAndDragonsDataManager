/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chrisrk192
 */
public class DNDDataBot implements Runnable{
    /**
     * @param args the command line arguments
     */
    private static String baseURL = "http://www.dnd5eapi.co/api/";
    private static String baseDirPath;// = "./dataSet";
    public int count;
    public boolean overWriteData;
    public boolean DLmainSet;
    public boolean DlextraSet;
    public UI.DataManager dm;
    /**
     * 
     * @param DLmainSet
     * @param DlextraSet
     * @param overWrite if true will redownload the entire set
     */
    public void CollectData() {
        Data.IO.CreateAllDirs();
        baseDirPath = Data.IO.baseDir;
        count = 0;
        //String baseURL = "http://www.dnd5eapi.co/api/";
        //String baseDirPath = "./dataSet";
        String currentUrl, theJSON;
        //create dir
        File baseDir = new File(baseDirPath);
        if (!baseDir.exists()) {
            try{baseDir.mkdir();}catch(SecurityException se){se.printStackTrace();System.exit(0);}}
        if(DlextraSet){
            
            DownloadAndSave("damage-types");
            DownloadAndSave("features");
            
            DownloadAndSave("traits");
            DownloadAndSave("languages");
            DownloadAndSave("skills");
            DownloadAndSave("damage-types");
            
            DownloadAndSave("magic-schools");
            DownloadAndSave("proficiencies");
            DownloadAndSave("spellcasting");
            DownloadAndSave("startingequipment");
            DownloadAndSave("ability-scores");
            DownloadAndSave("subraces");
            DownloadAndSave("equipment");

        }
        if(DLmainSet){
            DownloadAndSave("monsters");    
            DownloadAndSave("spells");
            DownloadAndSave("races");
            DownloadAndSave("conditions");
            //Class and level Info
            File classDir = new File(baseDirPath+"/classes");
            if (!classDir.exists()) {
                try{classDir.mkdir();}catch(SecurityException se){se.printStackTrace();System.exit(0);}}
            ArrayList<Data.DataUrl> classSet = Data.DataCollection.FilterMultipleJSON(Data.DataCollection.GetJSON(Data.DataCollection.GetConnection(baseURL+"classes/")));
            System.out.println("Num classes:" + classSet.size());
            for (int i = 0; i < classSet.size(); i++) {
                Data.DataUrl curr = classSet.get(i);
                File curFile = new File(baseDirPath+"/classes/"+curr.name+".ser");
                            File levelPre = new File(baseDirPath+"/classes/"+curr.name);
                            levelPre.mkdir();
                            for (int j = 1; j <= 20; j++) {
                                File level = new File(baseDirPath+"/classes/"+curr.name+"/"+j+".ser");
                                try {
                                    if(!level.exists() || overWriteData){
                                        level.createNewFile();
                                        System.out.println("Downloading from: " + baseURL+"classes/"+curr.name.toLowerCase()+"/level/"+j);
                                        theJSON = Data.DataCollection.GetJSON(Data.DataCollection.GetConnection(baseURL+"classes/"+curr.name.toLowerCase()+"/level/"+j));
                                        FileOutputStream fos = new FileOutputStream(level);
                                        ObjectOutputStream oOs = new ObjectOutputStream(fos);
                                        oOs.writeObject(theJSON);
                                        oOs.close();fos.close();
                                        IncCount();
                                    }    
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    System.err.println("DATA NOT SAVED:"+curr.name);}
                            }
                            File level = new File(baseDirPath+"/classes/"+curr.name+"/level.ser");
                            try {
                                if(!level.exists() || overWriteData){
                                    level.createNewFile();
                                    theJSON = Data.DataCollection.GetJSON(Data.DataCollection.GetConnection(baseURL+"classes/"+curr.name+"/levels"));
                                    FileOutputStream fos = new FileOutputStream(level);
                                    ObjectOutputStream oOs = new ObjectOutputStream(fos);
                                    oOs.writeObject(theJSON);
                                    oOs.close();fos.close();
                                    IncCount();
                                }    
                            } catch (IOException e) {System.err.println("DATA NOT SAVED:"+curr.name);}
                try {
                    if(!curFile.exists()){
                        curFile.createNewFile();
                        theJSON = Data.DataCollection.GetJSON(Data.DataCollection.GetConnection(curr.url));
                        FileOutputStream fos = new FileOutputStream(curFile);
                        ObjectOutputStream oOs = new ObjectOutputStream(fos);
                        oOs.writeObject(theJSON);
                        oOs.close();fos.close();
                        IncCount();
                    }    
                } catch (IOException e) {System.err.println("DATA NOT SAVED:"+curr.name);}
                System.out.println("Saved: "+count);
            }  
        }
        if(dm != null)
            dm.setDLDone();
    }
    public void IncCount(){
        count++;
        if(dm == null)
            return;
        dm.setDLProgress(count);
    }
    
    public void DownloadAndSave(String dirAndURLDir){
        String theJSON;
        File equipDir = new File(baseDirPath+"/"+dirAndURLDir);
        if (!equipDir.exists()) {
            try{equipDir.mkdir();}catch(SecurityException se){se.printStackTrace();System.exit(0);}}
        ArrayList<Data.DataUrl> equipSet = Data.DataCollection.FilterMultipleJSON(Data.DataCollection.GetJSON(Data.DataCollection.GetConnection(baseURL+dirAndURLDir+"/")));
        System.out.println("Num "+dirAndURLDir+":" + equipSet.size());
        for (int i = 0; i < equipSet.size(); i++) {
            Data.DataUrl curr = equipSet.get(i);
            curr.name = replaceBadFileNameChars(curr.name);
            File curFile = new File(baseDirPath+"/"+dirAndURLDir+"/"+curr.name+".ser");
            try {
                if(!curFile.exists() || overWriteData){
                    curFile.createNewFile();
                    theJSON = Data.DataCollection.GetJSON(Data.DataCollection.GetConnection(curr.url));
                    FileOutputStream fos = new FileOutputStream(curFile);
                    ObjectOutputStream oOs = new ObjectOutputStream(fos);
                    oOs.writeObject(theJSON);
                    oOs.close();fos.close();
                    IncCount();
                }    
            } catch (IOException e) {System.err.println("DATA NOT SAVED:"+curr.name);}
            System.out.println("Saved: "+count);
        }
    }
    
    public void DownloadAndSaveMissing(String dirAndURLDir){
        String theJSON;
        File equipDir = new File(baseDirPath+"/"+dirAndURLDir);
        if (!equipDir.exists()) {
            try{equipDir.mkdir();}catch(SecurityException se){se.printStackTrace();System.exit(0);}}
        ArrayList<Data.DataUrl> equipSet = Data.DataCollection.FilterMultipleJSON(Data.DataCollection.GetJSON(Data.DataCollection.GetConnection(baseURL+dirAndURLDir+"/")));
        System.out.println("Num "+dirAndURLDir+":" + equipSet.size());
        for (int i = 0; i < equipSet.size(); i++) {
            Data.DataUrl curr = equipSet.get(i);
            curr.name = replaceBadFileNameChars(curr.name);
            File curFile = new File(baseDirPath+"/"+dirAndURLDir+"/"+curr.name+".ser");
            try {
                if(!curFile.exists()){
                    curFile.createNewFile();
                    theJSON = Data.DataCollection.GetJSON(Data.DataCollection.GetConnection(curr.url));
                    FileOutputStream fos = new FileOutputStream(curFile);
                    ObjectOutputStream oOs = new ObjectOutputStream(fos);
                    oOs.writeObject(theJSON);
                    oOs.close();fos.close();
                    IncCount();
                }    
            } catch (IOException e) {System.err.println("DATA NOT SAVED:"+curr.name);}
            System.out.println("Saved: "+count);
        }
    }
    
    public String replaceBadFileNameChars(String s){
        s = s.replace("/", "-n-");
        return s;
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        CollectData();
    }
}
