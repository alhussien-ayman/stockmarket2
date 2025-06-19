

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

import ClassesLogic.Stock;
import ClassesLogic.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Adminscreencontroller implements Initializable {
    private static final ObservableList<ClassesLogic.User> User = null;
    @FXML
    private Button adminscreen_usermanagement;
    private Stage stage;
    @FXML
    private Button adminscreen_stockmanagement;
   
    @FXML
    private TableColumn<User, String> adminscreen_Email;

    @FXML
    private TableColumn<User, String> adminscreen_password;
    @FXML
    private TableView<User> adminscreen_tableview;

    @FXML
    private TableColumn<User, String> adminscreen_username;

    public void switchtostockscreen(ActionEvent event) {
        if (event.getSource() == adminscreen_stockmanagement) {

            try {
                Parent root = FXMLLoader.load(getClass().getResource("stockmanagement.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                // stage.setFullScreen(true);
                stage.setTitle("Stock screen section");
                stage.setScene(new Scene(root));
                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void switchtousermanagement(ActionEvent event) {
        if (event.getSource() == adminscreen_usermanagement) {

            try {
                Parent root = FXMLLoader.load(getClass().getResource("adminscreen.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                // stage.setFullScreen(true);
                stage.setTitle("Stock screen section");
                stage.setScene(new Scene(root));
                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

//  private void readCSV() {

//         String CsvFile = "E:\\Systems and Biomedical Engineer\\First year\\Second term\\OOP\\stock_manager\\src\\Users_information.csv";
//         String FieldDelimiter = ",";

//         BufferedReader br;

//         try {
//             br = new BufferedReader(new FileReader(CsvFile));

//             String line;
//             while ((line = br.readLine()) != null) {
//                 String[] fields = line.split(FieldDelimiter, -1);

//                User user = new User(fields[0], fields[1], fields[2]
//                        );
//                 dataList.add(user);

//             }

//         } catch (Exception e) {
//            e.printStackTrace();
//         } 

//     }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        adminscreen_Email.setCellValueFactory(new PropertyValueFactory<>("StudentId"));
        adminscreen_username.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        adminscreen_password.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        //add your data to the table here.
        adminscreen_tableview.setItems(User);
    }
    ObservableList<Stock> User () {
        Stock s1 = new Stock("buy", "2", "kfc", 200, "");
        Stock s2 = new Stock("buy", "2", "google", 100000, "");
        return FXCollections.observableArrayList(s1, s2);
}
}
