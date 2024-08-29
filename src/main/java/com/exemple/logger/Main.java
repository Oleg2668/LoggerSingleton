package com.exemple.logger;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();


        logger.log("Перше повідомлення");
        logger.log("Друге повідомлення");

        System.out.println("Всі логи:");
        List<String> logs = logger.getLogs();
        for (int i = 0; i < logs.size(); i++) {
            System.out.println(logs.get(i));
        }
    }
}