/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.javafx_image_videos_295_299;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class Video295_Image_sencillo extends Application {
    
    @Override
 public void start(Stage primaryStage) {
        
        // Ruta de la imagen
        String rutaImagen = "file:///G:/OtrosProgramas/Downloads/foto1.jpg";

        // Crear un objeto Image
        Image imagen = new Image(rutaImagen);

        // Crear un objeto ImageView para mostrar la imagen
        ImageView imageView1 = new ImageView(imagen);
        imageView1.setFitHeight(580);
        imageView1.setPreserveRatio(true);
        imageView1.setRotate(180);

       // Crear un contenedor StackPane para colocar la imagen en el centro
        StackPane root = new StackPane();
        root.getChildren().add(imageView1);

        // Crear la escena
        Scene scene = new Scene(root, 1200, 600);
        
        
        primaryStage.setTitle("Cargar imágenes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}