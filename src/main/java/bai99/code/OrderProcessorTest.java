package bai99.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderProcessorTest {

    @Test
    void testProcessOrderSuccess() {
        OrderProcessor processor = new OrderProcessor();
        double total = processor.processOrder("ORD-123", 50000, 3);
        assertEquals(150000.0, total);
    }

    @Test
    void testProcessOrderException() {
        OrderProcessor processor = new OrderProcessor();
        assertThrows(IllegalArgumentException.class, () -> {
            processor.processOrder("ORD-ERR", 50000, 0);
        });
    }
}