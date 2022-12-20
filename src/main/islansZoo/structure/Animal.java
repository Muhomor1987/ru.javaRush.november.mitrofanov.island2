package structure;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Animal {

    public Animal(String name) {
        this.name = name;
    }

    public String name;
    public int weight;

    public static int WEIGHT;
    public static int SPEED;  //прописать от куда мы берём данные, будет метод
    public static int SATURATION;
    public static int MAX_OF_ANIMALS_ON_SQUAD;
    public static AtomicInteger totalCounterKind;

    public static Map<Animal, Integer> MAP_OF_FOOD;

    public static void setValueOfConstants(Integer WEIGHT,Integer MAX_OF_ANIMALS_ON_SQUAD,Integer SPEED,
                                    Integer SATURATION){
        Animal.WEIGHT = WEIGHT;
        Animal.MAX_OF_ANIMALS_ON_SQUAD= MAX_OF_ANIMALS_ON_SQUAD;
        Animal.SPEED = SPEED;
        Animal.SATURATION = SATURATION;
    }



    //Get and Set


}
