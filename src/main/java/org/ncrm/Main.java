package org.ncrm;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        Calculator c = new Calculator();

        int resAdd = c.add(12, 26);
        int resSub = c.subtract(9,9);
        int resMult = c.multiply(2,7);
        Double resDiv = c.div(2,7);

        logger.info("resAdd= "+resAdd);
        logger.info("resSub= "+resSub);
        logger.info("resMult= "+resMult);
        logger.info("resDiv= "+resDiv);
    }
}