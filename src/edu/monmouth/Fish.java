package edu.monmouth;

public class Fish implements Animal{

    protected String color;

    public Fish(String color) {
        this.color = color;
    }

    public static void main(String []args){

    }

    @Override
    public void move() {
        Animal.super.move();
        System.out.println("Swim");
    }

    @Override
    public void makeSound() {
        Animal.super.makeSound();
        System.out.println("Glub");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "color='" + color + '\'' +
                '}';
    }
}
