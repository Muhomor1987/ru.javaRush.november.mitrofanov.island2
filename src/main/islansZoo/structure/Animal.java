package structure;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Animal {

    public Animal()  {
        this.name = Animal.class.getSimpleName() + "_" + totalCounterKind;
    }

    public String name;


    public double weight;

    public static double WEIGHT;
    public static int SPEED;  //прописать от куда мы берём данные, будет метод
    public static double SATURATION;
    public static int MAX_OF_ANIMALS_ON_SQUAD;
    public static AtomicInteger totalCounterKind;

    public static HashMap<Class<? extends Animal>, Integer> MAP_OF_FOOD;

    public static void setValueOfConstants(Double WEIGHT,Integer MAX_OF_ANIMALS_ON_SQUAD,Integer SPEED,
                                    Double SATURATION){
        Animal.WEIGHT = WEIGHT;
        Animal.MAX_OF_ANIMALS_ON_SQUAD= MAX_OF_ANIMALS_ON_SQUAD;
        Animal.SPEED = SPEED;
        Animal.SATURATION = SATURATION;
        Animal.MAP_OF_FOOD = new HashMap<>() {
        };
    }





    //Get and Set


}
