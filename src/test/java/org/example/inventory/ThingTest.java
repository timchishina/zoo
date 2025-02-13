package org.example.inventory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThingTest {

    @Test
    public void getNumber() {
        Thing thing = new Computer();
        thing.setNumber(3);
        assertEquals(3, thing.getNumber());
    }

    @Test
    public void getTypeThing() {
        Thing thing = new Computer();
        thing.setTypeThing("Wood");
        assertEquals("Wood", thing.getTypeThing());
    }

    @Test
    public void getNameClass () {
        Thing thing = new Computer();
        assertEquals("Computer", thing.getNameClass());
    }

    @Test
    public void getNameClass1 () {
        Thing thing = new Table();
        assertEquals("Table", thing.getNameClass());
    }
}


