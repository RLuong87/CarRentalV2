package com.company;

import java.util.List;
import java.util.Objects;

public class Menu {
    private static int available = 0;
    private static int rented = 0;

    public static void start() {
        System.out.println("Welcome to RL Car Rentals!");
        setOption();
    }

    public static void displayMenu(List<Cars> cars) {
        for (Cars auto : cars) {
            if (Objects.equals(auto.getRented(), "Available")) {
                available++;
            } else if (Objects.equals(auto.getRented(), "Not Available")) {
                rented++;
            }
        }
    }

    public static void menu2(List<Cars> car) {
        int choice;
        displayMenu(Cars.carsList);

        do {
            System.out.println("----------------------------");
            System.out.println("We have " + (available + rented) + " cars in our lineup\nWould you like to...");
            System.out.println("----------------------------");
            System.out.print("1) Rent (" + available + " Cars Available)\n2) Return (" + rented + " Cars Available)\n3) Exit\nSelection: ");
            choice = CLI.getInt(1, 3);

            for (Cars auto : car) {
                if (choice == 1 && Objects.equals(auto.getRented(), "Available")) {
                    System.out.println(auto);

                } else if ((choice == 2 && Objects.equals(auto.getRented(), "Not Available"))) {
                    System.out.println(auto);

                } else if (choice == 3) {
                    CLI.exit();
                }
            }
        } while (choice != 3);
    }

    public static void showMenu(List<Cars> cars) {
        // Loop through the array list
        System.out.println();
        System.out.println("Available Cars");
        System.out.println("---------------------------------------------------");
        for (Cars auto : cars) {
            // %d place holder for integer, %s place holder for string
            System.out.println(auto);
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Enter a number to select the car for details");
        System.out.println("To exit enter 0");
        System.out.println("---------------------------------------------------");
        System.out.print("Selection: ");
    }

//    public static void transaction(int choice, List<Cars> cars) {
//        Cars item = cars.get(choice - 1);
//        System.out.printf("You've selected the %s %s to rent for $%.2f a day", item.getMake(), item.getModel(), item.getPrice());
//        System.out.println("\n");
//    }

    public static void setOption() {
        Cars.carLot();
        menu2(Cars.carsList);
    }

    public static int getAvailable() {
        return available;
    }

    public static void setAvailable(int available) {
        Menu.available = available;
    }

    public static int getRented() {
        return rented;
    }

    public static void setRented(int rented) {
        Menu.rented = rented;
    }
}
