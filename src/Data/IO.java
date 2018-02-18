/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chrisrk192
 */
public class IO {
    public static String saveDir ;// IO.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath().replace("/DND.jar", "")+"/save";
    public static String baseDir ;// IO.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath().replace("/DND.jar", "")+"/dataSet";
    public static String spellDir ;// baseDir+"/spells";
    public static String monsterDir ;// baseDir+"/monsters";
    public static String equipDir ;// baseDir+"/equipment";
    public static String classDir ;// baseDir+"/classes";
    public static String levelDir ;// baseDir+"/classes";//use: levelDir/ClassName/level.ser
    public static String raceDir ;// baseDir+"/races";
    public static String sheetDir ;// saveDir+"/sheets";
    public static String dmNotesPath ;// saveDir+"/dm/notes.ser";
    public static String dmSheetsDir ;// saveDir+"/dm/sheets";
    public static String pdfsDir ;// saveDir+"/pdfs";
    public static String conditionDir ;// baseDir+"/conditions";
    
    
    public static ArrayList<String> GetFileNames(String path){
        File dirc = new File(path);
        File [] f = dirc.listFiles();
        ArrayList<String> fNames = new ArrayList();
        for (File f1 : f) {
            fNames.add(f1.getName()); //sets the names to a parallel array for easy name loop up
            //System.out.println("Adding "+f[i].getName());
        }
        return fNames;
    }
    public static ArrayList<String> GetDirNames(){
        File dirc = new File(baseDir);
        File [] f = dirc.listFiles();
        ArrayList<String> fNames = new ArrayList();
        for (File f1 : f) {
            if(f1.isDirectory())
                fNames.add(f1.getName()); //sets the names to a parallel array for easy name loop up
            //System.out.println("Adding "+f[i].getName());
        }
        return fNames;
    }
        
    public static void AgreeToEULA(){
        File f = new File(saveDir+"/agreement.txt");
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void CreateAllDirs(){//called first thing in main
        try {
            String currPath = IO.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath().replace("/DND.jar", "");
            if(currPath.charAt(currPath.length()-1) == '/' || currPath.charAt(currPath.length()-1) == '\\'){
                System.out.println("TRIMMING");
                currPath = currPath.substring(0, currPath.length()-1);
            }
            saveDir = currPath+"/save";
            baseDir = currPath+"/dataSet";
            spellDir = baseDir+"/spells";
            monsterDir = baseDir+"/monsters";
            equipDir = baseDir+"/equipment";
            classDir = baseDir+"/classes";
            levelDir = baseDir+"/classes";//use: levelDir/ClassName/level.ser
            raceDir = baseDir+"/races";
            sheetDir = saveDir+"/sheets";
            dmNotesPath = saveDir+"/dm/notes.ser";
            dmSheetsDir = saveDir+"/dm/sheets";
            pdfsDir = saveDir+"/pdfs";
            conditionDir = baseDir+"/conditions";
            
            
            
            if(!new File(saveDir).exists()){
                new File(saveDir).mkdir();                
                UI.DataManager d = new UI.DataManager();
                d.setVisible(true);
                d.setLocationRelativeTo(null);    
            }
            if(!new File(saveDir+"/agreement.txt").exists()){
                UI.EULA eula = new UI.EULA();
                eula.setVisible(true);
                eula.setLocationRelativeTo(null);
            }
            if(!new File(baseDir).exists())
                new File(baseDir).mkdir();
            if(!new File(sheetDir).exists())
                new File(sheetDir).mkdir();
            if(!new File(saveDir+"/dm").exists())
                new File(saveDir+"/dm").mkdir();
            if(!new File(pdfsDir).exists())
                new File(pdfsDir).mkdir();
            if(!new File(spellDir).exists())
                new File(spellDir).mkdir();
            if(!new File(monsterDir).exists())
                new File(monsterDir).mkdir();
            if(!new File(classDir).exists())
                new File(classDir).mkdir();
            if(!new File(raceDir).exists())
                new File(raceDir).mkdir();
            if(!new File(equipDir).exists())
                new File(equipDir).mkdir();
        } catch (URISyntaxException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
    public static void SaveCharacterSheet(CharacterSheet cs){
        if(cs == null || cs.name == null)
            return;
        if(!new File(sheetDir).exists())
            new File(sheetDir).mkdir();
        File curFile = new File(sheetDir+"/"+cs.name+".ser");
        try {
            curFile.createNewFile();
            FileOutputStream fos;
            fos = new FileOutputStream(curFile);
            ObjectOutputStream oOs;
            oOs = new ObjectOutputStream(fos);
            oOs.writeObject(cs);
            oOs.close();fos.close();
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static CharacterSheet LoadCharacterSheet(String path){
        FileInputStream fis;
        try {
            fis = new FileInputStream(path);
            ObjectInputStream ois;
            ois= new ObjectInputStream(fis);
            CharacterSheet ret =  (CharacterSheet)ois.readObject();
            ois.close();
            fis.close();
            return ret;
        } catch (FileNotFoundException ex ) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void SaveMonsterSheet(Monster cs){
        File curFile = new File(sheetDir+"/"+cs.name+".ser");
        try {
            curFile.createNewFile();
            FileOutputStream fos;
            fos = new FileOutputStream(curFile);
            ObjectOutputStream oOs;
            oOs= new ObjectOutputStream(fos);
            oOs.writeObject(cs);
            oOs.close();fos.close();
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Monster LoadMonsterSheet(String path){
        FileInputStream fis;
        try {
            fis = new FileInputStream(path);
            ObjectInputStream ois;
            ois = new ObjectInputStream(fis);
            Monster ret =  (Monster)ois.readObject();
            ois.close();
            fis.close();
            return ret;
        } catch (FileNotFoundException ex ) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void SaveDMNotes(Notes notes){
        File curFile = new File(dmNotesPath);
        try {
            curFile.createNewFile();
            FileOutputStream fos;
            fos = new FileOutputStream(curFile);
            ObjectOutputStream oOs;
            oOs= new ObjectOutputStream(fos);
            oOs.writeObject(notes);
            oOs.close();fos.close();
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Notes LoadDMNotes(){
        System.out.println("Data.IO.LoadDMNotes()");
        FileInputStream fis;
        try {
            File f = new File(dmNotesPath);
            fis = new FileInputStream(f);
            ObjectInputStream ois;
            ois = new ObjectInputStream(fis);
            Notes ret =  (Notes)ois.readObject();
            ois.close();
            fis.close();
            return ret;
        } catch (FileNotFoundException ex ) {
            System.err.println("File Not found");
            File f = new File(dmNotesPath);
            try {
                f.createNewFile();
                //return new Notes();
            } catch (IOException ex1) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            System.err.println("IOException");
            File f = new File(dmNotesPath);
            try {
                f.createNewFile();
                //return new Notes();
            } catch (IOException ex1) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            //return new Notes();
        } catch (ClassNotFoundException ex) {
            System.err.println("ClassNotFound");
            File f = new File(dmNotesPath);
            try {
                f.createNewFile();
                //return new Notes();
            } catch (IOException ex1) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            //return new Notes();
        }
        return new Notes();
    }
    
    public static void SaveJSONFile(String theJSON, String path){
        File curFile = new File(path);
        try {
            curFile.createNewFile();
            FileOutputStream fos;
            fos = new FileOutputStream(curFile);
            ObjectOutputStream oOs;
            oOs = new ObjectOutputStream(fos);
            oOs.writeObject(theJSON);
            oOs.close();fos.close();
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * @param path full path name ex: ./dataset/spells/name.SER
     * @return 
     */
    public static String LoadJSONFile(String path){
        //derserialize file
        FileInputStream fis;
        try {
            fis = new FileInputStream(path);
            String ret;
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                ret = (String)ois.readObject();
            }
            fis.close();
            return ret;
        } catch (FileNotFoundException ex ) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //parse it
        //pass back spell object
        return null;
    }
    
    public static void DeleteFile(String path){
        if(!path.contains(saveDir))
            return;
        //try{
        File f = new File(path);
        f.delete();
        //}catch(IOException e){System.err.println("error deleting file: "+path);}
    }
}
