package com.company;

public class Main {

    /*
    Client Definition:
    Create an application for a rental car company.
    A list of all available rental cars should appear at the start of the application. Each car should have a number next to the name like so

    Available Cars:
     1) Honda Accord
     2) Chevy Cruze
     3) Toyota Corolla

    Then a prompt should appear that allows the user to enter a number selection

    Enter a number to select the car you'd like to rent
    Selection:

    If the selection number is not one of the listed numbers (or not a number) the output should be
    "Car selection invalid, please try again" AND the prompt should re-appearOnce the car selection is accepted,
    the selected car should be designate in the program as being currently rentedThe program should start the cycle again
    where the list of available cars is shown (the selected car should not appear now)
    The prompt for selection should also appear and when that selection is made that should be also designated as rented too

    Requirements:
    This program should be built in a brand-new class called CarRentalService
    The class should have at least one method where the main logic executes
    The program should implement AT LEAST three loops.
    The car names should be stored in String arrays.
    The list of available cars should not output any currently rented cars
    The program should cycle until all cars have been rented, at which point you have two choices: end the program, or reset the data.

    If  the selection number is not one of the listed numbers (or not a number) the output should be "Car selection invalid,
please try again" AND the prompt should re-appearOnce the car selection is accepted, the selected car should be designate
in the program as being currently rented.
The program should start the cycle again where the list of available cars is shown (the selected car should not appear now).
The prompt for selection should also appear and when that selection is made that should be also designated as rented too

You can continue renting cars...continue the loop


Requirements:
This program should be built in a brand new class called CarRentalService
The class should have a at least one method where the main logic executes
The program should implement AT LEAST three loops.
The car names should be stored in String arrays.
The list of available cars should not output any currently rented cars
The program should cycle until all cars have been rented, at which point you have two choices: end the program, or reset the data.



The following classes and methods will be needed:

To restart the program: have a start() method called that will initialize our menus and reset our methods as if it were being ran for the first time.

* Main class:
* will be calling the run method in the CarRentalService class
*
* CLI class:
* add some fail safe scanners that is careful about what the user puts into the program.
*
* CarRentalService/Menu? Class:
* will contain atleast one method that will be called in the main.
* should contain a submenu method which will ask the user wants to return to the main menu or not.

menu options:
for each (string car : carsAval) ... for(int i = 0...;i++) i
    sout(i + 1 + ")" carsAval[cars].name().model().color())

    0, 1 , 2, 3, 4
    1, 2 ,3 ,4 ,5

    if(user input - 1 == i)
    carAval.remove(i)

    nested for loop that keeps track of number of aval options

    .size for arraylist
    .contains

    restart...method that calls the start.
    store the user input into a variable for it to run the menu again...
    new instance of the menu...
    initialCars = create the cars using inheritance from the car class. initialize in start method and restart method.

    try catch w/ the scanner so if the user puts in a string, it will spit an error message and return to the menu.

*
* Car Class:
* Multiple menus?
* Inheritance?
* Body: Economy? Mid size? compact? sport?
* Price?
* Color
* Name
* Model
* boolean isElectric?
* boolean isStandard? (transmission)
*
* methods?
* getters and setters
* getPrice?
getCar method (Object car)
reference the car inside the arraylist
return car.color() + car.model()
*
* Override toString method?
* display method

do while loop will run as long as there are cars in the arraylist.

*
*
* Inventory class:??
* Listed inside a string array
* ArrayLists?
* A rented cars list?
* any and all information about the cars
* boolean for is or isn't rented
* have two: rented and not rented.
* while loop for checking inventory
* while there is inventory in carsAvailable list, continue to rent a car
* while there is no inventory in carsAvailable list, ask if the user wants to end the program or restart the program.
* recall the main.start() method to restart the entire program.
*
*numbers of cars, which ones are rented, available cars.
boolean isRented
date rented?? (extra)
method that changes the boolean of isRented ... rented()
ArrayList named rented
ArrayList named inInventory

when is empty...start the menu.

Car Rental Service V2:
Client Definition:
Built upon the first iteration of the CarRentalService (OOP branch)...
But now with returns!

When the program first starts all cars should be made available (during testing you can have some start as rented)
The first prompt should be to select rent or return.

If either option does not have any cars available it should not appear as an option.
So long as there is at least one car at the beginning of the program, there should always be an available option.
The prompt should look something like this...

Welcome to Java Car Rentals! (only appears once)We have 5 cars in our lineup.

Would you like to...
1) Rent (3 Cars Available)
2) Return (2 Cars Available)Select an option...
Selection:

If the selection is invalid it will ask them for their selection againOnce a selection is made the user should have another prompt appear
Now users should be able to see the cars that are also currently being rented along with the available cars. Then a prompt should appear that allows the user to enter a number selection
The output should look like this...

Available Cars:
1) Honda Accord
2) Chevy Cruze

Enter a number to select an available car you'd like to [rent/return]
Selection:

Same output should occur when a selection is made for a car that does not exist, ie. the selection choice is invalidSome users experienced issues where they rented a car they didn't mean to rent and they could not undone their rental request
You will need to implement a confirmation system that outputs

Are you sure you would like to rent the Honda Accord?
Confirm (y/n):

If the user inputs NO/No/no/n  the program will ask again which car selection they would like.

If the user says YES/Yes/yes/y the program should prompt the user to enter their name so their rental order can be

What is the name you would like to use to return your rental?
Enter Name:

The program will only accept non-empty strings (strings with the value of  "" and "   " are invalid)
Once their name is entered they should be taken back to the first selection screen where they can either rent a new car or return a car that is being rented.WHEN RETURNINGIt will be similar to the rent process but now when the name is entered it should prompt

Enter the name you used to rent the Honda Accord?
Enter Name:

If they enter their name incorrectly it should ask if they would like to try again or return to the previous screen, and the car should not be returned if they go back to the "Rent OR Return" screen.
If they enter their name correctly the program will make the car rent-able again, and the name of the previous renter should not be tied to the car any longer.This program should be able to run on forever as the cars will not be removed from the program, but rather just changed from rented/available. How you hold this information in your program is up to you.
Requirements:

Complete all the request of the Client Definition

You must create a Car class to store the rental cars' data.
This will make it much easier to keep track of the multiple pieces of data about each car (make & model, if it's rented, who's renting it, etc.)
This will also provide your program with the ability to expand beyond the current goals.

BONUS Challenge
(This should be attempted only after the requirements are met.)

Make sure there are no loops that the user can get stuck in, the way client definition is written I can think of at least one.
Solve this by giving users the options to go back a step if there is no way for them to proceed


*/

    public static void main(String[] args) {
        Menu.start();
//        CarRentalService.displayMenu(Cars.carsList);

    }
}
