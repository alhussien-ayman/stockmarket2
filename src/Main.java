import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class Main extends Application {

    @Override
    public void start(Stage primarystage) throws Exception {
        var scene = new Scene(new Pane());
        viewswitch.setScene(scene);
        viewswitch.switchto(view.FxmlDocument);
        primarystage.setScene(scene);
        primarystage.show();
        // Parent root1 = FXMLLoader.load(getClass().getResource("fxmldocument.fxml"));
        // primarystage.setTitle("login form");
        // primarystage.setMinWidth(320);
        // primarystage.setMaxWidth(350);
        // primarystage.setMinHeight(520);
        // primarystage.setMaxHeight(580);
        // primarystage.setScene(new Scene(root1,330,550));
        // primarystage.setFullScreen(false);
        // primarystage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
