package edu.monmouth;

import java.sql.ShardingKey;

public class Animals {

    private static int SIZE = 6;

    public static void main(String []args){
        Animal Animals []= new Animal[SIZE];

        Animal dog = new Dog();
        Animals[0] = dog;

        Animal fish = new Fish();
        Animals[1] = fish;

        Animal guardDog = new GuardDog();
        Animals[2] = guardDog;

        Animal showDog = new ShowDog();
        Animals[3] = showDog;

        Animal shark = new Shark();
        Animals[4] = shark;

        Animal wolf = new Dog();
        Animals[5] = wolf;

    }
}
