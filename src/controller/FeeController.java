package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.App;

public class FeeController {
    @FXML
    private ComboBox from_combo, to_combo;

    @FXML
    private Button ok_button,BeepBtn;

    @FXML
    private Label fee_label;

    @FXML
    private ImageView heatMapBtn, homeBtn;

    public void initialize(){
        from_combo.getItems().addAll("Vito Cruz Station", "Gil Puyat Station", "EDSA Station", "Taft Station", "Shaw Station");
        to_combo.getItems().addAll("Vito Cruz Station", "Gil Puyat Station", "EDSA Station", "Taft Station", "Shaw Station");

        fee_label.setVisible(false);

        ok_button.setOnAction(e -> {
            App app = new App();
            fee_label.setText(String.format("%,.2f", app.feeCalculation("", "")));
            fee_label.setVisible(true);
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
