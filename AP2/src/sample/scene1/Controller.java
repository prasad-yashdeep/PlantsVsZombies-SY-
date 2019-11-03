package sample.scene1;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button b1;

    @FXML
    private AnchorPane s1;

    @FXML
    private StackPane y1;

    @FXML
    private Button button2;

    @FXML
    private ProgressBar pb;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void loadSecond(ActionEvent event) throws IOException{
        System.out.println("yo");
        Parent root = FXMLLoader.load(getClass().getResource("sample1.fxml"));
        System.out.println("yo");
        Scene scene = b1.getScene();
        root.translateXProperty().set(scene.getWidth());
        y1.getChildren().add(root);
        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateXProperty(),0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(event1 -> {
            System.out.println("yo");
            y1.getChildren().remove(s1);
        });
        timeline.play();

    }


    static double ii = 0;
    //EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                // set progress to different level of progressbar
                while(ii<=1) {
                    ii += 0.00000001;
                    pb.setProgress(ii);
                }
            }



}
