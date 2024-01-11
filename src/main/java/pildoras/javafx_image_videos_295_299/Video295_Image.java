package pildoras.javafx_image_videos_295_299;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


/**
 * JavaFX Video295_Image
 */
public class Video295_Image extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        // Ruta de la imagen
        String rutaImagen = "file:///G:/OtrosProgramas/Downloads/foto1.jpg";

        // Crear un objeto Image
        Image imagen = new Image(rutaImagen);

        // Crear un objeto ImageView para mostrar la imagen sin efecto
        ImageView imageView1 = new ImageView(imagen);
        imageView1.setFitHeight(580);
        imageView1.setPreserveRatio(true);
        imageView1.setRotate(180);

        // Crear un objeto ImageView para mostrar la imagen con efecto MotionBlur
        ImageView imageView2 = new ImageView(imagen);
        imageView2.setFitHeight(580);
        imageView2.setPreserveRatio(true);
        imageView2.setRotate(180);

        // Aplicar el efecto MotionBlur solo a la segunda imagen
        MotionBlur motionBlur = new MotionBlur();
        //cambiando algunos parámetros de MotionBlur
        motionBlur.setAngle(45);
        motionBlur.setRadius(15);
        imageView2.setEffect(motionBlur);

        // Crear un contenedor HBox para colocar las imágenes
        HBox hbox = new HBox();
        // 20 es el espacio entre las imágenes
        hbox.setSpacing(20);
        //separacion de 10 a todo lo que tenga alrededor el contenido del box
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.getChildren().addAll(imageView1, imageView2);

        // Crear la escena
        Scene scene = new Scene(hbox, 1200, 600);
        
        
        primaryStage.setTitle("Cargar imágenes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}