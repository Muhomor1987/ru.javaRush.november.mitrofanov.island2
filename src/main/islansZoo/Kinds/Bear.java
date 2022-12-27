package Kinds;

import description.Predator;
import structure.Animal;

import java.util.concurrent.ThreadLocalRandom;

public class Bear extends Animal implements Predator {

    public Bear() {
        super();
        this.weight = ThreadLocalRandom.current().nextDouble(30);
    }



}
