package org.example.services;

import org.example.animals.Animal;
import org.example.animals.Monkey;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class VeterinaryTest {
    @Test
    public void checkHealth() {
        Zoo zoo = new Zoo();
        Veterinary v = new Veterinary();
        Animal animal = new Monkey(1, 2);
        assertEquals(v.checkHealth(animal), animal.getHealth());
    }

}