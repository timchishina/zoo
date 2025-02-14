package org.example.animals;

public abstract class Herbo extends Animal {
	private int Kind;
	final int LIMIT = 10;
	protected Herbo(int food, int kind) {
        super(food);
        this.Kind = kind;
    }
	public int getKind() { return Kind; }
}