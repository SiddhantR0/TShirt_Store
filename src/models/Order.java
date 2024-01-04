package models;

import java.util.Arrays;

public class Order {

    // Below are the required fields
    // All the big brackets [] represent arrays
    String name;
    String phoneNumber;
    int[] items;
    double[] prices;

    public Order(String name, String phoneNumber, int[] items, double[] prices) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.prices = prices;
    } // This is the constructor.

    public String getName() {
        return name;
    }

    //Below are the getter's and setter's
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    // Above are the getters and setters
    // Below is the custom function
    public void printBillWithVAT() {
        double totalPrice = 0;
        for (double price : prices) {    // This loop adds each price in total
            totalPrice += price;  // This += is same as writing TotalPrice = TotalPrice + Price
        }
        double vat = totalPrice * 0.13;
        System.out.println("Order details: ");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Items: " + Arrays.toString(items));
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Total price: " + totalPrice);
        System.out.println("VAT: " + vat);
        System.out.println("Total price with VAT: " + (totalPrice + vat));
    }
}