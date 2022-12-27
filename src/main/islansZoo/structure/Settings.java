package structure;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Settings {
    public double weight;

    public static double WEIGHT;
    public static int SPEED;  //прописать от куда мы берём данные, будет метод
    public static double SATURATION;
    public static int maxOfAnimalsOnSquad;
    public static AtomicInteger totalCounterKind;

    public static HashMap<Class<? extends Animal>, Integer> MAP_OF_FOOD;
}
