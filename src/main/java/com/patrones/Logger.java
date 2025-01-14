package com.patrones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;

    // Livelli di log supportati
    public enum LogLevel {
        DEBUG, INFO, WARNING, ERROR
    }

    private LogLevel currentLogLevel = LogLevel.INFO; // Livello di log predefinito

    // Constructor privado
    private Logger() {
        try {
            // Crear o abrir el archivo para escribir logs
            FileWriter fileWriter = new FileWriter("output.txt", true); // Modo append
            writer = new PrintWriter(fileWriter, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener la instancia única
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Metodo per configurare il livello di log
    public void setLogLevel(LogLevel level) {
        this.currentLogLevel = level;
    }

    // Metodo per registrare logs con livello specificato
    public void log(LogLevel level, String mensaje) {
        if (level.ordinal() >= currentLogLevel.ordinal()) {
            String logMessage = "[" + java.time.LocalTime.now() + "][" + level + "] " + mensaje;
            // Scrive nel file
            writer.println(logMessage);
        }
    }

    // Sobrecarga per registrare logs di livello INFO di default
    public void log(String mensaje) {
        log(LogLevel.INFO, mensaje);
    }

    // Metodi helper per registrare rapidamente con livelli specifici
    public void debug(String mensaje) {
        log(LogLevel.DEBUG, mensaje);
    }

    public void info(String mensaje) {
        log(LogLevel.INFO, mensaje);
    }

    public void warning(String mensaje) {
        log(LogLevel.WARNING, mensaje);
    }

    public void error(String mensaje) {
        log(LogLevel.ERROR, mensaje);
    }
}
