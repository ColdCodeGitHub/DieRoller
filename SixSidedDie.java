/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author louis
 */
public enum SixSidedDie {
    ONE, TWO, THREE, FOUR, FIVE, SIX;
    
    private static final List<SixSidedDie> values = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int size = values.size();
    private static final Random rand = new Random();

    public static SixSidedDie rollTheDie() {
    
        return values.get(rand.nextInt(size));
        
    }
}
