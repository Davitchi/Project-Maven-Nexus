package org.ncrm;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

public class Logger {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Logger.class.getName());
/*
    public static void configureLogger(Level level) {
        logger.setLevel(level);

        // Création d'un gestionnaire de console pour afficher les messages dans la console
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(level);

        // Ajout du gestionnaire de console au logger
        logger.addHandler(consoleHandler);
    }*/

    // Méthode pour enregistrer un message d'information
    public  void info(String message) {
        logger.info(message);
    }
}
