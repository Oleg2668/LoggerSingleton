package com.exemple.logger;

public class Main {
    public static void main(String[] args) {
        // Отримання екземпляру Logger
        Logger logger = Logger.getInstance();

        // Запис повідомлень в лог
        logger.log("Перше повідомлення");
        logger.log("Друге повідомлення");
    }
}