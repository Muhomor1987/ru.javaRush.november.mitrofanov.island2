package Kinds;

import description.Predator;
import structure.Animal;

public class Bear extends Animal implements Predator {

    public Bear() {
        super();
        this.weight = Bear.WEIGHT;
    }



}
