import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.order.TaxCalculator;

/**
 * Test del metodo testCalculateTax()
 */

class TaxCalculatorTest {

    @Test
    @DisplayName("Test calculateTax con 1000")
    void testCalculateTax() {
        double totalAmount = 1000;
        double expectedTax = 150; // 1000 * 0.15
        assertEquals(expectedTax, TaxCalculator.calculateTax(totalAmount), 
            "La tassa dovrebbe essere 150 per un totale di 1000");
    }
}