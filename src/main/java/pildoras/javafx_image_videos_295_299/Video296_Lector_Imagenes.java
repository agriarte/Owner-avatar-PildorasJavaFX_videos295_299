/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.javafx_image_videos_295_299;

import java.io.File;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javafx.scene.layout.Region;

/**
 *
 * @author Pedro
 */
public class Video296_Lector_Imagenes extends Application {

    private final String RUTA = "G:" + File.separator + "OtrosProgramas" + File.separator + "Downloads";

    @Override
    public void start(Stage primaryStage) {

        // Crear un TilePane
        TilePane miTilePane = new TilePane();

        // Configuración del TilePane
        miTilePane.setPrefColumns(3);
        miTilePane.setHgap(20);
        miTilePane.setVgap(20);
        miTilePane.setPadding(new Insets(20));

        // Agregar contenido al TilePane (nodos, controles, etc.)
        // Crear un ScrollPane y establecer el contenido como el TilePane
        ScrollPane miPane = new ScrollPane(miTilePane);

        // Establecer propiedades del ScrollPane según sea necesario
        //miPane.setFitToWidth(true);
        //miPane.setFitToHeight(true);
        //*** carga de imagenes
        //Objeto File con la ruta a las imágenes a cargar
        File miDir = new File(RUTA);
        //Array de todos los archivos del directorio RUTA
        File[] misArchivos = miDir.listFiles();

        //para probar imprimir por consola los archivos
        for (File f : misArchivos) {
            /* ALGUNAS PRUEBAS PARA ENTENDER EL MANEJO DE ARCHIVOS
            System.out.println(f);// imprime toda la ruta con el nombre: G:\OtrosProgramas\Downloads\foto1.jpg
            System.out.println(f.getName());// imprimir el nombre: foto1.jpg
            System.out.println(f.toURI().toString());// imprimir el identificador de la ruta: file:/G:/OtrosProgramas/Downloads/foto1.jpg
            // File.toURI() se utiliza para obtener la representación de URI (Identificador Uniforme de Recurso) del archivo correspondiente. 
             */

            //Objeto imagen con la ruta en formato URI, ancho, alto, booleano de proporciones, booleano de suavizado/calidad
            Image miImage = new Image(f.toURI().toString(), 200, 200, true, true);
            //Objeto tipo vista con la imagen. Ya puede añadirse a un panel
            ImageView miImageView = new ImageView(miImage);

            //Objeto texto para poner el nombre del archivo debajo de la imagen
            Text nombreImg = new Text(f.getName());
            nombreImg.setFont(new Font("Time New Roman", 16));

            //Objeto Region. Se usa como un separador. En este caso es un espacio vacío.
            //Se puede configurar tamaño de la region.(Ejemplo del curso. Personalmente, no me gusta 
            //el uso que se le da en este ejemplo. Prefiero otras soluciones para separar elementos.
            Region miRegion = new Region();
            
           

            //Panel vertical con Imagen y Nombre
            VBox miVBox = new VBox(10, miImageView, miRegion, nombreImg);

            //agregar finalmente al TilePane de 4 columnas los VBox
            miTilePane.getChildren().add(miVBox);

        }

        Scene scene = new Scene(miPane, 1000, 600);

        primaryStage.setTitle("Lector de Imágenes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
