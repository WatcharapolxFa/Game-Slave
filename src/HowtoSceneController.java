import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HowtoSceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button gotoMenuButton;

    @FXML
    private AnchorPane acPane;

    @FXML
    private Pane bg;

    @FXML
    void gotHowtoplay2Action(ActionEvent event) throws IOException {

        Parent menuParent = FXMLLoader.load(getClass().getResource("HowtoplayScene2.fxml"));
        Scene menuScene = new Scene(menuParent);


        Stage window =  (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(menuScene);
        window.setTitle("Slave Menu");
        window.show();
    }

    @FXML
    void initialize() {
        gotoMenuButton.getStylesheets().add("design/style.css");
        bg.getChildren().add(SetpicMainPages.setpicBgHowtoplay());
        assert gotoMenuButton != null : "fx:id=\"gotoMenuButton\" was not injected: check your FXML file 'HowtoplayScene.fxml'.";

    }
}
