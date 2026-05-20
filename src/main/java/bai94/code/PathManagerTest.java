package bai94.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathManagerTest {

    @Test
    void testGetConfigFile() {
        PathManager manager = new PathManager();
        String result = manager.getConfigFile("config", "settings.json");

        // CỐ TÌNH ĐỊNH DẠNG CỨNG dấu gạch chéo ngược '\\' của Windows
        assertEquals("config\\settings.json", result);
    }
}
