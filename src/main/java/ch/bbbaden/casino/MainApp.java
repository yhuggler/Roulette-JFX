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

package ch.bbbaden.casino;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainApp extends Application {

    private static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        
        // removes the top bar of the application window. (undecorated stage)
        stage.initStyle(StageStyle.TRANSPARENT);
        
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/roulette/RouletteMainView.fxml"));

        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        
        stage.setTitle("Casino");
        stage.setScene(scene);
        stage.show();
        
        
    }

    
    /**
     * Getter for the stage to allow scene switching in other classes.
     * @return 
     */
    public static Stage getStage() {
        return stage;
    }
}
