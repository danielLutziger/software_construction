package lecture11.zoo.model;

import lecture11.zoo.exceptions.BrokeException;
import lecture11.zoo.exceptions.DidntEat;

import java.util.List;

public class Manager {

    private final List<Animal> animalsToManage;
    private final Keeper keeper;

    public Manager(List<Animal> animals, Keeper keeper) {
        this.animalsToManage = animals;
        this.keeper = keeper;
    }

    public void manage() throws BrokeException {
        System.out.println("Manager is managing the keeper.");
        try {
            keeper.feed();
        } catch (DidntEat e) {
            System.out.println("Get the doctor! Again!");
            throw new BrokeException();
        } finally {
            System.out.println("Finally, Manager says: Regardless of what happens.");
        }
    }
}
