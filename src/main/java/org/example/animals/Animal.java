package org.example.animals;

import org.example.interfaces.IAlive;
import org.example.interfaces.IInventory;

public abstract class Animal implements IAlive, IInventory {
	private final int Food;
	private int Number;
    private String Name;
    private boolean Health;
	protected Animal(int food) {
        this.Food = food;
    }
	public String getNameClass() { return this.getClass().getSimpleName(); }
    public void setName(String name) { this.Name = name; }
    public String getName () { return Name; }
    public int getNumber() { return Number; }
    public void setNumber(int number) { this.Number = number; }
    public int getFood() { return Food; }
    public boolean getHealth() { return Health; }
    public void setHealth (boolean health) { this.Health = health; }
}