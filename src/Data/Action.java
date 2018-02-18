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
public class Action implements Serializable{
        public int damage_bonus;// 6,
        public String damage_dice;// 2d10 + 1d8,
        public int attack_bonus;// 11,
        public String desc;//
        public String name;// Bite
    }
