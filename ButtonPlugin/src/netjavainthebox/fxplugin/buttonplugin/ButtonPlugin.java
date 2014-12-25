package netjavainthebox.fxplugin.buttonplugin;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import net.javainthebox.fxplugin.plugin.Plugin;

public class ButtonPlugin implements Plugin {
    private AnchorPane content;
    private ButtonPluginViewController controller;
    
    public ButtonPlugin() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ButtonPluginView.fxml"));
        content =loader.load();
        controller = loader.getController();
    }

    @Override
    public Node getContent() {
        return content;
    }
}
