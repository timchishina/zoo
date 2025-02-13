package org.example.animals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AnimalTest {

    @Test
    public void testGetNameClass() {
        Animal animal = new Monkey(1, 2);
        assertEquals("Monkey", animal.getNameClass());
    }

    @Test
    public void testGetNameClass1() {
        Animal animal = new Rabbit(1, 2);
        assertEquals("Rabbit", animal.getNameClass());
    }

    @Test
    public void testGetNameClass2() {
        Animal animal = new Wolf(1);
        assertEquals("Wolf", animal.getNameClass());
    }

    @Test
    public void testGetNameClass3() {
        Animal animal = new Tiger(1);
        assertEquals("Tiger", animal.getNameClass());
    }


    @Test
    public void testTestGetName() {
        Animal animal = new Monkey(1, 2);
        animal.setName("Aca");
        assertEquals("Aca", animal.getName());
    }

    @Test
    public void testTestGetName1() {
        Animal animal = new Rabbit(1, 2);
        animal.setName("Aca");
        assertEquals("Aca", animal.getName());
    }

    @Test
    public void testTestGetName2() {
        Animal animal = new Wolf(1);
        animal.setName("Aca");
        assertEquals("Aca", animal.getName());
    }

    @Test
    public void testTestGetName3() {
        Animal animal = new Tiger(1);
        animal.setName("Aca");
        assertEquals("Aca", animal.getName());
    }

    @Test
    public void testGetNumber() {
        Animal animal = new Monkey(1, 2);
        animal.setNumber(3);
        assertEquals(3, animal.getNumber());
    }

    @Test
    public void testGetNumber1() {
        Animal animal = new Tiger(1);
        animal.setNumber(3);
        assertEquals(3, animal.getNumber());
    }

    @Test
    public void testGetFood() {
        Animal animal = new Monkey(1, 2);
        assertEquals(1, animal.getFood());
    }

    @Test
    public void testGetFood1() {
        Animal animal = new Rabbit(1, 2);
        assertEquals(1, animal.getFood());
    }

    @Test
    public void testGetFood2() {
        Animal animal = new Wolf(1);
        assertEquals(1, animal.getFood());
    }

    @Test
    public void testGetFood3() {
        Animal animal = new Tiger(1);
        assertEquals(1, animal.getFood());
    }

    @Test
    public void testGetHealth() {
        Animal animal = new Monkey(1, 2);
        animal.setHealth(true);
        assertTrue(animal.getHealth());
    }
}