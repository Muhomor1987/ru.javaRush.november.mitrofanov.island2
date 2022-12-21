package Kinds;

import description.Herbivore;
import description.Predator;
import structure.Animal;

public class Hog extends Animal implements Predator{

    public Hog() {
        super();
        this.weight = Hog.WEIGHT;
    }



}
