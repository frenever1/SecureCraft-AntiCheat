package com.yourplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class AntiCheat extends JavaPlugin {

    @Override
    public void onEnable() {
        // Загружаем конфигурацию
        saveDefaultConfig();
        ConfigHandler.loadConfig(this);

        // Загружаем список читов
        try {
            CheatDetector.loadCheatList();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Регистрация событий
        Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);

        // Сообщение в консоль
        getLogger().info("AntiCheat плагин с AntiBotDetector и CheatDetector загружен успешно!");
    }

    @Override
    public void onDisable() {
        getLogger().info("AntiCheat плагин выключен.");
    }
}