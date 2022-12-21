package Kinds;

import description.Predator;
import structure.Animal;

public class Wolf extends Animal implements Predator {

    public Wolf() {
        super();
        this.weight = Wolf.WEIGHT;
    }



}
