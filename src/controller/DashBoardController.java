package controller;

import javafx.animation.PathTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DashBoardController {

    @FXML
    private Path trainPath, trainPathBack, trainPathReverse;

    @FXML private ImageView train,trainBack, heatMapBtn, homeBtn, fareBtn, trainCapacity, mapPic;

    @FXML private Button test,testback,testReverse;

    @FXML private AnchorPane trainDetails;
    @FXML private Label trainName;

    private boolean isDetailsOpen;

    public void initialize(){
        isDetailsOpen=false;
        PathTransition move = new PathTransition();
        move.setDuration(Duration.seconds(5));
        move.setPath(trainPath);
        move.setNode(train);
        move.setAutoReverse(true);

        PathTransition moveBack = new PathTransition();
        moveBack.setDuration(Duration.seconds(5));
        moveBack.setPath(trainPathBack);
        moveBack.setNode(trainBack);
        moveBack.setAutoReverse(true);

        PathTransition moveReverse = new PathTransition();
        moveReverse.setDuration(Duration.seconds(5));
        moveReverse.setPath(trainPathReverse);
        moveReverse.setNode(trainBack);
        moveReverse.setAutoReverse(true);
        train.setOpacity(1);
        move.play();
        move.setOnFinished(event -> {
            trainBack.setOpacity(1);
            train.setImage(new Image(getClass().getResourceAsStream("/assets/crashed_train_icon.png")));
            moveBack.play();

            moveBack.setOnFinished(event1 -> {
                moveReverse.play();
                moveReverse.setOnFinished(event2 -> {

                });
            });
        });

        mapPic.setOnMouseClicked(event -> {
            if (isDetailsOpen)
                trainDetails.setOpacity(0);
        });

        homeBtn.setOnMouseClicked(event -> {
            try {
                FXMLLoader pane = new FXMLLoader(getClass().getResource("/view/HeatMap.fxml"));
                Stage stage = (Stage) homeBtn.getScene().getWindow();
                Scene scene = new Scene(pane.load());
                stage.setScene(scene);
            } catch (Exception b) {
                b.printStackTrace();
            }
        });

        fareBtn.setOnMouseClicked(event -> {
            try {
                FXMLLoader pane = new FXMLLoader(getClass().getResource("/view/Fee.fxml"));
                Stage stage = (Stage) fareBtn.getScene().getWindow();
                Scene scene = new Scene(pane.load());
                stage.setScene(scene);
            } catch (Exception b) {
                b.printStackTrace();
            }
        });

        test.setOnAction(event -> {
            move.play();

        });

        testback.setOnAction(event -> {
            moveBack.play();

        });

        testReverse.setOnAction(event -> {
            moveReverse.play();
        });

        train.setOnMouseClicked(event -> {
            isDetailsOpen=true;
            trainDetails.setOpacity(1);
            trainName.setText("Train Name: A-09");
            trainCapacity.setImage(new Image(getClass().getResourceAsStream("/assets/three_is_a_crowd_icon.png")));
        });

        trainBack.setOnMouseClicked(event -> {
            isDetailsOpen=true;
            trainDetails.setOpacity(1);
            trainName.setText("Train Name: B-02");
            trainCapacity.setImage(new Image(getClass().getResourceAsStream("/assets/two_icon.png")));
        });
    }
}
