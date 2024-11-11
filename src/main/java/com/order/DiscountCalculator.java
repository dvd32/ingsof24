package com.order;

public class DiscountCalculator {
    /**
     * Los clientes puedon ser de tipo VIP (tengono mas discount) o de tipo NORMAL
     * @param customerType tipo de cliente
     * @param totalAmount importe del order
     * @return importe con el descuento
     */
    public static double calculateDiscount(CustomerType customerType, double totalAmount) {
        double discount = 0;

        switch (customerType) {
            case REGULAR:
                if (totalAmount > 1000) {
                    discount = totalAmount * 0.2;
                } else if (totalAmount > 500) {
                    discount = totalAmount * 0.1;
                } else if (totalAmount > 100) {
                    discount = totalAmount * 0.05;
                }
                break;

            case VIP:
                if (totalAmount > 1000) {
                    discount = totalAmount * 0.2;
                } else if (totalAmount > 500) {
                    discount = totalAmount * 0.15;
                } else if (totalAmount > 100) {
                    discount = totalAmount * 0.1;
                }
                break;
        }
        return discount;
    }
}
