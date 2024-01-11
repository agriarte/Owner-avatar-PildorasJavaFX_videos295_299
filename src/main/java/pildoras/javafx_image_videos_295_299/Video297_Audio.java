/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.javafx_image_videos_295_299;

import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class Video297_Audio extends Application {

    @Override
    public void start(Stage primaryStage) {

        Text texto1 = new Text("Sonando audio");
        
       
        
        HBox miHBox = new HBox(20, texto1);
        
       
        
        
        // Crear un contenedor StackPane
        StackPane root = new StackPane();
        root.getChildren().add(miHBox);

        // Crear la escena
        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Audio");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        String RUTA = "G:" + File.separator + "OtrosProgramas" + File.separator + "Downloads" + File.separator + "sonido.mp3";      
        File miAudio = new File (RUTA);
        
        Media miMedia = new Media(miAudio.toURI().toString());
        MediaPlayer miPlayer = new MediaPlayer(miMedia);
        
        miPlayer.play();
                
    }

    public static void main(String[] args) {
        launch();
    }

}
