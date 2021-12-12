package com.three.homeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework3 {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        boolean checkStr = true;
        String day;

        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work.";
        schedule[1][0] = "monday";
        schedule[1][1] = "go to courses; watch a film.";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "Visit the restaurant";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "read a book.";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "Go visit a friend";
        schedule[5][0] = "Friday";
        schedule[5][1] = "Watch TV";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "clean the house";
        while (checkStr) {
            day = entDay();

            while (findStr(day)) {
                System.out.println("Sorry, I don't understand you, please try again.");
                day = entDay();
            }
            switch (day) {
                case "sunday": {
                    System.out.println("Your tasks for " + schedule[0][0] + ": " + schedule[0][1]);
                    break;
                }
                case "monday": {
                    System.out.println("Your tasks for " + schedule[1][0] + ": " + schedule[1][1]);
                    break;
                }
                case "tuesday": {
                    System.out.println("Your tasks for " + schedule[2][0] + ": " + schedule[2][1]);
                    break;
                }
                case "wednesday": {
                    System.out.println("Your tasks for " + schedule[3][0] + ": " + schedule[3][1]);
                    break;
                }
                case "thursday": {
                    System.out.println("Your tasks for " + schedule[4][0] + ": " + schedule[4][1]);
                    break;
                }
                case "friday": {
                    System.out.println("Your tasks for " + schedule[5][0] + ": " + schedule[5][1]);
                    break;
                }
                case "saturday": {
                    System.out.println("Your tasks for " + schedule[6][0] + ": " + schedule[6][1]);
                    break;
                }
                case "exit": {
                    checkStr = false;
                    break;
                }
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
        }

    }
    private static String entDay() {
        System.out.print("Please, input the day of the week: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        day = day.toLowerCase().trim();
        return day;
    }
    private static boolean findStr (String string) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
}
