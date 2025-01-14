package com.patrones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;

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

    // Método para registrar logs con nivel
    public void log(String level, String mensaje) {
        String logMessage = "[" + java.time.LocalTime.now() + "][" + level + "] " + mensaje;
        // Escribir en archivo
        writer.println(logMessage);
    }

    // Sobrecarga para logs de nivel INFO por defecto
    public void log(String mensaje) {
        log("INFO", mensaje);
    }

    //varios niveles de info (warning, ...)
}
