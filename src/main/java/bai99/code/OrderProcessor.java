package bai99.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderProcessor {
    private static final Logger logger = LoggerFactory.getLogger(OrderProcessor.class);

    public double processOrder(String orderId, double price, int quantity) {
        logger.info("Bắt đầu xử lý đơn hàng có mã ID: '{}' với số lượng: {}", orderId, quantity);

        try {
            if (quantity <= 0) {
                throw new IllegalArgumentException("Số lượng sản phẩm phải lớn hơn 0!");
            }
            double total = price * quantity;
            logger.info("Xử lý đơn hàng '{}' THÀNH CÔNG. Tổng tiền: {} VND", orderId, total);
            return total;

        } catch (Exception e) {
            logger.error("Xử lý đơn hàng '{}' THẤT BẠI. Lý do ngoại lệ: {}", orderId, e.getMessage());
            throw e;
        }
    }
}
