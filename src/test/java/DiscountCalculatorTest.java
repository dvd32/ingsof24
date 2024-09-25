import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.order.CustomerType;
import com.order.DiscountCalculator;

public class DiscountCalculatorTest {
    @Test
    public void testCalculateDiscount() {
        double discount = DiscountCalculator.calculateDiscount(CustomerType.VIP, 1200);
        assertEquals(240, discount, 0.01);  // 1200 * 0.2 = 240
    }
}
