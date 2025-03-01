package com.yourplugin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ViolationLogger {

    private static File logFile;

    static {
        logFile = new File("plugins/AntiCheat/logs/violations.log");
        if (!logFile.exists()) {
            try {
                logFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void logViolation(String playerName, String cheatType) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            String logMessage = System.currentTimeMillis() + " | " + playerName + " detected for " + cheatType;
            writer.write(logMessage);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}