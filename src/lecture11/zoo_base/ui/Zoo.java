package lecture11.zoo_base.ui;

import lecture11.zoo_base.exceptions.NotHungry;
import lecture11.zoo_base.model.Animal;
import lecture11.zoo_base.model.Keeper;
import lecture11.zoo_base.model.Manager;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        System.out.println("The Zoo is open for business.");

        for (int i = 0; i < 3; i++) {
            animals.add(new Animal());
        }

        Keeper keeper = new Keeper(animals);
        Manager manager = new Manager(animals, keeper);
        manager.manage();
        manager.manage();

    }
}
