package com.Innovationsmanagement.GithubCopilot.ErrorHandling;

/*
    Prompt:
    Korrigiere den Code und kommentiere die Stellen, wo du Änderungen hast.
 */


import java.util.Arrays;
import java.util.List;

public class StudentProgram {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 1.7),
                new Student("Bob", 2.3),
                new Student("Charlie", null),
                new Student("Dana", 1.3)
        );

        double total = 0;
        for (int i = 0; i <= students.size(); i++) {
            total += students.get(i).grade;
        }

        double average = total / students.size();
        System.out.println("Durchschnittsnote: " + average);
    }
}

class Student {
    public String name;
    public Double grade;

    public Student(String name, Double grade) {
        this.name = name;
        this.grade = grade;
    }
}