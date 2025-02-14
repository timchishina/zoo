package org.example.inventory;

import org.example.interfaces.IInventory;

public abstract class Thing implements IInventory {
	private int Number;
	private String Type;
	public String getTypeThing () { return this.Type; }
	public void setTypeThing (String type) { this.Type = type; }
	public String getNameClass() { return this.getClass().getSimpleName(); }
	public int getNumber() { return Number; }
	public void setNumber(int number) { this.Number = number; }
}