package edu.monmouth;

public class Animals {

    private static int SIZE = 6;

    public static void main(String[] args){
        Animal Animals []= new Animal[SIZE];

        Animal dog = new Dog("Gray");
        Animals[0] = dog;
        dog.move();
        dog.makeSound();

        Animal fish = new Fish("Orange");
        Animals[1] = fish;
        fish.move();
        fish.makeSound();

        Animal guardDog = new GuardDog("Brown", (short) 5);
        Animals[2] = guardDog;
        guardDog.move();
        guardDog.makeSound();

        Animal showDog = new ShowDog("White", "Retriever");
        Animals[3] = showDog;
        showDog.move();
        showDog.makeSound();

        Animal shark = new Shark("Blue", "Bite");
        Animals[4] = shark;
        shark.move();
        shark.makeSound();

        Animal wolf = new Dog("Black");
        Animals[5] = wolf;
        wolf.move();
        wolf.makeSound();

        StringBuilder s = new StringBuilder();

        s.append(Animals);

        for(int i=0; i<Animals.length; i++){
            System.out.println(Animals[i]);
        }
    }
}
