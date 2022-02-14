package edu.monmouth;

public class Shark extends Fish{

    protected String bite;

    public Shark(String color, String bite) {
        super(color);
        this.bite = bite;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Chase");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Snarl");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "color='" + color + '\'' +
                ", bite='" + bite + '\'' +
                '}';
    }
}
