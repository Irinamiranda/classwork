package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        selectGrade();
        while (true) {
            System.out.println("Do you want to enter another score? yes/no");
            Scanner s = new Scanner(System.in);
            String answer = s.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                selectGrade();
            } else {
                System.out.println("Done");
                break;
            }

        }

    }

    public static void selectGrade() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = s.nextInt();

        if (score >= 95) {
            System.out.println("A+");
        } else if (score >= 90) {
            System.out.println("A-");
        } else if (score >= 85) {
            System.out.println("B+");
        } else if (score >= 80) {
            System.out.println("B-");
        } else if (score >= 75) {
            System.out.println("C+");
        } else if (score >= 70) {
            System.out.println("C-");
        } else if (score >= 65) {
            System.out.println("D+");
        } else if (score >= 60) {
            System.out.println("D-");
        } else if (score <= 59) {
            System.out.println("F");
        } else {
            System.out.println(score);
        }

    }


}
