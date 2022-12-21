package Kinds;

import description.Predator;
import structure.Animal;

public class Duck extends Animal implements Predator{

    public Duck() {
        super();
        this.weight = Duck.WEIGHT;
    }



}
