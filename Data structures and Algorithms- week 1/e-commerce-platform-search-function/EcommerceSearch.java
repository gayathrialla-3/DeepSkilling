import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearch {

    public static void main(String[] args) {

        // Create product array
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Footwear"),
                new Product(103, "Watch", "Accessories"),
                new Product(104, "Mobile", "Electronics"),
                new Product(105, "Bag", "Fashion")
        };

        String target = "Mobile";

        // Linear Search
        System.out.println("Linear Search:");
        Product linearResult = LinearSearch.search(products, target);

        if (linearResult != null) {
            System.out.println("Product found: " + linearResult);
        } else {
            System.out.println("Product not found");
        }
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        //Binary Search
        System.out.println("\nBinary Search:");
        Product binaryResult = BinarySearch.search(products, target);

        if (binaryResult != null) {
            System.out.println("Product found: " + binaryResult);
        } else {
            System.out.println("Product not found");
        }
    }
}
