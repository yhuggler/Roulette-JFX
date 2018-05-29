/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.casino.model;

import javafx.collections.ObservableList;

/**
 *
 * @author yannickhuggler
 */
public class Bet {
    
    private ObservableList<Integer> selectedNumbers;
    private int bet;
    
    public Bet(ObservableList<Integer> selectedNumbers, int bet) {
        this.selectedNumbers = selectedNumbers;
        this.bet = bet;
    }
    
    public ObservableList<Integer> getSelectedNumbers() {
        return selectedNumbers;
    }
    
    public int getBet() {
        return bet;
    }
}
