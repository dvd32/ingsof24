package com.order;
import java.util.List;

public class Order {
    private String customerName;
    private CustomerType customerType;
    private List<String> items;
    private double totalAmount;
    private double discount;
    private double tax;

    public Order(String customerName, CustomerType customerType, List<String> items, double totalAmount) {
        this.customerName = customerName;
        this.customerType = customerType;
        this.items = items;
        this.totalAmount = totalAmount;
        this.discount = 0;
        this.tax = 0;
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
}