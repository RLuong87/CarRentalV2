package com.company;

import java.util.List;

public class CarRentalService {
    public static int choice;

    public static void start() {
        System.out.println("===============================");
        System.out.println("Welcome to Richie's Car Rental");
        System.out.println("===============================");
        setOption();
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
        System.out.println("---------------------------------------------------");
        System.out.print("Selection: ");
    }

    public static void transaction(int choice, List<Cars> cars) {
        Cars item = cars.get(choice - 1);
        System.out.printf("You've selected the %s %s to rent for $%.2f a day", item.getMake(), item.getModel(), item.getPrice());
        cars.contains(true);
        System.out.println("\n");
    }

    public static void setOption() {
        Cars.carLot();
        while (MyScanner.exit) {
            showMenu(Cars.carMenu);
            choice = MyScanner.getInt(1, 6);
            transaction(choice, Cars.carMenu);

            if (Cars.carMenu.isEmpty()) {
                System.out.println("There are no available cars left to rent");
                System.out.print("To start over enter 0: ");
                choice = MyScanner.getInt(0, 0);
                Cars.carMenu.clear();
                setOption();
            } else {

            }
        }
    }
}


