package com.order;

public class TaxCalculator {
    /**
     * Calcula el impuesto basado en el total del pedido.
     * La función devuelve el total multiplicado por la tasa de impuesto del 15%.
     * 
     * @param totalAmount es el precio total del pedido
     * @return el importo del impuesto calculado
     */
    public static double calculateTax(double totalAmount) {
        return totalAmount * 0.15;
    }
}
