package structure;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Animal {

    public Animal()  {
        this.name = Animal.class.getSimpleName() + "_" + totalCounterKind;
    }

    public String name;


    public double weight;

    public static double weightMax;
    public static int speed;  //прописать от куда мы берём данные, будет метод
    public static double saturation;
    public static int maxOfAnimalsOnSquad;
    public static AtomicInteger totalCounterKind;



    public static HashMap<Class<? extends Animal>, Integer> MAP_OF_FOOD;

    public static void setValueOfConstants(Double weightMax, Integer maxOfAnimalsOnSquad,Integer SPEED,
                                    Double saturation){
        Animal.weightMax = weightMax;
        Animal.maxOfAnimalsOnSquad = maxOfAnimalsOnSquad;
        Animal.speed = SPEED;
        Animal.saturation = saturation;
        Animal.MAP_OF_FOOD = new HashMap<>() {
        };
    }





    //Get and Set


}
