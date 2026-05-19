package bai92.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankSystem {
    private static final Logger logger = LoggerFactory.getLogger(BankSystem.class);
    private static final String BANK_NAME = "MemeBank";
    private double balance;

    public BankSystem(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            logger.warn("Yêu cầu nạp số tiền không hợp lệ: {}", amount);
            return;
        }
        balance += amount;
        logger.info("Nạp tiền thành công! Số tiền: {}, Số dư hiện tại: {}", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            logger.error("Rút tiền thất bại! Số tiền yêu cầu {} vượt quá số dư hiện tại {}", amount, balance);
            return;
        }
        balance -= amount;
        logger.info("Rút tiền thành công! Số tiền: {}, Số dư còn lại: {}", amount, balance);
    }

    public double getBalance() {
        return balance;
    }
}
