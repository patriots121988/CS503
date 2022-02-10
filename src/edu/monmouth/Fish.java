package edu.monmouth;

public class Fish implements Animal{

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public static void main(String []args){

    }

    @Override
    public void move() {
        Animal.super.move();
    }

    @Override
    public void makeSound() {
        Animal.super.makeSound();
    }
}
