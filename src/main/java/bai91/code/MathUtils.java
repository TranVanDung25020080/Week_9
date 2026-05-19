package bai91.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public int add(int a, int b) {
        logger.info("Thực hiện phép tính cộng: {} + {}", a, b);
        return a + b;
    }
}
