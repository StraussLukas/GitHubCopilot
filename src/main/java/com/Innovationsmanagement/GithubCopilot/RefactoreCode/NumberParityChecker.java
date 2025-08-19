package com.Innovationsmanagement.GithubCopilot.RefactoreCode;

import java.util.Scanner;

public class NumberParityChecker {

    public static void main(String[] args) {
        int number = readNumberFromUser();
        if (isEven(number)) {
            System.out.println("Die Zahl ist gerade.");
        } else {
            System.out.println("Die Zahl ist ungerade.");
        }
    }

    private static int readNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein.");
            scanner.next(); // Ungültige Eingabe überspringen
        }
        return scanner.nextInt();
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
