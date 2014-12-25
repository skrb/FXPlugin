package net.javainthebox.fxplugin.listplugin;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import net.javainthebox.fxplugin.plugin.Plugin;

public class ListPlugin implements Plugin {
    private AnchorPane content;
    private ListPluginViewController controller;

    public ListPlugin() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ListPluginView.fxml"));
        content =loader.load();
        controller = loader.getController();
    }

    @Override
    public Node getContent() {
        return content;
    }
}
