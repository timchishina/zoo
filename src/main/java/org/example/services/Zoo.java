package org.example.services;

import java.util.ArrayList;
import java.util.List;

import org.example.animals.Animal;
import org.example.interfaces.IInventory;
import org.example.inventory.Thing;
import org.example.animals.Herbo;

public class Zoo {
    private final Veterinary veterinary = new Veterinary();;
	static int CounterAnimal;
    static int KgAnimals;
	private List<Animal> animals = new ArrayList<>();
    private List<IInventory> inventory = new ArrayList<>();
    private int inventoryCounter = 1;
	public void addAnimal(Animal animal) {
        animal.setNumber(inventoryCounter++);
        animals.add(animal);
        inventory.add(animal);
        CounterAnimal++;
        KgAnimals += animal.getFood();
        System.out.println(animal.getNameClass() + " " + animal.getName() + " with number " + animal.getNumber() + " added to zoo");
    }

    public void getInfoAnimal (Animal animal) {
        System.out.println(animal.getClass().getSimpleName() +" " + animal.getName() + " with number " + animal.getNumber());
    }

    public void getInfoThing (Thing thing) {
        System.out.println(thing.getNameClass() + " with type " + thing.getTypeThing() + " and number " + thing.getNumber());
    }

    public void CountAnimal () {
        if (CounterAnimal == 0) {
            System.out.println("In Zoo no animals");
        } else if (CounterAnimal == 1) {
            System.out.println("In Zoo only 1 animal");
        } else {
            System.out.println("In Zoo " + CounterAnimal + " animals");
        }
    }

    public void KgAnimal () {
        System.out.println("Animals eat " + KgAnimals + " kg of food");
    }

    public void addThing(Thing thing) {
        thing.setNumber(inventoryCounter++);
        inventory.add(thing);
        System.out.println(thing.getClass().getSimpleName() + " " + thing.getTypeThing() + " with number " + thing.getNumber() + " added to zoo");
    }

    public IInventory searchNumber (int number) {
        for (IInventory i : inventory) {
            if (i.getNumber() == number) {
                return i;
            }
        }
        return null;
    }

    public void getInfo () {
        for (IInventory i : inventory) {
            if (i instanceof Animal) {
                getInfoAnimal((Animal) i);
            } else {
                getInfoThing((Thing) i);
            }
        }
    }

    public void seePettingZoo() {
        System.out.println("Animals for petting zoo:");
        boolean flag = false;
        for (Animal animal : animals) {
            if (animal instanceof Herbo && ((Herbo) animal).getKind() > 5) {
                System.out.println(animal.getClass().getSimpleName() + " " + animal.getName() + " with number - " + animal.getNumber());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No animals...");
        }
    }
}