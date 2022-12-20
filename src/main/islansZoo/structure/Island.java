package structure;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadLocalRandom;

public class Island {
    public String nameIsland;
    public int length;
    public int width;
    public int totalLocations;
    public Island() {
        this.nameIsland = "SAVANNA";
        this.length = ThreadLocalRandom.current().nextInt(200);
        this.width = ThreadLocalRandom.current().nextInt(200);
        this.totalLocations = length*width;
        this.locations = new Location[length][width];
        this.animalsQueueByCreatorAnimal = new LinkedBlockingDeque<>(500);

    }

    public Island(int length, int width) {
        this.nameIsland = "SAVANNA";
        this.length = length;
        this.width = width;
        this.totalLocations = length*width;
        this.locations = new Location[length][width];
        this.animalsQueueByCreatorAnimal = new LinkedBlockingDeque<>(500);
    }

    public  LinkedBlockingDeque<? extends Animal> animalsQueueByCreatorAnimal;

    public  Location[][] locations;




}
