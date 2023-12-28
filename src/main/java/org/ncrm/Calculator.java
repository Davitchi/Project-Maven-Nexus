package org.ncrm;

public class Calculator {
    // Méthode pour l'addition
    public int add(int x, int y) {
        return x + y;
    }

    // Méthode pour la soustraction
    public int subtract(int x, int y) {
        return x - y;
    }

    // Méthode pour la multiplication
    public int multiply(int x, int y) {
        return x * y;
    }

    public Double div(int x, int y){
        if(y == 0){
            new Logger().info("ERROR la valeur Y ne doit pas etre null");
            return null;
        }
        return (double) x /(double)(y);
    }


}
