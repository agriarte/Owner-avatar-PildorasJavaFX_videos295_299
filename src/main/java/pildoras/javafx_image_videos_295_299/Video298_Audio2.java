/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.javafx_image_videos_295_299;

import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class Video298_Audio2 extends Application {

    @Override
    public void start(Stage primaryStage) {

        String RUTA = "G:" + File.separator + "OtrosProgramas" + File.separator + "Downloads" + File.separator + "sonido.mp3";
        File miAudio = new File(RUTA);

        Media miMedia = new Media(miAudio.toURI().toString());
        MediaPlayer miPlayer = new MediaPlayer(miMedia);

        Text texto1 = new Text("Sonando audio");

        Button playBtn = new Button("Play/Pause");
        Button stopBtn = new Button("Stop");

        // Establecer propiedades visuales individuales
        texto1.setStyle("-fx-font-size: 16; -fx-fill: darkblue;");
        playBtn.setStyle("-fx-font-size: 14;");
        stopBtn.setStyle("-fx-font-size: 14;");

        HBox miHBox = new HBox(20, texto1, playBtn, stopBtn);
        
        // Alinear el HBox al centro horizontalmente
        miHBox.setAlignment(Pos.CENTER);
        
        playBtn.setOnAction(e -> {
            if (miPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
                miPlayer.pause(); // Pausar si está reproduciéndose
            } else {
                miPlayer.play(); // Reproducir si no está reproduciéndose
            }
        });

        stopBtn.setOnAction(e -> {
            miPlayer.stop();
        });

        // Crear un contenedor StackPane
        StackPane root = new StackPane();
        root.getChildren().add(miHBox);

        // Crear la escena
        Scene scene = new Scene(root, 400, 50);

        primaryStage.setTitle("Audio");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}
