package bai94.code;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathManagerTest {

    @Test
    void testGetConfigFile() {
        PathManager manager = new PathManager();
        String result = manager.getConfigFile("config", "settings.json");

        String expectedPath = "config" + File.separator + "settings.json";

        assertEquals(expectedPath, result, "Đường dẫn phải tương thích với hệ điều hành đang chạy");
    }
}
