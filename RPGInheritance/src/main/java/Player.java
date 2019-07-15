import java.util.*;

public class Player {
    public static void main(String[] args) {
        //variables
        String character = null;
        boolean running = true;
        String action;
        //set up random and scanner
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        //prompt user to enter their name
        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
        //ask the user if they would like to play
        System.out.println("Hi " + name + ", are you ready to play this game? (yes or no)");
        String start = scanner.nextLine();

        if (start.equals("yes")) {
            System.out.println("Nice! You're in for a doozy!");
        } else if (start.equals("no")) {
            System.out.println("Oh...ok");
            return;
        }
        //ask the user if they would like to be farmer, constable, or warrior
        if (start.equals("yes")) {
            System.out.println("Would you like to be a farmer, constable, or warrior?");
            character = scanner.nextLine();

            System.out.println("Oh no, it appears as though a monster is chasing you!");
        }//if the user chose to be a farmer
        if (character.equals("farmer")) {
            //create a new farmer and set the variables up
            Farmer farmer = new Farmer(75, 100, 75, 10, 1);
            farmer.getStrength();
            farmer.getHealth();
            farmer.getStamina();
            farmer.getSpeed();
            farmer.getAttackPower();
            //while loop for running
            while (running) {
                //set enemy health
                int enemyHealth = 30;
                //while the enemy is still alive
                while (enemyHealth > 0) {
                    // continuously display farmer stats until enemy death
                    System.out.println("Your strength is " + farmer.getStrength());
                    System.out.println("Your health is " + farmer.getHealth());
                    System.out.println("Your stamina is " + farmer.getStamina());
                    System.out.println("Your speed is " + farmer.getSpeed());
                    System.out.println("Your attack power is " + farmer.getAttackPower());
                    //ask the farmer what they would like to do
                    System.out.println("Would you like to run, plow, harvest, attack, or heal?");
                    action = scanner.nextLine();
                    //if farmer chooses run
                    if (action.equals("run")) {
                        //call the run method
                        farmer.run();
                        //let user know enemy health
                        System.out.println("You've got fast feet!");
                        System.out.println("----------------------------------------------------------");
                        System.out.println("The monsters health is " + enemyHealth);
                        //if farmer chooses plow
                    } else if (action.equals("plow")) {
                        //call plow method
                        farmer.plow();
                        //let user know what happened
                        System.out.println("You plow towards the monster. He is frightened.");
                        System.out.println("He strikes back out of fear.");
                        System.out.println("----------------------------------------------------------");
                        System.out.println("The monsters health is " + enemyHealth);
                        //if farmer chooses harvest
                    } else if (action.equals("harvest")) {
                        //call harvest method
                        farmer.harvest();
                        //cause damage to enemy's health using the farmers attackPower
                        int damageDealt = farmer.getAttackPower();
                        enemyHealth -= damageDealt;
                        //let farmer know what happened
                        System.out.println("You throw the tomatoes you harvested at the monster.");
                        System.out.println("Nice job!");
                        System.out.println("----------------------------------------------------------");
                        System.out.println("The monsters health is " + enemyHealth);
                        //if farmer chooses attack
                    } else if (action.equals("attack")) {
                        //call attack method
                        farmer.attack();
                        //cause damage using farmers attackPower
                        int damage = farmer.getAttackPower();
                        enemyHealth -= damage;
                        //let user know what happened
                        System.out.println("You attack the monster with " + damage + " of damage!");
                        System.out.println("You are a farmer, not a fighter.");
                        System.out.println("----------------------------------------------------------");
                        System.out.println("The monsters health is " + enemyHealth);
                        //if farmers health is less than 1
                        if (farmer.getHealth() < 1) {
                            //end game
                            System.out.println("You have taken too much damage. Game over.");
                            break;
                        }
                        //if farmers stamina is less than 1
                        if (farmer.getStamina() < 1) {
                            //end game
                            System.out.println("You do not have enough energy to continue. Game over.");
                            break;
                            //if enemy's health is less than 1
                        } else if (enemyHealth < 1) {
                            //end game
                            System.out.println("You've defeated the moster!");
                            break;
                        }
                        //if farmer chooses heal
                    } else if (action.equals("heal")) {
                        //call heal method
                        farmer.heal();
                        //let user farmer know what happened
                        System.out.println("Perserverance is key!");
                        System.out.println("----------------------------------------------------------");
                        System.out.println("The monsters health is " + enemyHealth);
                        //if user types something other than the actions
                    } else {
                        //ask to enter another action
                        System.out.println("That's not a command. I'll give you another try.");
                        System.out.println("Would you like to run, plow, harvest, attack, or heal?");
                        action = scanner.nextLine();
                    }
                }
                break;
            }
        //if user enters constable
        } else if (character.equals("constable")) {
            //create a new constable
            Constable constable = new Constable(60, 100, 60, 20, 5);
            //while loop for running
            while (running) {
                //set enemy health
                int enemyHealth = 30;
                //while the enemy doesn't die
                while (enemyHealth > 0) {
                    //continuously print the users stats
                    System.out.println("Your strength is " + constable.getStrength());
                    System.out.println("Your health is " + constable.getHealth());
                    System.out.println("Your stamina is " + constable.getStamina());
                    System.out.println("Your speed is " + constable.getSpeed());
                    System.out.println("Your attack power is " + constable.getAttackPower());
                    //ask the user for an action
                    System.out.println("Would you like to run, arrest, attack, or heal?");
                    action = scanner.nextLine();
                    //if user asks to run
                    if (action.equals("run")) {
                        //call run method
                        constable.run();
                        //let user know what happened
                        System.out.println("You've got fast feet!");
                        System.out.println("----------------------------------------------------------");
                        System.out.println("The monsters health is " + enemyHealth);
                    //if user enters arrest
                    } else if (action.equals("arrest")) {
                        //call arrest method
                        constable.arrest();
                        //cause damage to enemy health
                        int damage = constable.getAttackPower();
                        enemyHealth -= damage;
                        //let user know what happened
                        System.out.println("You have arrested the monster.");
                        System.out.println("He escaped.");
                        System.out.println("----------------------------------------------------------");
                        System.out.println("The monsters health is " + enemyHealth);
                        //if user enters attack
                    } else if (action.equals("attack")) {
                        //call attack method
                        constable.attack();
                        //cause damage to enemy health
                        int damage = constable.getAttackPower();
                        enemyHealth -= damage;
                        //let user know what happened
                        System.out.println("You attack the monster with " + damage + " of damage!");
                        System.out.println("You're doing better than the farmer.");
                        System.out.println("----------------------------------------------------------");
                        System.out.println("The monsters health is " + enemyHealth);
                        //if user's health is less than 1
                        if (constable.getHealth() < 1) {
                            //end game
                            System.out.println("You have taken too much damage. Game over.");
                            break;
                        }
                        //if user's stamina is less than 1
                        if (constable.getStamina() < 1) {
                            //end game
                            System.out.println("You do not have enough energy to continue. Game over.");
                            break;
                         //if enemy's health is less than 1
                        } else if (enemyHealth < 1) {
                            //end game
                            System.out.println("You've defeated the monster!");
                            break;
                        }
                    //if user enters heal
                    } else if (action.equals("heal")) {
                        //call heal method
                        constable.heal();
                        //let user know what happened
                        System.out.println("Perserverance is key!");
                        System.out.println("----------------------------------------------------------");
                        System.out.println("The monsters health is " + enemyHealth);
                    //if user enters wrong action, prompt them to try again
                    } else {

                        System.out.println("That's not a command. I'll give you another try.");
                        System.out.println("Would you like to run, plow, harvest, attack, or heal?");
                        action = scanner.nextLine();
                    }
                }
                break;
            }
        //if user enters warrior
        } else if (character.equals("warrior")) {
            //create new warrior
            Warrior warrior = new Warrior(75, 100, 100, 50, 10, 100);
            //while loop for running
            while (running) {
                //initialize enemy health
                int enemyHealth = 30;
                //while the enemy's not dead
                while (enemyHealth > 0) {
                    //continuously show user's stats
                    System.out.println("Your strength is " + warrior.getStrength());
                    System.out.println("Your health is " + warrior.getHealth());
                    System.out.println("Your stamina is " + warrior.getStamina());
                    System.out.println("Your speed is " + warrior.getSpeed());
                    System.out.println("Your attack power is " + warrior.getAttackPower());
                    //ask user for action
                    System.out.println("Would you like to run, arrest, attack, or heal?");
                    action = scanner.nextLine();
                    //if user enters run
                    if (action.equals("run")) {
                        //call run method
                        warrior.run();
                        //let user know what happened
                        System.out.println("You've got fast feet!");
                        System.out.println("----------------------------------------------------------");
                        System.out.println("The monsters health is " + enemyHealth);
                        //if user chooses attack
                    } else if (action.equals("attack")) {
                        //call attack method
                        warrior.attack();
                        //cause damage to the enemy's health
                        int damage = warrior.getAttackPower();
                        enemyHealth -= damage;
                        //let user know what happened
                        System.out.println("You attack the monster with " + damage + " of damage!");
                        System.out.println("You're doing better than the farmer.");
                        System.out.println("----------------------------------------------------------");
                        System.out.println("The monsters health is " + enemyHealth);
                        //if users health is less than 1
                        if (warrior.getHealth() < 1) {
                            //end game
                            System.out.println("You have taken too much damage. Game over.");
                            break;
                            //if enemy's health is less than 1
                        } else if (enemyHealth < 1) {
                            //end game
                            System.out.println("You've defeated the monster!");
                            break;
                        }
                        //if warriors stamina is less than 1
                        if (warrior.getStamina() < 1) {
                            //end game
                            System.out.println("You do not have enough energy to continue. Game over.");
                            break;
                        }
                    //if user chooses heal
                    } else if (action.equals("heal")) {
                        //call heal method
                        warrior.heal();
                        //let user know what happened
                        System.out.println("Perseverance is key!");
                        System.out.println("----------------------------------------------------------");
                        System.out.println("The monsters health is " + enemyHealth);
                    //if user enter wrong action, ask them to enter a different one
                    } else {

                        System.out.println("That's not a command. I'll give you another try.");
                        System.out.println("Would you like to run, plow, harvest, attack, or heal?");
                        action = scanner.nextLine();
                    }
                }
                break;
            }//if user enters the wrong character, ask them again
        } else {
            System.out.println("You fiend! That's not a charcter!");
            System.out.println("Would you like to be a farmer, constable, or warrior?");
            character = scanner.nextLine();
        }
    }
}


