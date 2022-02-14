package edu.monmouth;

public class Animals {

    private static int SIZE = 6;

    public static void main(String[] args){
        Animal Animals []= new Animal[SIZE];

        Animal dog = new Dog("Gray");
        Animals[0] = dog;

        Animal fish = new Fish("Orange");
        Animals[1] = fish;

        Animal guardDog = new GuardDog("Brown", 5);
        Animals[2] = guardDog;

        Animal showDog = new ShowDog("White", "Retriever");
        Animals[3] = showDog;

        Animal shark = new Shark("Bite");
        Animals[4] = shark;

        Animal wolf = new Dog("Black");
        Animals[5] = wolf;

        StringBuilder s = new StringBuilder();

        s.append(Animals);

        for(int i=0; i<Animals.length; i++){
            System.out.println(Animals[i]);
        }
    }
}
