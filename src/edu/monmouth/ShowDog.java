package edu.monmouth;

public class ShowDog extends Dog{

    private String breed;
    public ShowDog(String furColor, String breed) {
        super(furColor);
        this.breed=breed;
    }

    public static void main(String []args){

    }

    @Override
    public void move() {
        super.move();
        System.out.println("Walk");
    }

    @Override
    public String toString() {
        return "ShowDog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
