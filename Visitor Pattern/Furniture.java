// Visitable Interface
public interface Furniture {
    String getName();
    double getSize(); // size in cubic feet
    double accept(ShippingCalculator calculator);
}
