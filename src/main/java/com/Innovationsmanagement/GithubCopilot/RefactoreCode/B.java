package com.Innovationsmanagement.GithubCopilot.RefactoreCode;

/*
    Prompt:
    Refactore diesen Code nach Clean Code Prinzipien:
    sprechende Klassennamen und Methodennamen, lesbare Struktur, Eingabeprüfung.
 */


import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zahl:");
        int z = s.nextInt();
        if (z % 2 == 0) {
            System.out.println("gerade");
        } else {
            System.out.println("ungerade");
        }
    }
}


