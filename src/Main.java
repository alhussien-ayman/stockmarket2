import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primarystage) throws Exception {
        Parent root1 = FXMLLoader.load(getClass().getResource("fxmldocument.fxml"));
        primarystage.setTitle("login form");
        // primarystage.setMinWidth(320);
        // primarystage.setMaxWidth(350);
        // primarystage.setMinHeight(520);
        // primarystage.setMaxHeight(580);
        primarystage.setScene(new Scene(root1));
        //  primarystage.setMaximized(true);
        primarystage.setFullScreen(false);
        primarystage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
