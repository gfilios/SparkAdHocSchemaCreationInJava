package de.filios.medium.article.udfwithjava;

import org.apache.log4j.Logger;

public class MainApp {

    private static Logger log = Logger.getLogger(MainApp.class);

    public static void main(String[] args) {
        log.debug(new MainApp().getGreeting());
    }

    public String getGreeting() {
        return "Salve - Main App";
    }
}
