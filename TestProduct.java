// TestProduct.java
public class TestProduct {
    public static void main(String[] args) {
        // Create an object using the parameterized constructor with 3 parameters
        Product product1 = new Product("Laptop", 45000.00, 'E');
        // Get the product details and display them
        System.out.println(product1.getProductDetails());
        
        // Create another object using the parameterized constructor with 2 parameters
        Product product2 = new Product("T-shirt", 1200.00,'A');
        // Get the product details and display them
        System.out.println(product2.getProductDetails());
    }
}
