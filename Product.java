// Product.java
public class Product {
    // Private instance variables
    private String productCode;
    private String productName;
    private double productPrice;
    private char categoryCode;
    
    // Private static variable
    private static int prodCounter = 100;
    
    // Parameterized constructor with 3 parameters
    public Product(String productName, double productPrice, char categoryCode) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.categoryCode = categoryCode;
        this.productCode = generateProductCode();
    }
    
    // Overloaded parameterized constructor with 2 parameters
    public Product(String productName, double productPrice) {
        this(productName, productPrice, 'E');  // Default category code is 'E'
    }
    
    // Private method to generate product code
    private String generateProductCode() {
        prodCounter++;
        return categoryCode + Integer.toString(prodCounter);
    }
    
    // Getters and setters
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public char getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(char categoryCode) {
        this.categoryCode = categoryCode;
    }

    // Method to get product details
    public String getProductDetails() {
        return String.format("Product : Code – %s, Name – %s, price - %.2f, Category – %c",
                productCode, productName, productPrice, categoryCode);
    }
}
