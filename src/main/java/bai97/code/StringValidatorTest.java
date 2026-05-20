package bai97.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringValidatorTest {

    @Test
    void testValidEmail() {
        StringValidator validator = new StringValidator();
        assertTrue(validator.isValidEmail("25020080@vnu.edu.vn"));
    }

    @Test
    void testInvalidEmail() {
        StringValidator validator = new StringValidator();
        assertFalse(validator.isValidEmail("25020080_vnu.edu.vn"));
        assertFalse(validator.isValidEmail(""));
        assertFalse(validator.isValidEmail(null));
    }
}