package bai93.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {

    @Test
    void testCalculateDiscountForPremium() {
        OrderService orderService = new OrderService();
        double discount = orderService.calculateDiscount(1000, true);
        assertEquals(999.0, discount, "Khách hàng VIP phải được giảm đúng 10%");
    }

    @Test
    void testCalculateDiscountInvalidAmount() {
        OrderService orderService = new OrderService();
        assertThrows(IllegalArgumentException.class, () -> {
            orderService.calculateDiscount(-500, false);
        });
    }
}
