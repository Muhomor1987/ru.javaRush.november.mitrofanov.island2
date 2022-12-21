package Task;

import Kinds.Bear;
import Kinds.Wolf;
import structure.Animal;
import structure.Island;

public class SettlementBear extends Thread{
    public SettlementBear() {

    }

    public void addAllBearsToTheSettlementQueue() {
        while (Bear.totalCounterKind.getAndDecrement() > 0) {
            Island.animalsQueueByCreatorAnimal.add(new Bear());
        }
    }

    // не понимаю как засунуть сюда не статику..
    @Override
    public void run() {
        addAllBearsToTheSettlementQueue();
    }
}

