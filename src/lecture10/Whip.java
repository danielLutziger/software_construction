package lecture10;

public class Whip extends CondimentDecorator{
    private Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return this.beverage.cost() + 0.3;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " with Whip";
    }
}
