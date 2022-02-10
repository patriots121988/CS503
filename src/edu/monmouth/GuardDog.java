package edu.monmouth;

public class GuardDog extends Dog{

    public short getMeanness() {
        return meanness;
    }

    public void setMeanness(short meanness) {
        this.meanness = meanness;
    }

    private short meanness;

    public static void main(String []args){

    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }
}
