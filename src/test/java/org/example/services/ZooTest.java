package org.example.services;

import org.example.animals.Animal;
import org.example.animals.Monkey;
import org.example.animals.Rabbit;
import org.example.animals.Wolf;
import org.example.inventory.Computer;
import org.example.inventory.Thing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ZooTest {

    @Test
    public void addAnimal() {
    }

    @Test
    public void getInfoAnimal() {
        Zoo zoo = new Zoo();
        Animal animal = new Monkey(1, 4);
        animal.setNumber(2);
        animal.setName("Aha");
    }

    @Test
    public void getInfoThing() {
    }

    @Test
    public void countAnimal() {
    }

    @Test
    public void kgAnimal() {
    }

    @Test
    public void addThing() {
    }

    @Test
    public void searchNumber() {
        Animal animal = new Monkey(1, 2);
        Zoo zoo = new Zoo();
        zoo.addAnimal(animal);
        int num = animal.getNumber();
        assertEquals(animal, (Animal)zoo.searchNumber(num));
    }

    @Test
    public void searchNumber2() {
        Thing thing = new Computer();
        Zoo zoo = new Zoo();
        zoo.addThing(thing);
        int num = thing.getNumber();
        assertEquals(thing, (Thing)zoo.searchNumber(num));
    }

    @Test
    public void searchNumber3() {
        Animal animal = new Rabbit(1, 2);
        Zoo zoo = new Zoo();
        zoo.addAnimal(animal);
        int num = animal.getNumber();
        assertEquals(animal, (Animal)zoo.searchNumber(num));
    }

    @Test
    public void searchNumber4() {
        Animal animal = new Wolf(1);
        Zoo zoo = new Zoo();
        zoo.addAnimal(animal);
        int num = animal.getNumber();
        assertEquals(animal, (Animal)zoo.searchNumber(num));
    }

    @Test
    public void searchNumber5() {
        Zoo zoo = new Zoo();
        assertEquals(null, (Animal)zoo.searchNumber(1));
    }


    @Test
    public void getInfo() {
    }

    @Test
    public void seePettingZoo() {
    }

}