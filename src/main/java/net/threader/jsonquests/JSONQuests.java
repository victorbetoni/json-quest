package net.threader.jsonquests;

import org.bukkit.plugin.java.JavaPlugin;

public class JSONQuests extends JavaPlugin {
    private static JSONQuests instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static JSONQuests instance() {
        return instance;
    }
}
