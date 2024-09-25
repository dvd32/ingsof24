package com.order;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Main per eseguire l'ordine.
 */
public class Main {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Item1");
        items.add("Item2");

        Order order = new Order("Alice", CustomerType.VIP, items, 1200);
        order.applyDiscount();
        order.calculateTax();
        order.printOrderDetails();
    }
}