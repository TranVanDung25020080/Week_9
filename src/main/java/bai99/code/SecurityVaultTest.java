package bai99.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SecurityVaultTest {

    @Test
    void testSecretKeyInjection() {
        SecurityVault vault = new SecurityVault();
        String activeKey = vault.getSecretKey();

        //kiem tra
        assertNotNull(activeKey);

        //in
        System.out.println("DEBUG: Mã khóa đang hoạt động là: " + activeKey);
    }
}