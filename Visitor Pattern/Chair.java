// Concrete Visitable Class
public class Chair implements Furniture {
    private String name;
    private double size; // cubic feet

    public Chair(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() { return name; }

    @Override
    public double getSize() { return size; }

    @Override
    public double accept(ShippingCalculator calculator) {
        return calculator.computeShipping(this);
    }
}
