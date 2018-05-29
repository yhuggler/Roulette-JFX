/*  
 *  © Copyright Gummybears
 *
 *  [Project Title]     Casino-Application
 *  [Description]       An application with which you can play the most popular casino-games
 *                      including Blackjack, Roulette, Baccara, Bingo and Yatzy.
 *  [Authors]           Kim Strasser,
 *                      Philip Lackmann,
 *                      Patrick Dähler,
 *                      Jelle Schutter,
 *                      Yannick Huggler
 *  [Version]           1.0-SNAPSHOT        
 */
package ch.bbbaden.casino.model;

public class Player {
    private static Player instance = null;
   
    private double accountBalance = 1000;
    
    
    /**
     * Private constructor due to the use of the singleton-pattern.
     */
    private Player() {
        
    }
    
    /**
     * If there is no player-object, it gets created, otherwise it just returns the aforementioned object.
     * @return Player object
     */
    public static Player getInstance() {
        if(instance == null) {
            instance = new Player();
        }
        return instance;
    }
    
   

    public double getAccountBalance() {
        return accountBalance;
    }
    
    /**
     * Adds the difference of balance to the player's account balance.
     * @param difference 
     */
    public void setAccountBalance(double difference) {
        this.accountBalance += difference;
    } 
    
    
    
    
}
