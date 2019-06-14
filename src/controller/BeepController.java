package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class BeepController {

    @FXML
    private ImageView  heatMapBtn, homeBtn, fareBtn,BeepBtn;


    public void initialize(){
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
    }
}
