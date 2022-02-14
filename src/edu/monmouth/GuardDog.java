package edu.monmouth;

public class GuardDog extends Dog{

    private final short meanness;

    public GuardDog(String furColor, short meanness) {
        super(furColor);
        this.meanness = meanness;
    }

    public static void main(String []args){

    }

    @Override
    public void move() {
        super.move();
        System.out.println("Protect");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Bark");
    }

    @Override
    public String toString() {
        return "GuardDog{" +
                "furColor='" + furColor + '\'' +
                ", meanness=" + meanness +
                '}';
    }
}
