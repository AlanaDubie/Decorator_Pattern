/**
 * Pumpkin Spice condiment class that extends CondimentDecorator and
 *  overriding the getDescription() and cost() method
 */
public class PumpkinSpice extends CondimentDecorator
{
    public PumpkinSpice(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Pumpkin Spice";
    }

    @Override
    public double cost() {
        return .50 + beverage.cost();
    }


}
