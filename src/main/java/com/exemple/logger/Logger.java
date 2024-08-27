package com.exemple.logger;

public class Logger {
    private static Logger instance;

    private Logger() {
        // Приватний конструктор
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
