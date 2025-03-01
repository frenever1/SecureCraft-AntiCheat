package com.yourplugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CheatDetector {

    private static Set<String> cheatsList = new HashSet<>();

    // Загрузка списка читов из файла
    public static void loadCheatList() throws IOException {
        File cheatFile = new File("plugins/AntiCheat/logsoft.txt");
        if (!cheatFile.exists()) {
            throw new IOException("Файл logsoft.txt не найден!");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(cheatFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                cheatsList.add(line.trim().toLowerCase());
            }
        }
    }

    // Метод для проверки, используется ли какой-то чит
    public static boolean isCheatDetected(String cheatName) {
        return cheatsList.contains(cheatName.toLowerCase());
    }
}