/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.Random;

public class Dice {
        public Dice(){
        
    }
    
    public int roll(){
        Random r = new Random();
        int random = r.nextInt(6) +1;
        return random;
    }

}
