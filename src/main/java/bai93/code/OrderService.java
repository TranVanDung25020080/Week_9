package bai93.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {
    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public double calculateDiscount(double totalAmount, boolean isPremium) {
        logger.info("Bắt đầu tính toán giảm giá cho đơn hàng trị giá: {}, Trạng thái VIP: {}", totalAmount, isPremium);

        if (totalAmount < 0) {
            logger.error("Lỗi: Số tiền đơn hàng không được âm ({})", totalAmount);
            throw new IllegalArgumentException("Số tiền không hợp lệ");
        }

        double discount = 0;
        if (isPremium) {
            discount = totalAmount * 0.10;
        } else if (totalAmount >= 1000) {
            discount = totalAmount * 0.05;
        }

        logger.info("Hoàn tất tính toán. Số tiền được giảm: {}", discount);
        return discount;
    }
}
