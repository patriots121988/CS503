package edu.monmouth;

public class Shark extends Fish{

    protected String bite;

    public Shark(String bite) {
        super(color);
        this.bite = bite;
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public String toString() {
        return "Shark{}";
    }
}
