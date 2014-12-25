package netjavainthebox.fxplugin.buttonplugin;

import java.io.IOException;
import java.util.Optional;
import net.javainthebox.fxplugin.plugin.Plugin;
import net.javainthebox.fxplugin.plugin.PluginFactory;

public class ButtonPluginFactory implements PluginFactory {

    @Override
    public String getName() {
        return "Button";
    }

    @Override
    public Optional<Plugin> createPlugin() {
        try {
            return Optional.of(new ButtonPlugin());
        } catch (IOException ex) {
            return Optional.empty();
        }
    }
}
