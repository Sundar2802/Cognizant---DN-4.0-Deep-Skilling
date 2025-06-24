package Data_Structures_and_Algorithms.E_CommerceSearchExample;

public class ECommerceSearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Notebook", "Stationery"),
            new Product(104, "Smartphone", "Electronics"),
            new Product(105, "Chair", "Furniture")
        };

        String target = "Notebook";

        System.out.println("🔍 Linear Search Result:");
        Product linearResult = SearchEngine.linearSearch(products, target);
        System.out.println(linearResult != null ? linearResult : "Product not found.");

        System.out.println("\n🔍 Binary Search Result:");
        Product binaryResult = SearchEngine.binarySearch(products, target);
        System.out.println(binaryResult != null ? binaryResult : "Product not found.");
    }
}
