package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
       Scene scene = new Scene(root);
       scene.getStylesheets().add(String.valueOf(getClass().getResource("styles.css")));
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX is my nigga");
        primaryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
