/*  
 *  © Copyright yannickhuggler.com
 *
 *  [Project Title]     Roulette
 *  [Description]       The king of all casino-games implemented in JavaFX.
 *  [Authors]           Yannick Huggler
 *  [Version]           Version 1.0      
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
