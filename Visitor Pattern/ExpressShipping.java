/**
 * Concrete Visitor Class - Express Shipping (1.8x multiplier on standard rates)
 * Chair : flat rate ₱270
 * Table : ₱144 per cubic foot
 * Sofa  : ₱90 per cubic foot + ₱18 per km
 */
public class ExpressShipping implements ShippingCalculator {

    @Override
    public double computeShipping(Chair chair) {
        return 270.0;
    }

    @Override
    public double computeShipping(Table table) {
        return 144.0 * table.getSize();
    }

    @Override
    public double computeShipping(Sofa sofa) {
        return (90.0 * sofa.getSize()) + (18.0 * sofa.getDistanceKm());
    }
}
