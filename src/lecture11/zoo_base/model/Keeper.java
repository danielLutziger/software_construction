package lecture11.zoo_base.model;

import lecture11.zoo_base.exceptions.NotHungry;

import java.util.List;

public class Keeper {

    List<Animal> animalsToFeed;

    public Keeper(List<Animal> animals) {
        animalsToFeed = animals;
    }

    public void feed() {
        System.out.println("Keeper is feeding the animals.");
        for (Animal animal : animalsToFeed) {
            int eatenTimes = 0;
            try{
                eatenTimes = animal.eat();
            }
            catch(NotHungry e){
                System.out.println("Just don't feed it then mate");
            }
            System.out.println("Animal has been fed " + eatenTimes + " times.");
        }
    }
}
