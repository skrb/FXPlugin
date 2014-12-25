package net.javainthebox.fxplugin.listplugin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class ListPluginViewController implements Initializable {
    @FXML
    private ListView list;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        list.getItems().addAll("Crosby", "Stills", "Nash", "Young");
    }    
    
}
