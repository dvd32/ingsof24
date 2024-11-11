import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import com.order.*;

/**
 * Test dei metodi get della classe Order()
 */

class OrderTest {

    Order order;
    List<String> items;

    @BeforeEach
    void setUp() {
        items = Arrays.asList("Item1", "Item2");
        order = new Order("Alice", CustomerType.REGULAR, items, 1200);
    }

    @Test
    @DisplayName("Test getCustomerName")
    void testGetCustomerName() {
        assertEquals("Alice", order.getCustomerName(), "Il nome del cliente dovrebbe essere Alice");
    }

    @Test
    @DisplayName("Test getCustomerType")
    void testGetCustomerType() {
        assertEquals(CustomerType.REGULAR, order.getCustomerType(), "Il tipo di cliente dovrebbe essere REGULAR");
    }

    @Test
    @DisplayName("Test getItems")
    void testGetItems() {
        assertEquals(items, order.getItems(), "Gli articoli dovrebbero essere Item1 e Item2");
    }

    @Test
    @DisplayName("Test getTotalAmount")
    void testGetTotalAmount() {
        assertEquals(1200, order.getTotalAmount(), "L'importo totale dovrebbe essere 1200");
    }

    @Test
    @DisplayName("Test getDiscount")
    void testGetDiscount() {
        assertEquals(0, order.getDiscount(), "Il discount iniziale dovrebbe essere 0");
    }

    @Test
    @DisplayName("Test getTax")
    void testGetTax() {
        assertEquals(0, order.getTax(), "L'imposta iniziale dovrebbe essere 0");
    }

}