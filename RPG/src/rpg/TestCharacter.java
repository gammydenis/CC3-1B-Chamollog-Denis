/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author CC4-30
 */
class TestCharacter {
        Character neptune = new Character("Carlo", 30, 100, 100, 1000);
    Character noire = new Character("Kleiser", 30,100,100,1000);
    
    public void battle(){
        System.out.println(neptune.name+": "+neptune.maxLife);
        System.out.println(noire.name+": "+noire.maxLife);
        System.out.println();
        int i = 1;
        do {
            System.out.println("Round "+ i);
            int nepAttack = neptune.attack();
            int nowaAttack = noire.attack();
            noire.wound(nepAttack);
            System.out.println(neptune.name+" attacked "+noire.name+" for "+nepAttack+" damage");
            System.out.println(noire.name+"'s health is now: "+noire.currentLife);
            if (noire.currentLife > 0) {
                neptune.wound(nowaAttack);
                System.out.println(noire.name+" attacked "+neptune.name+" for "+nowaAttack+" damage");
                System.out.println(neptune.name+"'s health is now: "+neptune.currentLife);
                if (neptune.currentLife <= 0) {
                    System.out.println();
                    System.out.println(neptune.name+" has died");
                    System.out.println(noire.name+" wins!");
                }
            }else{
                System.out.println();
                System.out.println(noire.name+" has died");
                System.out.println(neptune.name+" wins!");
            }
            System.out.println();
            i++;
        } while (neptune.currentLife > 0 & noire.currentLife > 0);
        
    }

    }
