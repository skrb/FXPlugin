package net.javainthebox.fxplugin.listplugin;

import java.io.IOException;
import java.util.Optional;
import net.javainthebox.fxplugin.plugin.Plugin;
import net.javainthebox.fxplugin.plugin.PluginFactory;

public class ListPluginFactory implements PluginFactory {
    @Override
    public String getName() {
        return "List";
    }

    @Override
    public Optional<Plugin> createPlugin() {
        try {
            return Optional.of(new ListPlugin());
        } catch (IOException ex) {
            return Optional.empty();
        }
    }    
}
