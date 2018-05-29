/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.casino.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author yannick_huggler
 */
public class Roulette  {

    private static Roulette instance;

    private ObservableList<Bet> bets = FXCollections.observableArrayList();

    private RouletteWheel rw;
    
    private int winnings;

    private Roulette() {
        rw = new RouletteWheel();

    }

    

    public static Roulette getInstance() {
        if(instance == null) {
            instance = new Roulette();
        }
        return instance;
    }

    public int checkBet() {
        int ballNumber = -1;
        winnings = 0;
        Ball ball = rw.spinWheel();

        
        
        for (int i = 0; i < bets.size(); i++) {
            if (bets.get(i).getSelectedNumbers().contains(ball.getNumber())) {
                ballNumber = ball.getNumber();
                int winning = getWinning(bets.get(i).getBet(), getRatio(bets.get(i).getSelectedNumbers()));

                

               
                winnings += winning;
                System.out.println("amigo");
            } else {
               
                
            }
        }
        Player.getInstance().setAccountBalance(winnings);
        
        bets.clear();
        return ballNumber;
    }

    public int getIndexInWheel() {
        return rw.getBall().getIndexInWheel();
    }

    public int getNumber() {
        return rw.getBall().getNumber();
    }

    public int getWinning(int bet, int ratio) {
        return bet * ratio;
    }

    public int getRatio(ObservableList<Integer> selectedNumbers) {
        int ratio = ((int) (36 / selectedNumbers.size()) - 1);
        System.out.println(ratio);
        return ratio;
    }

    public void addBet(Bet bet) {
        bets.add(bet);
    }

    public ObservableList<Bet> getBets() {
        return bets;
    }
    
    public int getWinnings() {
        return winnings;
    }
}
