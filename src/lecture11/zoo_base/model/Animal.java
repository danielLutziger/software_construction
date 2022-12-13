package lecture11.zoo_base.model;

import lecture11.zoo_base.exceptions.NotHungry;

public class Animal {

    private boolean isHungry = true;
    private int eaten = 0;

    public Animal() {}

    public Animal(boolean isHungry) {
        this.isHungry = isHungry;
    }

    // getters
    public boolean isHungry() { return isHungry; }

    // REQUIRES: animal to be hungry
    public int eat() throws NotHungry{
        if(!isHungry){
            System.out.println("Animal: I don't want food mate.");
            throw new NotHungry();
        }

        System.out.println("Animal is eating!");
        isHungry = false;
        eaten ++;
        return eaten;
    }
}