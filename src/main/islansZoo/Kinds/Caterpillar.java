package Kinds;

import description.Herbivore;
import structure.Animal;

public class Caterpillar extends Animal implements Herbivore {

    public Caterpillar() {
        super();
        this.weight = Caterpillar.WEIGHT;
    }



}
