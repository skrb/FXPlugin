package net.javainthebox.fxplugin.container;

import java.util.ServiceLoader;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import net.javainthebox.fxplugin.plugin.PluginFactory;

public class Main extends Application {
    
    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        
        TabPane tabs = new TabPane();
        root.getChildren().add(tabs);

        loadPlugins(tabs);
        
        Scene scene = new Scene(root, 300, 250);
        
        stage.setTitle("FXPlugin");
        stage.setScene(scene);
        stage.show();
    }
    
    private void loadPlugins(TabPane tabs) {
        ServiceLoader<PluginFactory> loader
                = ServiceLoader.load(PluginFactory.class);
        
        loader.forEach(factory -> {
            Tab tab = new Tab(factory.getName());
            factory.createPlugin().ifPresent(plugin -> tab.setContent(plugin.getContent()));
            
            tabs.getTabs().add(tab);
        });
    }

    public static void main(String... args) {
        launch(args);
    }
}
