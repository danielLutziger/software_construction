package lecture11.zoo.model;

import lecture11.zoo.exceptions.AllergyException;
import lecture11.zoo.exceptions.MessyError;
import lecture11.zoo.exceptions.NotHungry;

import java.util.List;

public class Keeper {

    List<Animal> animalsToFeed;

    public Keeper(List<Animal> animals) {
        animalsToFeed = animals;
    }

    public void feed() throws NotHungry, AllergyException {
        System.out.println("Keeper is feeding the animals.");
        for (Animal animal : animalsToFeed) {
            int eatenTimes = animal.eat();
            System.out.println("Animal has been fed " + eatenTimes + " times.");
        }
        throw new MessyError();
    }
}
