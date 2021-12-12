package com.two;

import java.util.Random;
import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("All set. Get ready to rumble!");
//        while (matrixA[line][col] != matrixA[rnd_line][rnd_col]) {
        System.out.print ("Enter line number: ");
        int line = in.nextInt();
        System.out.print("Enter column number: ");
        int col = in.nextInt();

        in.close();
        final int min = 5;
        final int max = 5;
        final int rnd_line = rnd_line(min, max);
        final int rnd_col = rnd_col(min, max);
        String[][] matrixA = new String[6][6];
            if (matrixA[line][col] == matrixA[rnd_line][rnd_col]) {
                matrixA[line][col] = "X";
            }
            if (matrixA[line][col] != matrixA[rnd_line][rnd_col]) {
                matrixA[line][col] = "*";
            }

            matrixA[0][0] = "0";
            matrixA[1][0] = "1";
            matrixA[2][0] = "2";
            matrixA[3][0] = "3";
            matrixA[4][0] = "4";
            matrixA[5][0] = "5";
            matrixA[0][1] = "1";
            matrixA[0][2] = "2";
            matrixA[0][3] = "3";
            matrixA[0][4] = "4";
            matrixA[0][5] = "5";

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (matrixA[i][j] == null) {
                        matrixA[i][j] = "-";
                    }
                    System.out.print(matrixA[i][j] + " | ");
                }
                System.out.println();

            }
            if (matrixA[line][col] == matrixA[rnd_line][rnd_col]) {

                System.out.print("You have won!");
            }
        }
//    }
    public static int rnd_line(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    public static int rnd_col(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
