package machine;

import java.util.Scanner;
import java.util.Collections;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            ui(scanner);
        }
    }

    private static void ui(Scanner scanner) {

        System.out.println("Write action (buy, fill, take, remaining, exit):");

        String userCommand = scanner.next();

        if (userCommand.contains("buy")) {
            executeBuy(scanner);
        } else if (userCommand.contains("fill")) {
            executeFill(scanner);
        } else if (userCommand.contains("take")) {
            executeTake();
        } else if (userCommand.contains("remaining")) {
            executeRemaining();
        } else if (userCommand.contains("exit")) {
            return;
        }

    }

    private static void executeRemaining() {
        printMachineStats();
    }

    private static void executeBuy(Scanner scanner) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String userChoice = scanner.next();

        if (userChoice == "1") {
            if (waterAmount >= 250 && beansAmount >= 16 && disposableCupsAmount >= 1) {
                System.out.println("I have enough resources, making you a coffee!");
                waterAmount -= 250;
                beansAmount -= 16;
                disposableCupsAmount--;
                money += 4;
            } else {
                if (waterAmount < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (beansAmount < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (disposableCupsAmount < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
            }
        }

        if (userChoice == "2") {
            if (waterAmount >= 350 && milkAmount >= 75 && beansAmount >= 20 && disposableCupsAmount >= 1) {
                System.out.println("I have enough resources, making you a coffee!");
                waterAmount -= 350;
                milkAmount -= 75;
                beansAmount -= 20;
                disposableCupsAmount--;
                money += 7;
            } else {
                if (waterAmount < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (milkAmount < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if (beansAmount < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (disposableCupsAmount < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
            }
        }
        if (userChoice == "3") {
            if (waterAmount >= 200 && milkAmount >= 100 && beansAmount >= 12 && disposableCupsAmount >= 1) {
                System.out.println("I have enough resources, making you a coffee!");
                waterAmount -= 200;
                milkAmount -= 100;
                beansAmount -= 12;
                disposableCupsAmount--;
                money += 6;
            } else {
                if (waterAmount < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (milkAmount < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if (beansAmount < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (disposableCupsAmount < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
            }
        }
        if (userChoice == "back") {
            return;
        }
    }

    private static void executeTake() {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println("");
    }

    private static void printMachineStats() {
        System.out.println("The coffee machine has:");
        System.out.println(waterAmount + " ml of water");
        System.out.println(milkAmount + " ml of milk");
        System.out.println(beansAmount + " g of coffee beans");
        System.out.println(disposableCupsAmount + " disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println("");
    }

    private static void executeFill(Scanner scanner) {

        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addDisposableCups = scanner.nextInt();

        waterAmount += addWater;
        milkAmount += addMilk;
        beansAmount += addBeans;
        disposableCupsAmount += addDisposableCups;

    }

    public static int waterAmount = 400;
    public static int milkAmount = 540;
    public static int beansAmount = 120;
    public static int disposableCupsAmount = 9;
    public static int money = 550;

}