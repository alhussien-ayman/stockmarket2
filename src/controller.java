import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
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


    public void switchform(ActionEvent event) {
        if (event.getSource() == login_registerhere) {
            login_form.setVisible((false));
            register_form.setVisible(true);
        } else if (event.getSource() == register_loginhere) {
            login_form.setVisible((true));
            register_form.setVisible(false);
        }
    }

    // user or admin list
    // @SuppressWarnings("unchecked")
    public void userList() {

        List< String > listU = new ArrayList<>();

        for (String data : useroradmin.user) {
            listU.add(data);
        }
       
        ObservableList listData = FXCollections.observableList(listU);
        login_selectuser.setItems(listData);
    }

    // login_login button
    public void loginsuccess() {
        if (login_username.getText().isEmpty() || login_password.getText().isEmpty()) {
            alert.errorMessage("fill in the planks please!");
        } else

        {
            alert.confirmationMessage("you are successfully created account ");
        }

    }
    // @FXML
    // private Button button;

    // @FXML
    // private Label label;
    // @FXML
    // void handleButtonAction(ActionEvent event) {
    // }
    // first switch page
    public void switchPage(ActionEvent event) {

        if (!login_username.getText().isEmpty() && !login_password.getText().isEmpty()) {
            if (login_selectuser.getSelectionModel().getSelectedItem() == "admin") {

                try {
                    Parent root = FXMLLoader.load(getClass().getResource("fxmldocument.fxml"));
                    Stage stage = new Stage();

                    stage.setTitle("Stock Manager");

                    stage.setMinWidth(340);
                    stage.setMinHeight(580);
                    stage.setScene(new Scene(root ));
                    stage.show();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (login_selectuser.getSelectionModel().getSelectedItem() == "user") {

                try {
                    Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("UserScreen2.fxml"));
                    Stage stage = new Stage();
                    stage.setTitle("Stock Exchange");
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (login_username.getText().isEmpty() && login_password.getText().isEmpty()) {
            alert.errorMessage("fill in the planks please!");
        }
    }

    // public void homepagecontroller(ActionEvent event) {
    // if (event.getSource() == user_stockbtn) {
    // homescreen.setVisible((false));
    // stockscreen.setVisible(true);
    // } else if (event.getSource() == user_homebtn) {
    // homescreen.setVisible((true));
    // stockscreen.setVisible(false);
    // }else if (event.getSource() == login_login){
    // homescreen.setVisible((true));
    // stockscreen.setVisible(false);
    // main_form.setVisible(false);
    // }
    // }

    public void onlogin() {

        viewswitch.switchto(view.userscreen);

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
       
        userList();
        // login_selectuser.getItems().removeAll(login_selectuser.getItems());
        // userList();

    }

}
