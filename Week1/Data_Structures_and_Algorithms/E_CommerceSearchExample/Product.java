package Data_Structures_and_Algorithms.E_CommerceSearchExample;
public class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public String toString() {
        return "[" + productId + "] " + productName + " (" + category + ")";
    }
}
