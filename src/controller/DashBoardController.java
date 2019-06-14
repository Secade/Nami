package controller;

import javafx.animation.PathTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class DashBoardController {

    @FXML
    private Path trainPath, trainPathBack, trainPathReverse;

    @FXML private Rectangle train,trainBack;

    @FXML private Button test,testback,testReverse;

    public void initialize(){
        PathTransition move = new PathTransition();
        move.setDuration(Duration.seconds(5));
        move.setPath(trainPath);
        move.setNode(train);
        move.setAutoReverse(true);

        PathTransition moveBack = new PathTransition();
        moveBack.setDuration(Duration.seconds(2));
        moveBack.setPath(trainPathBack);
        moveBack.setNode(trainBack);
        moveBack.setAutoReverse(true);

        PathTransition moveReverse = new PathTransition();
        moveReverse.setDuration(Duration.seconds(2));
        moveReverse.setPath(trainPathReverse);
        moveReverse.setNode(trainBack);
        moveReverse.setAutoReverse(true);


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
            train.setStyle("-fx-fill: black");
        });

        train.setOnMouseEntered(event -> {
            train.setStyle("-fx-fill: white");
        });
    }
}
