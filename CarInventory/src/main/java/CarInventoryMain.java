import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class CarInventoryMain {
    //create car list
    static List<CarInventory> cars = new ArrayList<CarInventory>();

    public static void main(String[] args) {

        String addCar;
        String action = null;
        String search1;
        //prompt user for input
        Scanner scanner = new Scanner(System.in);
        //ask user for car info
        System.out.println("Would you like to add a car? (yes or no)");
        addCar = scanner.nextLine();
        //if loop ensuring that the user has said yes to adding a car
        if (addCar.equals("yes")) {
            //while loop so the loop continues if the user says yes to adding another car
            while (addCar.equals("yes")) {
                //creating new car
                CarInventory car = new CarInventory();
                //asking for id
                System.out.println("Enter car Id: ");
                car.setCarId(scanner.nextInt());
                //asking for make
                System.out.println("Enter make: ");
                car.setMake(scanner.next());
                //asking for model
                System.out.println("Enter model: ");
                car.setModel(scanner.next());
                //asking for year
                System.out.println("Enter year: ");
                car.setYear(scanner.nextInt());
                //asking for color
                System.out.println("Enter color: ");
                car.setColor(scanner.next());
                //asking for miles
                System.out.println("Enter miles: ");
                car.setMiles(scanner.nextInt());
                //adding new car to car list
                cars.add(car);
                //asking the user if they would like to create another car and if yes they will go through the loop again
                System.out.println("Would you like to add another car?");
                addCar = scanner.next();
            }
            //if initial response is no, user will recieve message
        } else if (addCar.equals("no")) {

            System.out.println("Ok, have a nice day!");
            return;
            //if not a valid input, ask the user to try again
        }else if(!addCar.equals("yes")){
            System.out.println("That is not a valid input. Try again.");
            System.out.println("Would you like to add a car? (yes or no)");
            addCar = scanner.nextLine();
            System.out.println();

        }
        //if user says no to adding another car, they can remove, search, or view their cars
        if (addCar.equals("no")) {

            System.out.println("Would you like to remove, view all of your cars, search for a car, or end session? (remove, view, search, end)");
            action = scanner.next();
        }
        //while loop so the loop continues until the user would like to end
        while (!action.equals("end")) {
            //if user wants to remove
            if (action.equals("remove")) {
                //for loop that prints all the cars in cars list
                for (CarInventory c : cars) {
                    System.out.println(c);
                }
                //prompt the user to enter the car they would like to remove
                System.out.println("Enter the ID of the car you would like to remove: ");
                int removeCarId = scanner.nextInt();
                //for loop to go through each car
                for (int i = 0; i < cars.size(); i++) {
                    CarInventory tempCar = cars.get(i);
                    //if the ID the user enter matches the idea of a car, remove that car
                    if (tempCar.getCarId() == removeCarId) {
                        cars.remove(i);
                        //let the user know a car has been removed
                        System.out.println("Car  removed.");
                        //print the list of cars remaining
                        System.out.println("Car/s remaining: ");
                        for (CarInventory c : cars) {
                            System.out.println(c);
                        }
                    }
                }//continue to ask user for other actions
                System.out.println("Would you like to remove, view all of your cars, search for a car, or end session? (remove, view, search, end)");
                action = scanner.next();
                //if action is view
            } else if (action.equals("view")) {
                //show all the cars in cars
                for (CarInventory c : cars) {
                    System.out.println(c);
                }//continue to ask user for other actions
                System.out.println("Would you like to remove, view all of your cars, search for a car, or end session? (remove, view, search, end)");
                action = scanner.next();
                //if action is search
            } else if (action.equals("search")) {
                //ask user what they would like to look for
                System.out.println("Enter if you would like to look up by ID, make, model, year, color, or miles: ");
                search1 = scanner.next();
                //if the user typed in ID
                if (search1.equals("ID")) {
                    //Prompt them to enter ID
                    System.out.println("Enter the ID number of the car: ");
                    int searchCarId = scanner.nextInt();
                    //for loop to go through all cars
                    for (int i = 0; i < cars.size(); i++) {
                        CarInventory tempCar = cars.get(i);
                        //if any id matches the users input, print it
                        if (tempCar.getCarId() == searchCarId) {
                            System.out.println(tempCar);
                        }
                    }//continue to ask user for other actions
                    System.out.println("Would you like to remove, view all of your cars, search for a car, or end session? (remove, view, search, end)");
                    action = scanner.next();
                    //if user enter make
                } else if (search1.equals("make")) {
                    //prompt user to enter make they want
                    System.out.println("Insert the make of the car: ");
                    String searchMake = scanner.next();
                    //for loop that goes through each car
                    for (int i = 0; i < cars.size(); i++) {
                        CarInventory tempCar = cars.get(i);
                        //if make entered by user matches the make of a car, show that car
                        if (tempCar.getMake().equals(searchMake)) {
                            System.out.println(tempCar);
                        }
                    }//continue to ask user for other actions
                    System.out.println("Would you like to remove, view all of your cars, search for a car, or end session? (remove, view, search, end)");
                    action = scanner.next();
                    //if user enters model
                } else if (search1.equals("model")) {
                    //prompt user to enter the model they want
                    System.out.println("Insert the model of the car: ");
                    String searchModel = scanner.next();
                    //for loop to go through each car
                    for (int i = 0; i < cars.size(); i++) {
                        CarInventory tempCar = cars.get(i);
                        //if model entered by user equals the model of a car, show that car
                        if (tempCar.getMake().equals(searchModel)) {
                            System.out.println(tempCar);
                        }
                    }//continue to ask user for other actions
                    System.out.println("Would you like to remove, view all of your cars, search for a car, or end session? (remove, view, search, end)");
                    action = scanner.next();
                    //if user enters year
                } else if (search1.equals("year")) {
                    //prompt user to enter the year
                    System.out.println("Enter the year of the car: ");
                    int searchYear = scanner.nextInt();
                    //for loop to go through each car
                    for (int i = 0; i < cars.size(); i++) {
                        CarInventory tempCar = cars.get(i);
                        //if year entered by user equals the cars year, show that car
                        if (tempCar.getYear() == searchYear) {
                            System.out.println(tempCar);
                        }
                    }//continue to ask user for other actions
                    System.out.println("Would you like to remove, view all of your cars, search for a car, or end session? (remove, view, search, end)");
                    action = scanner.next();
                    //when user enters color
                } else if (search1.equals("color")) {
                    //prompt user to enter color they want
                    System.out.println("Enter the color of the car: ");
                    String searchColor = scanner.next();
                    //for loop to look through all the cars
                    for (int i = 0; i < cars.size(); i++) {
                        CarInventory tempCar = cars.get(i);
                        //if color inputed by user is the same as the color of the car, show that car
                        if (tempCar.getMake().equals(searchColor)) {
                            System.out.println(tempCar);
                        }
                    }//continue to ask user for other actions
                    System.out.println("Would you like to remove, view all fo your cars, search for a car, or end session? (remove, view, search, end)");
                    action = scanner.next();
                    //when user enters miles
                } else if (search1.equals("miles")) {
                    //ask for maximum miles they want to view
                    System.out.println("Enter the maximum miles of cars you would like to view: ");
                    int searchMiles = scanner.nextInt();
                    //for loop to go through each car
                    for (int i = 0; i < cars.size(); i++) {
                        CarInventory tempCar = cars.get(i);
                        //if cars in inventory have less than the miles the user entered, show those cars.
                        if (tempCar.getYear() <= searchMiles) {
                            System.out.println(tempCar);
                        }
                    }//continue to ask user for other actions
                    System.out.println("Would you like to remove, view all of your cars, search for a car, or end session? (remove, view, search, end)");
                    action = scanner.next();
                }
            }else {//if user enters invalid input, prompt the user to try again
                System.out.println("That's not a command. Please try again.");
                System.out.println("Would you like to remove, view all of your cars, search for a car, or end session? (remove, view, search, end)");
                action = scanner.next();
                System.out.println();
            }//when user enters "end", end the program
        }if(action.equals("end")){
            System.out.println("Have a nice day!");
        }
    }
}






