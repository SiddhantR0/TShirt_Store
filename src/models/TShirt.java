package models;

import java.util.Arrays;

public class TShirt {

    // Below are the required fields
    String name;
    int productCode;
    double price;
    String brand;
    String description;
    String[] availableSizes;

    public TShirt(String name, int productCode, double price, String brand, String description, String[] availableSizes) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.availableSizes = availableSizes;
    } // This is the Constructor. The constructor is a line of code that describes the instance of a class object.
    public String getName() {
        return name;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(String[] availableSizes) {
        this.availableSizes = availableSizes;
    }
    // These are all the Getter and Setter's
    // The getters and setters are methods in java that help to protect the data while making classes.

    // Below is the custom function
    public void describeTShirt() {
        System.out.println("Item name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Product code: " + productCode);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Sizes: " + Arrays.toString(availableSizes));
    }
}
