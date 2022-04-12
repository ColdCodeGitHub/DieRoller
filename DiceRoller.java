/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dice;

import java.util.Scanner;



/**
 *
 * @author louis
 */
public class DiceRoller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        
        do {
            
            Scanner sc= new Scanner(System.in);
            System.out.println("Press 'r' to roll the die.");
            
            input = sc.nextLine();
            
            if(input.equals("r")) {
               System.out.println(SixSidedDie.rollTheDie());
                
            }
        } while(!(input.equals("r"))); 
    }
}
