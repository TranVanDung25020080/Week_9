package bai92.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankSystemTest {
    @Test
    void testDepositAndWithdraw() {
        BankSystem bank = new BankSystem(1000);
        bank.deposit(500);
        assertEquals(1500, bank.getBalance());

        bank.withdraw(2000);
        assertEquals(1500, bank.getBalance());
    }
}
