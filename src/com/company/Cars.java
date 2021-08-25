package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private String make;
    private String model;
    public static int choice;
    public static List<Cars> carMenu = new ArrayList<>();

    public Cars(String make, String model) {
        this.make = make;
        this.model = model;
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
        System.out.println("Enter a number to select the car you'd like to rent");
        System.out.println("---------------------------------------------------");
        System.out.print("Selection: ");
    }

    public static void carLot() {
        carMenu.add(new Cars("Honda", "Civic Type R"));
        carMenu.add(new Cars("Toyota", "Supra"));
        carMenu.add(new Cars("Nissan", "350Z"));
        carMenu.add(new Cars("Acura", "NSX"));
        carMenu.add(new Cars("Nissan", "Skyline GTR"));
        carMenu.add(new Cars("Mitsubishi", "Eclipse"));
    }

    public static void transaction(int choice, List<Cars> cars) {
        Cars item = cars.get(choice - 1);
        System.out.printf("You've selected the %s %s to rent ", item.getMake(), item.getModel());
        cars.remove(choice - 1);
        System.out.println("\n");
    }

    public static void setOption() {
        carLot();
        while (MyScanner.exit) {
            showMenu(carMenu);
            choice = MyScanner.getInt(1, 6);
            transaction(choice, carMenu);
            if (carMenu.isEmpty()) {
                System.out.println("There are no available cars left to rent");
                System.out.print("To start over enter 1: ");
                choice = MyScanner.scanner.nextInt();
                carMenu.clear();
                setOption();
            }
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return make + " " + model;
    }
}
