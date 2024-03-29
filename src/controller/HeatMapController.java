package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HeatMapController {

    @FXML
    ScrollPane newsUpdates;

    @FXML
    ImageView heatMapBtn, homeBtn, fareBtn;

    @FXML private Button BeepBtn;

    public void initialize(){


        heatMapBtn.setOnMouseClicked(event -> {
            try {
                FXMLLoader pane = new FXMLLoader(getClass().getResource("/view/DashBoard.fxml"));
                Stage stage = (Stage) heatMapBtn.getScene().getWindow();
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

        BeepBtn.setOnMouseClicked(event -> {
            try {
                FXMLLoader pane = new FXMLLoader(getClass().getResource("/view/Beep.fxml"));
                Stage stage = (Stage) BeepBtn.getScene().getWindow();
                Scene scene = new Scene(pane.load());
                stage.setScene(scene);
            } catch (Exception b) {
                b.printStackTrace();
            }
        });
    }
}
