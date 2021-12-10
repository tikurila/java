package com.one.homeWork;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Let the game begin!");

        int num = -1;
        final int rnd = rnd(100);


        while (num != rnd) {
            System.out.print("Enter the number: ");
            num = in.nextInt();
            if (num < rnd) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (num > rnd) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name);
            }
        }
        }
    public static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }

}
