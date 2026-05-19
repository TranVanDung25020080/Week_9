package bai91.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    void testAdd() {
        MathUtils math = new MathUtils();
        assertEquals(5, math.add(2, 3));
    }
}
