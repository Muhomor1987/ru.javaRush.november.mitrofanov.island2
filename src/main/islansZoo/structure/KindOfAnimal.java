package structure;

import Kinds.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class KindOfAnimal {
    Island island;
    public KindOfAnimal(Island island) {
        this.island = island;
    }
    public void createKindBear() {
        Bear.setValueOfConstants(500.0,5,3,80.0);
        Bear.totalCounterKind = new AtomicInteger(
                ThreadLocalRandom.current().
                        nextInt(Settings.maxOfAnimalsOnSquad *island.totalLocations));
        listClassAnimals.add(Bear.class);
        listClassPredators.add(Bear.class);
        Bear.MAP_OF_FOOD.put(Horse.class,40);
        Bear.MAP_OF_FOOD.put(Hog.class,50);
        Bear.MAP_OF_FOOD.put(Duck.class,10);

    }

    public void createKindWolf() {
        Wolf.setValueOfConstants(50.0,30,3,8.0);
        Wolf.totalCounterKind = new AtomicInteger(
                ThreadLocalRandom.current().
                        nextInt(Settings.maxOfAnimalsOnSquad *island.totalLocations));
        listClassAnimals.add(Wolf.class);
        listClassPredators.add(Wolf.class);
        Wolf.MAP_OF_FOOD.put(Horse.class,10);
        Wolf.MAP_OF_FOOD.put(Hog.class,15);
        Wolf.MAP_OF_FOOD.put(Duck.class,40);
    }

    public void createKindHorse() {
        Horse.setValueOfConstants(400.0,20,4,60.0);
        Horse.totalCounterKind = new AtomicInteger(
                ThreadLocalRandom.current().
                        nextInt(Settings.maxOfAnimalsOnSquad *island.totalLocations));
        listClassAnimals.add(Horse.class);
        listClassHerbivores.add(Horse.class);
    }

    public void createKindHog() {
        Horse.setValueOfConstants(400.0,50,2,50.0);
        Horse.totalCounterKind = new AtomicInteger(
                ThreadLocalRandom.current().
                        nextInt(Settings.maxOfAnimalsOnSquad *island.totalLocations));
        listClassAnimals.add(Hog.class);
        listClassMixedTypeOfFood.add(Hog.class);
        Hog.MAP_OF_FOOD.put(Caterpillar.class,90);
    }

    public void createKindDuck() {
        Duck.setValueOfConstants(1.0,200,4,0.15);
        Duck.totalCounterKind = new AtomicInteger(
                ThreadLocalRandom.current().
                        nextInt(Settings.maxOfAnimalsOnSquad *island.totalLocations));
        listClassAnimals.add(Hog.class);
        listClassMixedTypeOfFood.add(Hog.class);
        Hog.MAP_OF_FOOD.put(Caterpillar.class,90);
    }

    public void createKindCaterpillar() {
        Caterpillar.setValueOfConstants(0.1,1000,0,0.0);
        Caterpillar.totalCounterKind = new AtomicInteger(
                ThreadLocalRandom.current().
                        nextInt(Settings.maxOfAnimalsOnSquad *island.totalLocations));
        listClassAnimals.add(Caterpillar.class);
        listClassHerbivores.add(Caterpillar.class);
    }


    public List<Class<? extends Animal>> listClassAnimals = new ArrayList<>();
    public List<Class<? extends Animal>> listClassPredators = new ArrayList<>();
    public List<Class<? extends Animal>> listClassHerbivores = new ArrayList<>();
    public List<Class<? extends Animal>> listClassPlants = new ArrayList<>();
    public List<Class<? extends Animal>> listClassMixedTypeOfFood = new ArrayList<>();



}
