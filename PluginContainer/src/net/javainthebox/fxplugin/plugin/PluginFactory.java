package net.javainthebox.fxplugin.plugin;

import java.util.Optional;

public interface PluginFactory {
    String getName();
    Optional<Plugin> createPlugin();
}
