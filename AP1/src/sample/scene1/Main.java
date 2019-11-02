package sample.scene1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene scene1,scene2,scene3;
    ProgressBar p1;
    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/sample/scene1/sample.fxml"));
        Parent root1 = FXMLLoader.load(getClass().getResource("/sample/scene1/sample1.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("/sample/scene1/lawn.fxml"));
        window.setTitle("Plants VS Zombies");
        scene1=new Scene(root, 500, 500);
        scene2=new Scene(root1, 500, 500);
        scene3=new Scene(root2, 700, 400);
       // p1 = new
        HBox  hb = new HBox();

        Image img1= new Image(getClass().getResourceAsStream("download.jpeg"));
        Button b1 = new Button("",new ImageView(img1));
        hb.getChildren().add(b1);
        window.setScene(scene3);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
