/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author chrisrk192
 */
public class DataCollection {
    
    public static String testAPI(String url){
        String json = GetJSON(GetConnection(url));
        FilterMonsterJSON(json);
        return json;
    }
    

    /**
     * Pulls the JSON from the connected url into a string.
     * ASSUMES connection is active
     * @param myConn the active connection to url
     * @return the JSON from the website in string format
     */
    public static String GetJSON(HttpURLConnection myConn){
        String theJSON = "";
        String inputLine;
        StringBuilder inputBuilder;
        BufferedReader in;
        
        try{
            in = new BufferedReader(new InputStreamReader(myConn.getInputStream()));
            inputBuilder = new StringBuilder("");
            while((inputLine = in.readLine()) != null){
                inputBuilder.append(inputLine+"\n");
            }
            return inputBuilder.toString();   
        }catch(MalformedURLException e){
            System.err.println(" url");
        }catch(IOException e){
            //System.err.println(" connection");
        }
        return "";    
    }
    
    /**
     * Connects to the provided url
     * @param theURL to conect to
     * @return the connection
     */
    public static HttpURLConnection GetConnection(String theURL){
        //String token = "IklmwxLbEGHjEsdOtbbqatZIRDdCRHzG";
        URL myURL; 
        HttpURLConnection myConn;
        
        try{
            myURL = new URL(theURL);
            myConn = (HttpURLConnection)myURL.openConnection();
            myConn.setRequestMethod("GET");
            //myConn.setRequestProperty("token", token);
            myConn.connect();
            return myConn;  
        }catch(MalformedURLException e){
            System.err.println(" url");
        }catch(IOException e){
            
            System.err.println("IOEXCEPTION");
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * Parses through the provided string containing JSON and creates values based
     *      on the data found there. Then adds these values to the list of edges
     * @param theJSON String format of JSON, requires "results" string for array
     * @return 
     */
    public static ArrayList<DataUrl> FilterMultipleJSON(String theJSON){
        //System.out.println("dnddatabot.DataCollection.FilterMultipleJSON()");
        JSONObject obj,query,page,temp;
        JSONArray links;
        int length;
        String tempTitle,tempUrl; int tempID;
        ArrayList<DataUrl> ar = new ArrayList<>();
        
        try{
            ////System.out.println(theJSON);
            obj = new JSONObject(theJSON);
            links = obj.getJSONArray("results");
            //page = query.getJSONObject("pages");


            for(int i = 0; i < links.length();i++){
                temp = links.getJSONObject(i);
                try{                    
                    try{tempTitle = temp.getString("name");}catch(JSONException e){
                        System.err.println("Not a name");
                        try{tempTitle = temp.getString("class");}catch(JSONException ee){
                            System.err.println("Not a class either");
                            tempTitle = "null";}
                            
                    }
                    tempUrl = temp.getString("url");
                    tempID = i;                 
                    ar.add(new DataUrl(tempTitle,tempUrl,tempID));
                }catch(JSONException e){
                    System.err.println("JSONException\n"); 
                }
            }
            
        } catch(JSONException e){
            System.err.println("NO RESULTS\n");
        }      
        return ar;
    }
    
    /**
     * 
     * @param theJSON
     * @return 
     */
    public static ClassArchtype FilterClassArchTypeJSON(String theJSON){
        ////System.out.println("Data.DataCollection.FilterClassArchTypeJSON()");
        JSONObject obj,temp;
        String tempTitle,tempUrl; int tempID;
        ClassArchtype p = new ClassArchtype();
        
        try{//get an object
            obj = new JSONObject(theJSON);

            try{//get the values
                p.id = obj.getString("_id");
                p.index = obj.getInt("index");
                p.name = obj.getString("name");
                p.hitDie = obj.getInt("hit_die");
                //looks like "prof":[ {"from":[ {},{} ]} ]
                JSONArray choices = obj.getJSONArray("proficiency_choices");
                JSONObject fromObj = choices.getJSONObject(0);
                p.numProfcncyToChoose = fromObj.getInt("choose");
                JSONArray from = fromObj.getJSONArray("from");              
                ArrayList<DataUrl> ar = new ArrayList<>();
                for(int i = 0; i < from.length();i++){
                    temp = from.getJSONObject(i);
                    try{                    
                        tempTitle = temp.getString("name");
                        tempUrl = temp.getString("url");
                        tempID = i;                 
                        ar.add(new DataUrl(tempTitle,tempUrl,tempID));
                        //System.out.println("Adding "+tempTitle+" "+tempUrl);
                    }catch(JSONException e){
                        System.err.println("JSONException\n"); 
                        e.printStackTrace();
                    }
                }
                p.profcncyChoices = ar;
                
                JSONArray profics = obj.getJSONArray("proficiencies");
                ArrayList<DataUrl> pr = new ArrayList<>();
                for (int i = 0; i < profics.length(); i++) {
                    temp = profics.getJSONObject(i);
                    tempTitle = temp.getString("name");
                    tempUrl = temp.getString("url");
                    tempID = i;                 
                    pr.add(new DataUrl(tempTitle,tempUrl,tempID));
                    //System.out.println("Adding "+tempTitle+" "+tempUrl);
                }
                p.proficiencies = pr;
                
                JSONArray saving = obj.getJSONArray("saving_throws");
                ArrayList<DataUrl> sv = new ArrayList<>();
                for (int i = 0; i < saving.length(); i++) {
                    temp = saving.getJSONObject(i);
                    tempTitle = temp.getString("name");
                    tempUrl = temp.getString("url");
                    tempID = i;                 
                    sv.add(new DataUrl(tempTitle,tempUrl,tempID));
                    //System.out.println("Adding "+tempTitle+" "+tempUrl);
                }
                p.savingThrows = sv;
                
                temp = obj.getJSONObject("starting_equipment");
                p.startingEquip = new DataUrl(temp.getString("class"), temp.getString("url"), 1);
                
                temp = obj.getJSONObject("class_levels");
                p.classLevels = new DataUrl(temp.getString("class"), temp.getString("url"), 1);
                
                JSONArray sub = obj.getJSONArray("subclasses");
                ArrayList<DataUrl> sb = new ArrayList<>();
                for (int i = 0; i < sub.length(); i++) {
                    temp = sub.getJSONObject(i);
                    tempTitle = temp.getString("name");
                    tempUrl = temp.getString("url");
                    tempID = i;                 
                    sb.add(new DataUrl(tempTitle,tempUrl,tempID));
                    //System.out.println("Adding "+tempTitle+" "+tempUrl);
                }
                p.subClasses = sb;
                
                p.url = obj.getString("url");
            }catch(JSONException e){
                System.err.println("JSONException");
                e.printStackTrace();
                p = null; 
            }
        } catch(JSONException e){
            System.err.println("JSONException\n");
            //System.out.println(theJSON);
            e.printStackTrace();
            p = null;
        }      
        return p;
    }
     
    public static Race FilterRaceJSON(String theJSON){
        ////System.out.println("Data.DataCollection.FilterClassArchTypeJSON()");
        JSONObject obj,temp;
        String tempTitle,tempUrl; int tempID;
        Race p = new Race();
        
        try{//get an object
            obj = new JSONObject(theJSON);
        //pub lic String _id;// public String 58f40b94c9e7ce9f7215325fpublic String ,
        try{p._id = obj.getString("_id");}catch(JSONException e){}
        //pub lic String index;// 1,
        try{p.index = obj.getInt("index");}catch(JSONException e){}
        //pub lic String name;// //pub lic String Dwarf//pub lic String ,
        try{p.name = obj.getString("name");}catch(JSONException e){}
        //pub lic String speed;// 30,
        try{p.speed = obj.getInt("speed");}catch(JSONException e){}
        //pub lic int[] ability_bonuses;// [//array of ints
        try{
        JSONArray bonus = obj.getJSONArray("ability_bonuses");
        int [] tempInts = new int[6];
        for(int i = 0; i < bonus.length();i++){
            //tempInts = new int[5];
            try{                    
                tempInts[i] = bonus.getInt(i);
                
            }catch(JSONException e){
                System.err.println("JSONException\n"); 
                e.printStackTrace();
            }
        }
        p.ability_bonuses = tempInts;
        }catch(JSONException e){System.err.println("Ability bonus");e.printStackTrace();}
        //pub lic String alignment;// ,
        try{p.alignment = obj.getString("alignment");}catch(JSONException e){}
        //pub lic String age;// 
        try{p.age = obj.getString("age");}catch(JSONException e){}
        //pub lic String size;// //pub lic String Medium//pub lic String ,
        try{p.size = obj.getString("size");}catch(JSONException e){}
        //pub lic String size_description;// //pub lic String
        try{p.size_description = obj.getString("size_description").replace("â€™", "'");}catch(JSONException e){}
        //pub lic ArrayList<DataUrl> starting_proficiencies;// [
        JSONArray sp = obj.getJSONArray("starting_proficiencies");
        ArrayList<DataUrl> ar = new ArrayList<>();
        for(int i = 0; i < sp.length()-1;i++){
            temp = sp.getJSONObject(i);
            try{                    
                tempTitle = temp.getString("name");
                tempUrl = temp.getString("url");
                tempID = i;                 
                ar.add(new DataUrl(tempTitle,tempUrl,tempID));
                //System.out.println("Adding "+tempTitle+" "+tempUrl);
            }catch(JSONException e){
                System.err.println("JSONException\n"); 
                e.printStackTrace();
            }
        }
        p.starting_proficiencies = ar;
        //pub lic ArrayList<DataUrl> from;//proficiency choices of
        
        ArrayList<DataUrl> fr = new ArrayList<>();
        try{
        for(int i = 0; i < sp.length(); i++){
            JSONObject choices = sp.getJSONObject(i);
            JSONArray from = choices.getJSONArray("from");
            for(int j = 0; j < from.length();j++){
                temp = from.getJSONObject(j);
                try{                    
                    tempTitle = temp.getString("name");
                    tempUrl = temp.getString("url");
                    tempID = j;                 
                    fr.add(new DataUrl(tempTitle,tempUrl,tempID));
                    //System.out.println("Adding "+tempTitle+" "+tempUrl);
                }catch(JSONException e){
                    System.err.println("JSONException in race\n"); 
                    //e.printStackTrace();
                }
            }
        }
        }catch(JSONException e){
            System.err.println("Race: from");
            //e.printStackTrace();
        }
        p.from = fr;
        //pub lic String type;// //pub lic String proficiencies//pub lic String ,
            try{p.type = obj.getString("type");}catch(JSONException e){}
        //pub lic int choose;// 1
            try{p.choose = obj.getInt("choose");}catch(JSONException e){}
        //pub lic ArrayList<DataUrl> languages;// [
        JSONArray lng = obj.getJSONArray("languages");
        ArrayList<DataUrl> ln = new ArrayList<>();
        for(int i = 0; i < lng.length();i++){
            temp = lng.getJSONObject(i);
            try{                    
                tempTitle = temp.getString("name");
                tempUrl = temp.getString("url");
                tempID = i;                 
                ln.add(new DataUrl(tempTitle,tempUrl,tempID));
                //System.out.println("Adding "+tempTitle+" "+tempUrl);
            }catch(JSONException e){
                System.err.println("JSONException in choose\n"); 
                //e.printStackTrace();
            }
        }
        p.languages = ln;
        //pub lic String language_desc;
        try{p.language_desc = obj.getString("language_desc").replace("â€™", "'");}catch(JSONException e){}
        //pub lic ArrayList<DataUrl> traits;// [
        JSONArray tra = obj.getJSONArray("traits");
        ArrayList<DataUrl> tr = new ArrayList<>();
        for(int i = 0; i < tra.length();i++){
            temp = tra.getJSONObject(i);
            try{                    
                tempTitle = temp.getString("name");
                tempUrl = temp.getString("url");
                tempID = i;                 
                tr.add(new DataUrl(tempTitle,tempUrl,tempID));
                //System.out.println("Adding "+tempTitle+" "+tempUrl);
            }catch(JSONException e){
                System.err.println("JSONException\n"); 
                e.printStackTrace();
            }
        }
        p.traits = tr;
        //pub lic ArrayList<DataUrl> subraces;// [
        JSONArray  sub = obj.getJSONArray("subraces");
        ArrayList<DataUrl>  sb = new ArrayList<>();
        for(int i = 0; i <  sub.length();i++){
            temp =  sub.getJSONObject(i);
            try{                    
                tempTitle = temp.getString("name");
                tempUrl = temp.getString("url");
                tempID = i;                 
                 sb.add(new DataUrl(tempTitle,tempUrl,tempID));
                //System.out.println("Adding "+tempTitle+" "+tempUrl);
            }catch(JSONException e){
                System.err.println("JSONException\n"); 
                e.printStackTrace();
            }
        }
        p.subraces =  sb;
        //pub lic String url;
        try{p.url = obj.getString("url");}catch(JSONException e){}
            
            
        return p;
        }catch(JSONException e){
            System.err.println("RETURN NULL");
            e.printStackTrace();
            return null;}
       
    }
    
    public static String[] FilterConditionJSON(String theJSON){
        JSONObject obj,temp;
        String tempTitle,tempUrl; int tempID;
        Race p = new Race();
        String s[];
        try{//get an object
            obj = new JSONObject(theJSON);
            JSONArray descs = obj.getJSONArray("desc");
            s = new String[descs.length()];
            //try{s = obj.getString("desc");}catch(JSONException e){System.err.println("JSONException in desc");}
            for(int i = 0; i < s.length; i++){
                s[i] = descs.getString(i);
                s[i] = s[i].replace("â€™", "'");
                s[i] = s[i].replace("â€¢", "\n- ");
            }
        }catch(JSONException e){
            System.err.println("JSONException");
            s = new String[0];
        }
        return s;
        
    }
    
    public static Monster FilterMonsterJSON(String theJSON){
    ////System.out.println("Data.DataCollection.FilterClassArchTypeJSON()");
        JSONObject obj,temp;
        String tempTitle,tempUrl; int tempID;
        Monster p = new Monster();
        
        try{//get an object
            obj = new JSONObject(theJSON);

            try{//get the values
                try{p.id = obj.getString("_id");}catch(JSONException e){}
                try{p.index = obj.getInt("index");}catch(JSONException e){}
                try{p.name = obj.getString("name");}catch(JSONException e){}
                try{p.size = obj.getString("size");}catch(JSONException e){}
                try{p.type = obj.getString("type");}catch(JSONException e){}
                try{p.subtype = obj.getString("subtype");}catch(JSONException e){}
                try{p.alignment = obj.getString("alignment");}catch(JSONException e){}
                try{p.armor_class = obj.getInt("armor_class");}catch(JSONException e){}
                try{p.hit_points = obj.getInt("hit_points");}catch(JSONException e){}
                try{p.hit_dice = obj.getString("hit_dice");}catch(JSONException e){}
                try{p.speed = obj.getString("speed").replace("â€™", "'");}catch(JSONException e){}
                try{p.strength = obj.getInt("strength");}catch(JSONException e){}
                try{p.dexterity = obj.getInt("dexterity");}catch(JSONException e){}
                try{p.constitution = obj.getInt("constitution");}catch(JSONException e){}
                try{p.intelligence = obj.getInt("intelligence");}catch(JSONException e){}
                try{p.wisdom = obj.getInt("wisdom");}catch(JSONException e){}
                try{p.charisma = obj.getInt("charisma");}catch(JSONException e){}
                try{p.strength_save = obj.getInt("strength_save");}catch(JSONException e){}
                try{p.constitution_save = obj.getInt("constitution_save");}catch(JSONException e){}
                try{p.intelligence_save = obj.getInt("intelligence_save");}catch(JSONException e){}
                try{p.wisdom_save = obj.getInt("wisdom_save");}catch(JSONException e){}
                try{p.charisma_save = obj.getInt("charisma_save");}catch(JSONException e){}
                try{p.deception = obj.getInt("deception");}catch(JSONException e){}
                try{p.insight = obj.getInt("insight");}catch(JSONException e){}
                try{p.perception = obj.getInt("perception");}catch(JSONException e){}
                try{p.stealth = obj.getInt("stealth");}catch(JSONException e){}
                try{p.damage_vulnerabilities = obj.getString("damage_vulnerabilities");}catch(JSONException e){}
                try{p.damage_resistances = obj.getString("damage_resistances");}catch(JSONException e){}
                try{p.damage_immunities = obj.getString("damage_immunities");}catch(JSONException e){}
                try{p.condition_immunities = obj.getString("condition_immunities");}catch(JSONException e){}
                try{p.senses = obj.getString("senses");}catch(JSONException e){}
                try{p.languages = obj.getString("languages");}catch(JSONException e){}
                try{p.challenge_rating = obj.getDouble("challenge_rating");}catch(JSONException e){}
                
                ArrayList<Action> sb = new ArrayList<>();
                try{JSONArray sa = obj.getJSONArray("special_abilities");
                for (int i = 0; i < sa.length(); i++) {
                    Action a = new Action();
                    temp = sa.getJSONObject(i);                   
                    try{a.damage_bonus = temp.getInt("damage_bonus");}catch(JSONException e){}
                    try{a.damage_dice = temp.getString("damage_dice");}catch(JSONException e){}
                    try{a.attack_bonus = temp.getInt("attack_bonus");}catch(JSONException e){}
                    try{a.desc = temp.getString("desc").replace("â€™", "'");}catch(JSONException e){}
                    try{a.name = temp.getString("name");}catch(JSONException e){}                         
                    sb.add(a);
                    //System.out.println("Adding "+a.name);
                }
                }catch(JSONException e){}
                p.special_abilities = sb;
                
                
                ArrayList<Action> ar = new ArrayList<>();
                try{JSONArray aa = obj.getJSONArray("actions");
                for (int i = 0; i < aa.length(); i++) {
                    Action a = new Action();
                    temp = aa.getJSONObject(i);                 
                    try{a.damage_bonus = temp.getInt("damage_bonus");}catch(JSONException e){}
                    try{a.damage_dice = temp.getString("damage_dice");}catch(JSONException e){}
                    try{a.attack_bonus = temp.getInt("attack_bonus");}catch(JSONException e){}
                    try{a.desc = temp.getString("desc").replace("â€™", "'");}catch(JSONException e){}
                    try{a.name = temp.getString("name");}catch(JSONException e){}                           
                    ar.add(a);
                    //System.out.println("Adding "+a.name);
                }}catch(JSONException e){}
                p.actions = ar;
                
                ArrayList<Action> ll = new ArrayList<>();
                try{JSONArray la = obj.getJSONArray("legendary_actions");
                for (int i = 0; i < la.length(); i++) {
                    Action a = new Action();
                    temp = la.getJSONObject(i);
                    try{a.damage_bonus = temp.getInt("damage_bonus");}catch(JSONException e){}
                    try{a.damage_dice = temp.getString("damage_dice");}catch(JSONException e){}
                    try{a.attack_bonus = temp.getInt("attack_bonus");}catch(JSONException e){}
                    try{a.desc = temp.getString("desc").replace("â€™", "'");}catch(JSONException e){}
                    try{a.name = temp.getString("name");}catch(JSONException e){}           
                    ll.add(a);
                    //System.out.println("Adding "+a.name);
                }}catch(JSONException e){}
                p.legendary_actions = ll;
                
                
                
                p.url = obj.getString("url");
            }catch(JSONException e){
                System.err.println("JSONException");
                e.printStackTrace();
                p = null; 
            }
        } catch(JSONException e){
            System.err.println("JSONException\n");
            //System.out.println(theJSON);
            e.printStackTrace();
            p = null;
        }      
        return p;
    }
    
    public static Spell FilterSpellJSON(String theJSON){
        ////System.out.println("Data.DataCollection.FilterClassArchTypeJSON()");
        JSONObject obj,temp;
        String tempTitle,tempUrl; int tempID;
        Spell p = new Spell();
        
        try{//get an object
            obj = new JSONObject(theJSON);

            try{//get the values
                try{p._id = obj.getString("_id");}catch(JSONException e){};
                try{p.index = obj.getInt("index");}catch(JSONException e){};
                try{p.name = obj.getString("name");}catch(JSONException e){};
                
                
                try{
                    JSONArray descs = obj.getJSONArray("desc");
                    ArrayList<String> pr = new ArrayList<>();
                    for (int i = 0; i < descs.length(); i++) {
                        pr.add(descs.getString(i).replace("â€™", "'"));
                        //System.out.println("Adding "+"desc");
                    }
                    p.desc = pr;
                }catch(JSONException e){};
                try{
                    JSONArray highLvl = obj.getJSONArray("higher_level");
                    ArrayList<String> hl = new ArrayList<>();
                    for (int i = 0; i < highLvl.length(); i++) {
                        hl.add(highLvl.getString(i).replace("â€™", "'"));
                        //System.out.println("Adding "+"desc");
                    }
                    p.higher_level = hl;
                }catch(JSONException e){};
                try{p.page = obj.getString("page");}catch(JSONException e){};
                try{p.range = obj.getString("range");}catch(JSONException e){};
                try{
                    JSONArray cmpnts = obj.getJSONArray("components");
                    ArrayList<String> cm = new ArrayList<>();
                    for (int i = 0; i < cmpnts.length(); i++) {
                        cm.add(cmpnts.getString(i).replace("â€™", "'"));
                        //System.out.println("Adding "+"cmpnt");
                    }
                    p.components = cm;
                }catch(JSONException e){};
                try{p.material = obj.getString("material");}catch(JSONException e){};
                try{p.ritual = obj.getString("ritual");}catch(JSONException e){};
                try{p.duration = obj.getString("duration");}catch(JSONException e){};
                try{p.concentration = obj.getString("concentration");}catch(JSONException e){};
                try{p.casting_time = obj.getString("casting_time");}catch(JSONException e){};
                try{p.level = obj.getInt("level");}catch(JSONException e){};
                try{
                    JSONObject school = obj.getJSONObject("school");
                    DataUrl schl = new DataUrl(school.getString("name"), school.getString("url"), 1);
                    p.school = schl;
                }catch(JSONException e){};  
                try{
                    JSONArray clsss = obj.getJSONArray("classes");
                    ArrayList<DataUrl> cl = new ArrayList<>();
                    for (int i = 0; i < clsss.length(); i++) {
                        temp = clsss.getJSONObject(i);
                        tempTitle = temp.getString("name");
                        tempUrl = temp.getString("url");
                        tempID = i;                 
                        cl.add(new DataUrl(tempTitle,tempUrl,tempID));
                        //System.out.println("Adding "+tempTitle+" "+tempUrl);
                    }
                    p.classes = cl;
                }catch(JSONException e){};
                
                try{
                    JSONArray sub = obj.getJSONArray("subclasses");
                    ArrayList<DataUrl> sb = new ArrayList<>();
                    for (int i = 0; i < sub.length(); i++) {
                        temp = sub.getJSONObject(i);
                        tempTitle = temp.getString("name");
                        tempUrl = temp.getString("url");
                        tempID = i;                 
                        sb.add(new DataUrl(tempTitle,tempUrl,tempID));
                        //System.out.println("Adding "+tempTitle+" "+tempUrl);
                    }
                    p.subclasses = sb;
                }catch(JSONException e){};
                try{p.url = obj.getString("url");}catch(JSONException e){};
            }catch(JSONException e){
                System.err.println("JSONException");
                e.printStackTrace();
                p = null; 
            }
        } catch(JSONException e){
            System.err.println("JSONException\n");
            //System.out.println(theJSON);
            e.printStackTrace();
            p = null;
        }      
        return p;
    }
    
    public static Level FilterLevelJSON(String theJSON){
        JSONObject obj,temp;
        String tempTitle,tempUrl; int tempID;
        Level p = new Level();
  /*      
        
        
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

        
        
*/
        try{//get an object
            obj = new JSONObject(theJSON);

            //get the values
                try{p._id = obj.getString("_id");}catch(JSONException e){};
                try{p.index = obj.getInt("index");}catch(JSONException e){};
                try{p.level = obj.getInt("level");}catch(JSONException e){};
                try{p.ability_score_bonuses = obj.getInt("ability_score_bonuses");}catch(JSONException e){};
                try{p.prof_bonus = obj.getInt("prof_bonus");}catch(JSONException e){};
                try{p.url = obj.getString("url");}catch(JSONException e){};
                //try{p.spells_known = obj.getInt("spells_known");}catch(JSONException e){};                
                try{
                    JSONArray fcs = obj.getJSONArray("feature_choices");
                    ArrayList<DataUrl> fc = new ArrayList<>();
                    for (int i = 0; i < fcs.length(); i++) {
                        temp = fcs.getJSONObject(i);
                        tempTitle = temp.getString("name");
                        tempUrl = temp.getString("url");
                        tempID = i;                 
                        fc.add(new DataUrl(tempTitle,tempUrl,tempID));
                        
                    }
                    p.feature_choices = fc;
                }catch(JSONException e){};
                
                try{
                    JSONArray clsss = obj.getJSONArray("features");
                    ArrayList<DataUrl> cl = new ArrayList<>();
                    for (int i = 0; i < clsss.length(); i++) {
                        temp = clsss.getJSONObject(i);
                        tempTitle = temp.getString("name");
                        tempUrl = temp.getString("url");
                        tempID = i;                 
                        cl.add(new DataUrl(tempTitle,tempUrl,tempID));
                        
                    }
                    p.features = cl;
                }catch(JSONException e){};
                
                try{
                    JSONArray clsss = obj.getJSONArray("classes");
                    ArrayList<DataUrl> cl = new ArrayList<>();
                    for (int i = 0; i < clsss.length(); i++) {
                        temp = clsss.getJSONObject(i);
                        tempTitle = temp.getString("name");
                        tempUrl = temp.getString("url");
                        tempID = i;                 
                        cl.add(new DataUrl(tempTitle,tempUrl,tempID));
                        //System.out.println("Adding "+tempTitle+" "+tempUrl);
                    }
                    p.classs = cl;
                }catch(JSONException e){};
                
                try{
                    JSONArray clssss = obj.getJSONArray("class_specific");
                    ArrayList<DataUrl> cls = new ArrayList<>();
                    for (int i = 0; i < clssss.length(); i++) {
                        temp = clssss.getJSONObject(i);
                        tempTitle = temp.getString("name");
                        tempUrl = temp.getString("url");
                        tempID = i;                 
                        cls.add(new DataUrl(tempTitle,tempUrl,tempID));
                        //System.out.println("Adding "+tempTitle+" "+tempUrl);
                    }
                    p.class_specific = cls;
                }catch(JSONException e){};   
                
                try{
                    temp = obj.getJSONObject("spellcasting");

                    try{p.cantrips_known = temp.getInt("cantrips_known");}catch(JSONException e){}
                    try{p.spells_known = temp.getInt("spells_known");}catch(JSONException e){}
                    try{p.spell_slots_level_1 = temp.getInt("spell_slots_level_1");}catch(JSONException e){}
                    try{p.spell_slots_level_2 = temp.getInt("spell_slots_level_2");}catch(JSONException e){}
                    try{p.spell_slots_level_3 = temp.getInt("spell_slots_level_3");}catch(JSONException e){}
                    try{p.spell_slots_level_4 = temp.getInt("spell_slots_level_4");}catch(JSONException e){}
                    try{p.spell_slots_level_5 = temp.getInt("spell_slots_level_5");}catch(JSONException e){}
                    try{p.spell_slots_level_6 = temp.getInt("spell_slots_level_6");}catch(JSONException e){}
                    try{p.spell_slots_level_7 = temp.getInt("spell_slots_level_7");}catch(JSONException e){}
                    try{p.spell_slots_level_8 = temp.getInt("spell_slots_level_8");}catch(JSONException e){}
                    try{p.spell_slots_level_9 = temp.getInt("spell_slots_level_9");}catch(JSONException e){}
                }catch(JSONException e){}
                
                
                
                
                
                
        } catch(JSONException e){
            System.err.println("JSONException\n");
            //System.out.println(theJSON);
            e.printStackTrace();
            p = null;
        }      
        return p;
    }
    
    public static String FilterOutJOSN(String theJSON){
        theJSON = theJSON.replace("{", "");
        theJSON = theJSON.replace("}", "");
        theJSON = theJSON.replace(",\"", "\n\n");
        theJSON = theJSON.replace("\"", "");
        theJSON = theJSON.replace(":", ": ");
        theJSON = theJSON.replace("â€™", "'");
        theJSON = theJSON.replace("â€¢", "- ");
        return theJSON;
    }
}
