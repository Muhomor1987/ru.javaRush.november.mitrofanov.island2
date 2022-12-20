package game;

import Kinds.Bear;
import structure.Animal;
import structure.Island;
import structure.KindOfAnimal;

public class StartGame {
    public static void main(String[] args) {
        System.out.println("The game has started!");
        Island island = new Island();
        System.out.println("Your island is called " + island.nameIsland);
        System.out.println("You've landed on an island the size of "+island.length+"x"+island.width+" locations");
        System.out.println("The total number of locations on your island is " +island.totalLocations);

        KindOfAnimal kindOfAnimal = new KindOfAnimal(island);
        kindOfAnimal.createKindBear();
        System.out.println("Your island is inhabited: ");
        kindOfAnimal.listClassAnimals.stream().forEach(x-> {
            try {
                System.out.println(x.getSimpleName()+" "+x.getField("totalCounterKind").);
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        });


    }
}