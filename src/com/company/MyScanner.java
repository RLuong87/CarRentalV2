package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner {

    public static boolean exit = true;
    public static Scanner scanner = new Scanner(System.in);

    public static int getInt(int min, int max) {

        int num;
        while (true) {
            try {
                num = scanner.nextInt();
                if (num < min || num > max) {
                    System.out.println("Invalid selection!\nPlease try again.");
                } else {
                    break;
                }
                // This caught
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                System.out.println("Invalid selection!\nPlease try again.");
                // This didn't catch
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("Invalid selection!\nPlease try again.");
            }
        }
        return num;
    }

    public static char reset(char reset) {

        char c;
        while (true) {
            c = scanner.next().toUpperCase().charAt(0);
            if (c == reset) {
            }
            return c;
        }
    }

    public static String exit(String ex) {

        String e;
        while (true) {
            e = scanner.nextLine().toUpperCase();
            if (e == ex) {
                System.exit(99);
            }
            return e;
        }
    }

    public static String getStr() {

        return "";
    }
}
