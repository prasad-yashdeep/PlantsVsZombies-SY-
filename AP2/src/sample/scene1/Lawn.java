package sample.scene1;

import com.sun.glass.ui.Timer;
import com.sun.javafx.fxml.builder.JavaFXImageBuilder;
import javafx.animation.PathTransition;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import java.awt.*;

import java.net.URL;
import java.time.Instant;
import java.util.ResourceBundle;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.util.Duration;

import javax.swing.*;

public class Lawn implements Initializable {

    @FXML
    private  Button bb1;
    @FXML
    public ImageView img1;
    @FXML
    public ImageView img2;
    @FXML
    public ImageView img3;
    @FXML
    public ImageView img4;
    @FXML
    public ImageView img5;
    @FXML

    public ImageView img6;
    @FXML


    public ImageView img7;
    @FXML

    public ImageView img8;
    @FXML


    public ImageView img9;
    @FXML


    public ImageView img10;
    @FXML

    public ImageView img11;

    @FXML

    public ImageView iimg12;

    @FXML
    private Text status;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Line line1 = new Line();
        line1.setStartX(61.0);
        line1.setStartY(1.0);
        line1.setEndX(430.0);
        line1.setEndY(1.0);

        Line line2 = new Line();
        line2.setStartX(61.0);
        line2.setStartY(1.0);
        line2.setEndX(430.0);
        line2.setEndY(1.0);

        Line line3 = new Line();
        line3.setStartX(61.0);
        line3.setStartY(1.0);
        line3.setEndX(430.0);
        line3.setEndY(1.0);


        Line line4 = new Line();
        line4.setStartX(61.0);
        line4.setStartY(1.0);
        line4.setEndX(430.0);
        line4.setEndY(1.0);

        Line line5 = new Line();
        line5.setStartX(61.0);
        line5.setStartY(1.0);
        line5.setEndX(430.0);
        line5.setEndY(1.0);

        Line line6 = new Line();
        line6.setStartX(0.0);
        line6.setStartY(0.0);
        line6.setEndX(-300.0);
        line6.setEndY(0.0);

        Line line7 = new Line();
        line7.setStartX(0.0);
        line7.setStartY(0.0);
        line7.setEndX(0.0);
        line7.setEndY(200.0);



        PathTransition transition = new PathTransition();
        transition.setNode(img1);
        transition.setDuration(Duration.seconds(5));
        transition.setPath(line1);
        //transition.setDelay(Duration.seconds(5));
        transition.play();

        PathTransition transition2 = new PathTransition();
        transition2.setNode(img2);
        transition2.setDuration(Duration.seconds(5));
        transition2.setPath(line2);
        transition2.setDelay(Duration.seconds(5));
        transition2.play();

        PathTransition transition3 = new PathTransition();
        transition3.setNode(img3);
        transition3.setDuration(Duration.seconds(5));
        transition3.setPath(line3);
        transition3.setDelay(Duration.seconds(10));
        transition3.play();

        PathTransition transition4 = new PathTransition();
        transition4.setNode(img4);
        transition4.setDuration(Duration.seconds(5));
        transition4.setPath(line4);
        transition4.setDelay(Duration.seconds(15));
        transition4.play();


        PathTransition transition5 = new PathTransition();
        transition5.setNode(img5);
        transition5.setDuration(Duration.seconds(5));
        transition5.setPath(line5);
        transition5.setDelay(Duration.seconds(20));
        transition5.play();

        PathTransition transition6 = new PathTransition();
        transition6.setNode(img6);
        transition6.setDuration(Duration.seconds(5));
        transition6.setPath(line6);
        transition6.setDelay(Duration.seconds(25));
        transition6.play();

        PathTransition transition7 = new PathTransition();
        transition7.setNode(img7);
        transition7.setDuration(Duration.seconds(5));
        transition7.setPath(line6);
        transition7.setDelay(Duration.seconds(30));
        transition7.play();

        PathTransition transition8 = new PathTransition();
        transition8.setNode(img8);
        transition8.setDuration(Duration.seconds(5));
        transition8.setPath(line6);
        transition8.setDelay(Duration.seconds(35));
        transition8.play();

        PathTransition transition9 = new PathTransition();
        transition9.setNode(img9);
        transition9.setDuration(Duration.seconds(5));
        transition9.setPath(line6);
        transition9.setDelay(Duration.seconds(40));
        transition9.play();

        PathTransition transition10 = new PathTransition();
        transition10.setNode(img10);
        transition10.setDuration(Duration.seconds(5));
        transition10.setPath(line6);
        transition10.setDelay(Duration.seconds(45));
        transition10.play();


        PathTransition transition11 = new PathTransition();
        transition11.setNode(img11);
        transition11.setDuration(Duration.seconds(5));
        transition11.setPath(line6);
        transition11.setDelay(Duration.seconds(50));
        transition11.play();

        PathTransition transition12 = new PathTransition();
        transition12.setNode(iimg12);
        transition12.setDuration(Duration.seconds(5));
        transition12.setPath(line7);
        //transition12.setDelay(Duration.seconds(50));
        transition12.play();



    }

    @FXML
    private void displaypos(MouseEvent Event){
        status.setText("x="+Event.getX() + "  " + "Y=" + Event.getY());
    }

    @FXML
    private ProgressBar ipb1;


    static double ii = 0;
    //EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e)
    {
        // set progress to different level of progressbar
            ii += 0.1;
            ipb1.setProgress(ii);

    }

}
