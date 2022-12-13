package lecture11.zoo.ui;

import lecture11.zoo.exceptions.BrokeException;
import lecture11.zoo.exceptions.MessyError;
import lecture11.zoo.model.Animal;
import lecture11.zoo.model.Keeper;
import lecture11.zoo.model.Manager;

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
        try {
            manager.manage();
        } catch (BrokeException e) {
            System.out.println("Reduce costs!!");
        } catch (MessyError e) {
            System.out.println("Keeper stop whining.");
        } finally {
            System.out.println("...profits!");
        }
        System.out.println("And everything goes on as normal.");

    }
}
