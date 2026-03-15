// Client Code
public class FurnitureShop {
    public static void main(String[] args) {

        // Create furniture items (Concrete Visitable objects)
        Chair officeChair  = new Chair("Office Chair", 4.0);
        Table diningTable  = new Table("Dining Table", 20.0);
        Sofa  sectionalSofa = new Sofa("Sectional Sofa", 50.0, 30.0);

        // Create visitors (shipping strategies)
        ShippingCalculator standard = new StandardShipping();
        ShippingCalculator express  = new ExpressShipping();

        // ── Standard Shipping ──────────────────────────────────────────
        System.out.println("===== STANDARD SHIPPING =====");
        System.out.printf("Shipping cost for %-20s: ₱%.2f%n",
                officeChair.getName(),  officeChair.accept(standard));
        System.out.printf("Shipping cost for %-20s: ₱%.2f%n",
                diningTable.getName(),  diningTable.accept(standard));
        System.out.printf("Shipping cost for %-20s: ₱%.2f%n",
                sectionalSofa.getName(), sectionalSofa.accept(standard));

        // ── Express Shipping ───────────────────────────────────────────
        System.out.println("\n===== EXPRESS SHIPPING =====");
        System.out.printf("Shipping cost for %-20s: ₱%.2f%n",
                officeChair.getName(),  officeChair.accept(express));
        System.out.printf("Shipping cost for %-20s: ₱%.2f%n",
                diningTable.getName(),  diningTable.accept(express));
        System.out.printf("Shipping cost for %-20s: ₱%.2f%n",
                sectionalSofa.getName(), sectionalSofa.accept(express));
    }
}
