/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.javafx_image_videos_295_299;

import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class Video299_MediaPlayerVideo extends Application {
    
    @Override
 public void start(Stage primaryStage) {
        
         // Ruta de la imagen utilizando el sistema de archivos independiente del sistema operativo
        
        String rutaVideo = "G:" + File.separator + "OtrosProgramas" + File.separator + "Downloads" + File.separator + "videoejemplo.mp4";
        File fileVideo = new File(rutaVideo);

        if (!fileVideo.exists()) {
            System.out.println("Archivo no existe en la ruta especificada.");
            System.exit(1);
        }

        // Crear un objeto Media desde el archivo
        Media miMedia = new Media(fileVideo.toURI().toString());

        // Crear un objeto MediaPlayer
        MediaPlayer miMediaPlayer = new MediaPlayer(miMedia);
        
        miMediaPlayer.setAutoPlay(true);
        
        //caja donde se reproduce el elemento MediaView
        //por defecto respeta proporciones del video
        MediaView miMediaView = new MediaView(miMediaPlayer);
        
        miMediaView.setFitWidth(1280);
        miMediaView.setFitHeight(720);

        
       // Crear un contenedor StackPane para colocar la imagen en el centro
        StackPane root = new StackPane();
        root.getChildren().add(miMediaView);

        // Crear la escena
        Scene scene = new Scene(root, 1280, 720);
        
        
        primaryStage.setTitle("Cargar imágenes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}