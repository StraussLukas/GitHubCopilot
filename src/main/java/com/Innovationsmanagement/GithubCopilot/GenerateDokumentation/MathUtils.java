package com.Innovationsmanagement.GithubCopilot.GenerateDokumentation;


/*
    Prompt:
    Füge Javadoc-Kommentare zu allen Methoden hinzu
 */



public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public double divide(int numerator, int denominator) {
        return (double) numerator / denominator;
    }



    //Main zum Testen
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        System.out.println("Ergebnis der Addition: " ); // + mathUtils.add(3,4));
    }
}


