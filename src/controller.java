import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class controller implements Initializable {

    @FXML
    private CheckBox login_checkBox;

    @FXML
    private AnchorPane login_form;

    @FXML
    private Button login_login;

    @FXML
    private PasswordField login_password;

    @FXML
    private Hyperlink login_registerhere;

    @FXML
    private ComboBox<String> login_selectuser;

    @FXML
    private TextField login_showpassword;

    @FXML
    private TextField login_username;

    @FXML
    private AnchorPane main_form;

    @FXML
    private CheckBox register_checkBox;

    @FXML
    private TextField register_email;

    @FXML
    private AnchorPane register_form;

    @FXML
    private Hyperlink register_loginhere;

    @FXML
    private PasswordField register_password;

    @FXML
    private TextField register_showpassword;

    @FXML
    private Button register_signup;

    @FXML
    private TextField register_username;
    private Alertmessage alert = new Alertmessage();

    // login button action
    public void registerAccount() {

        if (register_email.getText().isEmpty() || register_username.getText().isEmpty()
                || register_password.getText().isEmpty()) {
            alert.errorMessage("Please fill all blank fields");
        } else {

            alert.confirmationMessage("successful register");
        }

    }

    // login Action 
    // public void loginAccount() {

    //     if (login_username.getText().isEmpty()
    //             || login.getText().isEmpty()) {
    //         alert.errorMessage("Please fill all blank fields");
    //     } else {

    //         alert.confirmationMessage("successful register");
    //     }

    // }

    // sign up button action
    public void LoginAccount() {

        if (login_username.getText().isEmpty()
                || login_password.getText().isEmpty()) {
            alert.errorMessage("Please fill all blank fields");
        } else {

            alert.confirmationMessage("successful register");
        }

    }

    // show password of Register form
    public void registershowpassword() {
        if (register_checkBox.isSelected()) {
            register_showpassword.setText(register_password.getText());
            register_showpassword.setVisible(true);
            register_password.setVisible(false);
        } else {
            register_showpassword.setText(register_password.getText());
            register_showpassword.setVisible(false);
            register_password.setVisible(true);
        }
    }

    // show password of login form
    public void login_showpassword() {
        if (login_checkBox.isSelected()) {
            login_showpassword.setText(login_password.getText());
            login_showpassword.setVisible(true);
            login_password.setVisible(false);
        } else {
            login_showpassword.setText(login_password.getText());
            login_showpassword.setVisible(false);
            login_password.setVisible(true);
        }
    }

    public void registerClear() {
        register_email.clear();
        register_username.clear();
        register_password.clear();
        register_showpassword.clear();
    }

    public void switchform(ActionEvent event) {
        if (event.getSource() == login_registerhere) {
            login_form.setVisible((false));
            register_form.setVisible(true);
        } else if (event.getSource() == register_loginhere) {
            login_form.setVisible((true));
            register_form.setVisible(false);
        }
    }

    // public void switchScene() throws Exception {
    //     Stage primarystage = (Stage) login_login.getScene().getWindow();
    //     primarystage.close();
    //     Parent root2 = FXMLLoader.load(getClass().getResource("startscreen.fxml"));
    //     Stage stage = new Stage();
    //     stage.setScene(new Scene(root2));
    //     stage.show();
    // }

    public void onlogin(){
        
        viewswitch.switchto(view.userscreen);
        
    }
    //  @FXML
    // void onlogin(MouseEvent event) {
    //     viewswitch.switchto(view.userscreen);
    // }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        // login_selectuser.getItems().removeAll(login_selectuser.getItems());
        // login_selectuser.getItems().addAll("Admin", "User");

    }

}
