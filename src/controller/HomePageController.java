package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HomePageController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Rectangle loginBox;

    @FXML
    private Button loginBtn;

    @FXML
    private Rectangle registerBox;

    @FXML
    private Button registerBtn;

    @FXML
    private Button guestLogin;

    public void initialize(){

        loginBtn.setOnMouseEntered(event -> {
            loginBox.setStyle("-fx-fill: #F6DA76;");
        });

        loginBtn.setOnMouseExited(event -> {
            loginBox.setStyle("-fx-fill: #F8D65F;");
        });

        registerBtn.setOnMouseEntered(event -> {
            registerBox.setStyle("-fx-fill: #F6DA76;");
        });

        registerBtn.setOnMouseExited(event -> {
            registerBox.setStyle("-fx-fill: #F8D65F;");
        });

        guestLogin.setOnAction(event -> {
            try {
                FXMLLoader pane = new FXMLLoader(getClass().getResource("/view/DashBoard.fxml"));
                Stage stage = (Stage) loginBtn.getScene().getWindow();
                Scene scene = new Scene(pane.load());
                stage.setScene(scene);
            } catch (Exception b) {
                b.printStackTrace();
            }
        });
    }
}
