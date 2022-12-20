package structure;

import Kinds.Bear;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

import static Kinds.Bear.*;

public class KindOfAnimal {
    Island island;
    public KindOfAnimal(Island island) {
        this.island = island;
    }
    public void createKindBear() {
        setValueOfConstants(500,5,3,8);
        totalCounterKind = new AtomicInteger(
                ThreadLocalRandom.current().
                        nextInt(MAX_OF_ANIMALS_ON_SQUAD*island.totalLocations));
        listClassAnimals.add(Bear.class);
        listClassPredators.add(Bear.class);
    }

    public List<Class<? extends Animal>> listClassAnimals = new ArrayList<>();
    public List<Class<? extends Animal>> listClassPredators = new ArrayList<>();
    public List<Class<? extends Animal>> listClassHerbivores = new ArrayList<>();
    public List<Class<? extends Animal>> listClassPlants = new ArrayList<>();



}
