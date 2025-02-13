package org.example.services;

import org.example.animals.Animal;

public class Veterinary {
	public boolean checkHealth(Animal animal) {
        animal.setHealth((int) (Math.random() * 100) >= 30);
        return animal.getHealth();
    }
}