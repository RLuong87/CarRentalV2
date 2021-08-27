package com.company;

import java.util.List;
import java.util.Objects;

public class CarRentalService {
    public static int choice;
    public static int available = 0;
    public static int rented = 0;

    public static void start() {

        System.out.println("Welcome to RL Car Rentals!");
        setOption();
    }

    public static void displayMenu(List<Cars> cars) {
        for (int i = 0; i < cars.size(); i++) {
            Cars auto = cars.get(i);
            if (Objects.equals(auto.getIsRented(), "false")) {
                available++;
            } else {
                rented++;
            }
        }
        do {
            System.out.println("----------------------------");
            System.out.println("We have " + (available + rented) + " cars in our lineup");
            System.out.println("Would you like to...");
            System.out.println("----------------------------");
            System.out.println("1) Rent (" + available + " Cars Available)");
            System.out.println("2) Return (" + rented + " Cars Available)");
            System.out.println("3) Exit");
            System.out.println();
            System.out.print("Selection: ");
            choice = MyScanner.getInt(1, 3);
            System.out.println();

            for (int i = 0; i < cars.size(); i++) {
                Cars auto = cars.get(i);

                if (choice == 1 && Objects.equals(auto.getIsRented(), "false")) {
                    System.out.println();
                    System.out.printf("%s %s $%.2f per day\n", auto.getMake(), auto.getModel(), auto.getPrice());
                } else if ((choice == 2 && Objects.equals(auto.getIsRented(), "true"))) {
                    System.out.println();
                    System.out.printf("%s %s\n", auto.getMake(), auto.getModel());
                } else if (choice == 3) {
                    System.out.println("Have a great day!");
                    System.exit(3);
                }
            }
        } while (MyScanner.exit);
    }


    public static void showMenu(List<Cars> cars) {
        // Loop through the array list
        System.out.println();
        System.out.println("Available Cars");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < cars.size(); i++) {
            Cars auto = cars.get(i);
            // %d place holder for integer, %s place holder for string
            System.out.printf("%d) %s %s\n", i + 1, auto.getMake(), auto.getModel());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Enter a number to select the car for details");
        System.out.println("To exit enter 0");
        System.out.println("---------------------------------------------------");
        System.out.print("Selection: ");
    }

    public static void transaction(int choice, List<Cars> cars) {
        Cars item = cars.get(choice - 1);
        System.out.printf("You've selected the %s %s to rent for $%.2f a day", item.getMake(), item.getModel(), item.getPrice());
        System.out.println("\n");
    }

    public static void setOption() {
        Cars.carLot();
        displayMenu(Cars.carsList);
        choice = MyScanner.getInt(1, 7);
        showMenu(Cars.carsList);
//            transaction(choice, Cars.carsList);
//            if (Cars.carsList.isEmpty()) {
//                System.out.println("There are no available cars left to rent");
//                System.out.print("To start over enter 0: ");
//                choice = MyScanner.getInt(0, 0);
        Cars.carsList.clear();
    }
}
