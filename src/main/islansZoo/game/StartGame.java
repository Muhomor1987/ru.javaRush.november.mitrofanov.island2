package game;

import Kinds.*;
import structure.Island;
import structure.KindOfAnimal;
import Task.SettlementBear;

public class StartGame {
    public static void main(String[] args) {
        System.out.println("The game has started!");
        Island island = new Island();
        System.out.println("Your island is called " + island.nameIsland);
        System.out.println("You've landed on an island the size of "+island.length+"x"+island.width+" locations");
        System.out.println("The total number of locations on your island is " +island.totalLocations);

        KindOfAnimal kindOfAnimal = new KindOfAnimal(island);
        kindOfAnimal.createKindBear();
/*        Class<? extends KindOfAnimal> kindOfAnimalClass = kindOfAnimal.getClass();
        Method[] methodsOFCreateAnimal= kindOfAnimal.getClass().getDeclaredMethods();
        for (int i = 0; i < methodsOFCreateAnimal.length; i++) {
            kindOfAnimal???.methodsOFCreateAnimal[i].getName();
        }*/
        //Как это можно использовать??
        System.out.println("Your island is inhabited: ");
        kindOfAnimal.createKindBear();
        System.out.println(Bear.class.getSimpleName()+"-"+ Bear.totalCounterKind);
        kindOfAnimal.createKindWolf();
        System.out.println(Wolf.class.getSimpleName()+"-"+ Wolf.totalCounterKind);
        kindOfAnimal.createKindHorse();
        System.out.println(Horse.class.getSimpleName()+"-"+ Horse.totalCounterKind);
        kindOfAnimal.createKindHog();
        System.out.println(Hog.class.getSimpleName()+"-"+ Hog.totalCounterKind);
        kindOfAnimal.createKindDuck();
        System.out.println(Duck.class.getSimpleName()+"-"+ Bear.totalCounterKind);
        kindOfAnimal.createKindCaterpillar();
        System.out.println(Caterpillar.class.getSimpleName()+"-"+ Caterpillar.totalCounterKind);
        //или здесь выводить статические переменные классов из списка??

        System.out.println(Bear.totalCounterKind);
        System.out.println(Wolf.totalCounterKind);

        /*Thread t = new Thread(new SettlementBear());
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Island.animalsQueueByCreatorAnimal.size());
        */


    }
}