/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;

/**
 *
 * @author chrisrk192
 */
public class DataUrl implements Serializable {
    public String name;
    public String url;
    public int number;

    public DataUrl(String name, String url, int number) {
        this.name = name;
        this.url = url;
        this.number = number;
    }
    
    
}
