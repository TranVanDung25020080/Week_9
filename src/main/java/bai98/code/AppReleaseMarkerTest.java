package bai98.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppReleaseMarkerTest {

    @Test
    void testProductionReady() {
        AppReleaseMarker marker = new AppReleaseMarker();
        String status = marker.getVersionStatus(0.85);
        assertEquals("PRODUCTION_READY", status, "Đạt trên 80% coverage phải sẵn sàng phát hành!");
    }
}