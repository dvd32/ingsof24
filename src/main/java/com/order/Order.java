package com.order;
import java.util.List;

public class Order {
    /**
     * Oggetto Order che ha come attributi: String customerName, CustomerType customerType, List<String> items, double totalAmount
     */

    private String customerName;
    private CustomerType customerType;
    private List<String> items;
    private double totalAmount;
    private double discount;
    private double tax;

    // Constructor de Order
    public Order(String customerName, CustomerType customerType, List<String> items, double totalAmount) {
        this.customerName = customerName;
        this.customerType = customerType;
        this.items = items;
        this.totalAmount = totalAmount;
        this.discount = 0;
        this.tax = 0;
    }

    

    public String getCustomerName() {
        return customerName;
    }



    public CustomerType getCustomerType() {
        return customerType;
    }



    public List<String> getItems() {
        return items;
    }



    public double getTotalAmount() {
        return totalAmount;
    }



    public double getDiscount() {
        return discount;
    }



    public double getTax() {
        return tax;
    }



    public void applyDiscount() {
        this.discount = DiscountCalculator.calculateDiscount(this.customerType, this.totalAmount);
    }

    public void calculateTax() {
        this.tax = TaxCalculator.calculateTax(this.totalAmount);
    }

    public void printOrderDetails() {
        double finalAmount = this.totalAmount - this.discount + this.tax;
        System.out.println("Customer: " + this.customerName);
        System.out.println("Customer Type: " + this.customerType);
        System.out.println("Items: " + String.join(", ", this.items));
        System.out.println("Total Amount: " + this.totalAmount);
        System.out.println("Discount: " + this.discount);
        System.out.println("Tax: " + this.tax);
        System.out.println("Final Amount: " + finalAmount);
    }
    public String returnOrderDetails() {
        double finalAmount = totalAmount - this.discount + this.tax;
        return "Customer: " + this.customerName +
                " Customer Type: " + this.customerType +
                " Items: " + String.join(", ", this.items) +
                " Total Amount: " + this.totalAmount +
                " Discount: " + this.discount +
                " Tax: " + this.tax +
                " Final Amount: " + finalAmount;
    }
}