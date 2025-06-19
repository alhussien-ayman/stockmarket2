import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import ClassesLogic.Stock;
import javafx.beans.binding.StringBinding;
import javafx.collections.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class stockcontroller implements Initializable {
    @FXML
    private Button UserScreen2_orderstocks;
    @FXML
    private Button userscreen2_deposit;
    @FXML
    private Button userscreen2_Home;
    @FXML
    private TableView<Stock> tableview;

    @FXML
    private TableColumn<Stock, String> tableview_Buy;

    @FXML
    private TableColumn<Stock, Double> tableview_Price;

    @FXML
    private TableColumn<Stock, String> tableview_name;

    @FXML
    private TableColumn<Stock, String> tableview_number;

    @FXML
    private TableColumn<Stock, String> tableview_quantity;
    private Stage stage;
    private Parent root;

    public void switchtostockscreen(ActionEvent event) {
        if (event.getSource() == UserScreen2_orderstocks) {

            try {
                Parent root = FXMLLoader.load(getClass().getResource("stockscreen.fxml"));
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

    public void switchtohomescreen(ActionEvent event) {
        if (event.getSource() == userscreen2_Home) {

            try {
                Parent root = FXMLLoader.load(getClass().getResource("UserScreen2.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                // stage.setFullScreen(true);
                stage.setTitle("Home screen section");
                stage.setScene(new Scene(root));
                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void switchtodepositscreen(ActionEvent event) {
        if (event.getSource() == userscreen2_deposit) {

            try {
                Parent root = FXMLLoader.load(getClass().getResource("depositscreen.fxml"));
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

    // read csv of table view
    private void readCSVtableview() {

        File csvFile = new File(Main.file);
        String FieldDelimiter = ",";
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(csvFile));

            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(FieldDelimiter, -1);

                Stock stock = new Stock (fields[0], fields[1], fields[2],
                        0, fields[3]);
                List<Stock> dataList;
               ((List<Stock>) csvFile).add(stock);

            }

        } catch (Exception e) {
            e.printStackTrace();

    }

    }

    ObservableList<Stock> initialDate() {
        Stock s1 = new Stock("buy", "2", "kfc", 200, "");
        Stock s2 = new Stock("buy", "2", "google", 100000, "");
        Stock s3 = new Stock("buy", "2", "google", 100000, "");
        Stock s4 = new Stock("buy", "2", "google", 100000, "");
        Stock s5 = new Stock("buy", "2", "google", 100000, "");
        Stock s6 = new Stock("buy", "2", "google", 100000, "");
        Stock s7 = new Stock("buy", "2", "google", 100000, "");
        Stock s8 = new Stock("buy", "2", "google", 100000, "");
        Stock s9 = new Stock("buy", "2", "google", 100000, "");
        Stock s10 = new Stock("buy", "2", "google", 100000, "");
        Stock s11 = new Stock("buy", "2", "google", 100000, "");
        Stock s12 = new Stock("buy", "2", "google", 100000, "");
        Stock s13 = new Stock("buy", "2", "google", 100000, "");
        Stock s14 = new Stock("buy", "2", "google", 100000, "");
        Stock s15 = new Stock("buy", "2", "google", 100000, "");
        Stock s16 = new Stock("buy", "2", "google", 100000, "");
        Stock s17 = new Stock("buy", "2", "google", 100000, "");
        return FXCollections.observableArrayList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16,
                s17);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        tableview_Buy.setCellValueFactory(new PropertyValueFactory<Stock, String>("buy"));
        tableview_number.setCellValueFactory(new PropertyValueFactory<Stock, String>("number"));
        tableview_name.setCellValueFactory(new PropertyValueFactory<Stock, String>("name"));
        tableview_Price.setCellValueFactory(new PropertyValueFactory<Stock, Double>("Price"));
        tableview_quantity.setCellValueFactory(new PropertyValueFactory<Stock, String>("quantity"));
        tableview.setItems(initialDate());
    }

}
