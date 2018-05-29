/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.casino.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author yannick_huggler
 */
public class RouletteWheel {
    
    List<Integer> wheelNumbers;
    
    private Ball ball;
    
    public RouletteWheel() {
        wheelNumbers = Arrays.asList(0, 26, 3, 35, 12, 28, 7, 29, 18, 22, 9, 31, 14, 20, 1, 33, 16, 24, 5, 10, 23, 8, 30, 11, 36, 13, 27, 6, 34, 17, 25, 2, 21, 4, 19, 15, 32);

    }
    
    public Ball spinWheel() {
        
        int randomNumber = (int)(Math.random() * 36);
        int index = wheelNumbers.indexOf(randomNumber);
        
        this.ball = new Ball(randomNumber, index);
        return ball;
    }

    
    public List<Integer> getWheelNumbers() {
        return wheelNumbers;
    }
    
    public Ball getBall() {
        return ball;
    }
}
