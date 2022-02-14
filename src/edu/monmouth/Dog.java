package edu.monmouth;

public class Dog implements Animal {

    protected String furColor;

    public Dog(String furColor) {
        this.furColor = furColor;
    }

    public static void main(String[] args) {

    }

    @Override
    public void move() {
        Animal.super.move();
        System.out.println("Play");
    }

    @Override
    public void makeSound() {
        Animal.super.makeSound();
        System.out.println("Woof Woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "furColor='" + furColor + '\'' +
                '}';
    }
}
