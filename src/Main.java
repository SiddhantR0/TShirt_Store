import models.Order;
import models.TShirt;
public class Main {
    public static void main(String[] args) {
        // This Creates TShirt objects
        TShirt tShirt1 = new TShirt("Metallica", 987, 1449.0, "Karuna",
                "Metallica's Logo and spelling with their custom font.", new String[]{"S", "M", "L"});

        // The Description of the T-shirt
        tShirt1.describeTShirt();

        // This Will Create Order objects
        Order order1 = new Order("Siddhant Regmi", "9847386258",
                new int[]{123}, new double[]{999.0}); // Makes new array and sends it

        // This Prints the bill with VAT added
        order1.printBillWithVAT();
    }
}