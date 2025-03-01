package com.yourplugin;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigHandler {
    private static FileConfiguration config;

    public static void loadConfig(JavaPlugin plugin) {
        plugin.saveDefaultConfig();
        config = plugin.getConfig();
    }

    public static double getMaxSpeed() {
        return config.getDouble("antiCheat.speedHack.maxSpeed", 0.7);
    }

    public static boolean isAutoClickerEnabled() {
        return config.getBoolean("antiCheat.autoClicker.enabled", true);
    }

    public static int getMaxClickInterval() {
        return config.getInt("antiCheat.autoClicker.maxClickInterval", 100);
    }

    public static boolean isFlyHackEnabled() {
        return config.getBoolean("antiCheat.flyHack.enabled", true);
    }

    public static boolean isHighPingEnabled() {
        return config.getBoolean("antiCheat.highPing.enabled", true);
    }

    public static int getMaxPing() {
        return config.getInt("antiCheat.highPing.maxPing", 500);
    }

    public static boolean isNotificationsEnabled() {
        return config.getBoolean("antiCheat.notifications.enabled", true);
    }

    public static String getAdminPermission() {
        return config.getString("antiCheat.notifications.adminPermission", "anticheat.notify");
    }
}