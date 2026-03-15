/**
 * Concrete Visitor Class - Standard Shipping
 * Chair : flat rate ₱150  (lightweight, always box-shaped)
 * Table : ₱80 per cubic foot
 * Sofa  : ₱50 per cubic foot + ₱10 per km (bulky, distance-based)
 */
public class StandardShipping implements ShippingCalculator {

    @Override
    public double computeShipping(Chair chair) {
        return 150.0;
    }

    @Override
    public double computeShipping(Table table) {
        return 80.0 * table.getSize();
    }

    @Override
    public double computeShipping(Sofa sofa) {
        return (50.0 * sofa.getSize()) + (10.0 * sofa.getDistanceKm());
    }
}
