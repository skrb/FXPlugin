package netjavainthebox.fxplugin.buttonplugin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ButtonPluginViewController implements Initializable {

    @FXML
    private void action(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Button Plugin");
        alert.getDialogPane().setHeaderText("Button Plugin");
        alert.getDialogPane().setContentText("Button Plugin");
        alert.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
