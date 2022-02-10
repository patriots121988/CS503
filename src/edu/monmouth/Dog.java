package edu.monmouth;

public class Dog implements Animal {

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    private String furColor;

    public static void main(String[] args) {

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
