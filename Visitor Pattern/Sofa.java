// Concrete Visitable Class
public class Sofa implements Furniture {
    private String name;
    private double size;        // cubic feet
    private double distanceKm;  // shipping distance in km

    public Sofa(String name, double size, double distanceKm) {
        this.name = name;
        this.size = size;
        this.distanceKm = distanceKm;
    }

    @Override
    public String getName() { return name; }

    @Override
    public double getSize() { return size; }

    public double getDistanceKm() { return distanceKm; }

    @Override
    public double accept(ShippingCalculator calculator) {
        return calculator.computeShipping(this);
    }
}
