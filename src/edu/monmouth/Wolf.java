package edu.monmouth;

public class Wolf extends Dog{

    public Wolf(String furColor) {
        super(furColor);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Hunt");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Howl");
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "furColor='" + furColor + '\'' +
                '}';
    }
}
