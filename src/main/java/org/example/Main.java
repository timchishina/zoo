package org.example;

import org.example.animals.*;
import org.example.services.*;
import org.example.inventory.*;

import java.util.InputMismatchException;
import java.util.Scanner;
import net.jmatrix.console.log.ColorConsoleLogger;

public class Main {
    public static int scanInt(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        ColorConsoleLogger logger = new ColorConsoleLogger("logger");
        while (true) {
            try {
                int num = scanner.nextInt();
                scanner.nextLine();
                if (min <= num && max >= num) {
                    return num;
                } else {
                    logger.error("Wrong number, Try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input, try again");
                scanner.nextLine();
            }
        }
    }



    public static int scanInt(int min) {
        return scanInt(min, 2147483647);
    }


    private static void addAnimal(Zoo zoo, Veterinary veterinary) {
        System.out.println("\nChoose type of animal:");
        System.out.println("1. Monkey");
        System.out.println("2. Rabbit");
        System.out.println("3. Tiger");
        System.out.println("4. Wolf");
        Scanner scanner = new Scanner(System.in);
        int animalTmp = scanInt(1, 4);

        System.out.println("How much does this animal eat per day?");
        int food = scanInt(0);

        Animal animal = null;
        System.out.println("\nWhat level of kindness does this animal have from 0 to 10?");
        int kindLevel = scanInt(0, 10);
        switch (animalTmp) {
            case 1:
                animal = new Monkey(food, kindLevel);
                break;
            case 2:
                animal = new Rabbit(food, kindLevel);
                break;
            case 3:
                animal = new Tiger(food);
                break;
            case 4:
                animal = new Wolf(food);
                break;
        }

        System.out.println("\nThe veterinary clinic will determine whether the animal is healthy ");
        boolean healthy = veterinary.checkHealth(animal);
        if (healthy) {
            System.out.println("\nThe animal is in good health, we can add it to our zoo!");
        } else {
            System.out.println("\nThis animal is in poor health, we cannot add it to the zoo...");
            return;
        }
        System.out.println("\nWhat is your animal's name?");
        String name = scanner.next();
        scanner.nextLine();
        animal.setName(name);
        zoo.addAnimal(animal);
    }

    private static void addThing(Zoo zoo) {
        System.out.println("\nChoose type of thing:");
        System.out.println("1. Computer");
        System.out.println("2. Table");
        int thingTmp = scanInt(1, 2);

        Thing thing = null;
        switch (thingTmp) {
            case 1:
                System.out.println("\nWhat operation system has your computer: ");
                System.out.println("1. Mac");
                System.out.println("2. Linux");
                System.out.println("3. Windows");

                int type = scanInt(1, 3);
                switch (type) {
                    case 1:
                        thing = new Computer();
                        thing.setTypeThing("Mac");
                        break;
                    case 2:
                        thing = new Computer();
                        thing.setTypeThing("Linux");
                        break;
                    case 3:
                        thing = new Computer();
                        thing.setTypeThing("Windows");
                        break;
                }
                break;
            case 2:
                System.out.println("\nWhat material has your table: ");
                System.out.println("1. Wood");
                System.out.println("2. Laminate");
                System.out.println("3. Glass");

                type = scanInt(1, 3);
                switch (type) {
                    case 1:
                        thing = new Table();
                        thing.setTypeThing("Wood");
                        break;
                    case 2:
                        thing = new Table();
                        thing.setTypeThing("Metal");
                        break;
                    case 3:
                        thing = new Table();
                        thing.setTypeThing("Glass");
                        break;
                }
                break;
            default:
                System.out.println("Wrong number");
        }
        zoo.addThing(thing);
    }

    private static void getKg(Zoo zoo) {
        zoo.KgAnimal();
    }

    private static void getCountAnimal(Zoo zoo) {
        zoo.CountAnimal();
    }

    private static void getListPetZoo(Zoo zoo) {
        zoo.seePettingZoo();
    }

    private static void getInfoZoo(Zoo zoo) {
        zoo.getInfo();
    }

    private static void getNumberInventory(Zoo zoo, int number) {
        if (zoo.searchNumber(number) instanceof Animal) {
            zoo.getInfoAnimal((Animal) zoo.searchNumber(number));
        } else if (zoo.searchNumber(number) instanceof Thing) {
            zoo.getInfoThing((Thing) zoo.searchNumber(number));
        } else {
            System.out.println("\nWe don't have such a number");
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Veterinary veterinary = new Veterinary();
        System.out.println("\nWelcome to zoo!");
        System.out.println("Please use english language for name)");
        while (true) {
            System.out.println("You can do several actions: ");
            System.out.println("1. Add animal");
            System.out.println("2. Add thing");
            System.out.println("3. Get information about food");
            System.out.println("4. Get list of animals for petting Zoo");
            System.out.println("5. Get count of animals");
            System.out.println("6. Get information about animal or thing by number");
            System.out.println("7. Get information about Zoo");
            System.out.println("8. Quit");
            int variant = scanInt(1, 8);

            switch (variant) {
                case 1:
                    addAnimal(zoo, veterinary);
                    break;
                case 2:
                    addThing(zoo);
                    break;
                case 3:
                    getKg(zoo);
                    break;
                case 4:
                    getListPetZoo(zoo);
                    break;
                case 5:
                    getCountAnimal(zoo);
                    break;
                case 6:
                    System.out.println("Write a number: ");
                    int number = scanInt(0);
                    getNumberInventory(zoo, number);
                    break;
                case 7:
                    getInfoZoo(zoo);
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Wrong number! Try again");
            }
        }
    }

}
