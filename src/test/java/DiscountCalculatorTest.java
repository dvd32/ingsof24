import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.order.DiscountCalculator;
import com.order.CustomerType;

/**
 * Test di vari casi possibili nella classe DiscountCalculatorTest()
 */

public class DiscountCalculatorTest {

    @Test
    @DisplayName("Test calculateDiscount for REGULAR customer with amount > 1000")
    void testCalculateDiscountRegularAbove1000() {
        double totalAmount = 1200;
        double expectedDiscount = 240; // 1200 * 0.2
        assertEquals(expectedDiscount, DiscountCalculator.calculateDiscount(CustomerType.REGULAR, totalAmount),
                "El descuento para un cliente REGULAR sobre 1200 debe ser 240");
    }

    @Test
    @DisplayName("Test calculateDiscount for REGULAR customer with amount > 500")
    void testCalculateDiscountRegularAbove500() {
        double totalAmount = 600;
        double expectedDiscount = 60; // 600 * 0.1
        assertEquals(expectedDiscount, DiscountCalculator.calculateDiscount(CustomerType.REGULAR, totalAmount),
                "El descuento para un cliente REGULAR sobre 600 debe ser 60");
    }

    @Test
    @DisplayName("Test calculateDiscount for VIP customer with amount > 1000")
    void testCalculateDiscountVIPAbove1000() {
        double totalAmount = 1500;
        double expectedDiscount = 300; // 1500 * 0.2
        assertEquals(expectedDiscount, DiscountCalculator.calculateDiscount(CustomerType.VIP, totalAmount),
                "El descuento para un cliente VIP sobre 1500 debe ser 300");
    }

    @Test
    @DisplayName("Test calculateDiscount for VIP customer with amount > 500")
    void testCalculateDiscountVIPAbove500() {
        double totalAmount = 800;
        double expectedDiscount = 120; // 800 * 0.15
        assertEquals(expectedDiscount, DiscountCalculator.calculateDiscount(CustomerType.VIP, totalAmount),
                "El descuento para un cliente VIP sobre 800 debe ser 120");
    }

    @Test
    @DisplayName("Test calculateDiscount for REGULAR customer with amount < 100")
    void testCalculateDiscountRegularBelow100() {
        double totalAmount = 50;
        double expectedDiscount = 0; // No discount for less than 100
        assertEquals(expectedDiscount, DiscountCalculator.calculateDiscount(CustomerType.REGULAR, totalAmount),
                "El descuento para un cliente REGULAR sobre 50 debe ser 0");
    }

    @Test
    @DisplayName("Test calculateDiscount for VIP customer with amount < 100")
    void testCalculateDiscountVIPBelow100() {
        double totalAmount = 30;
        double expectedDiscount = 0; // No discount for less than 100
        assertEquals(expectedDiscount, DiscountCalculator.calculateDiscount(CustomerType.VIP, totalAmount),
                "El descuento para un cliente VIP sobre 30 debe ser 0");
    }
}