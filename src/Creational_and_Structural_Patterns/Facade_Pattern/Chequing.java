package Creational_and_Structural_Patterns.Facade_Pattern;

import java.math.BigDecimal;

public class Chequing implements IAccount {
    private int accountNumber;
    private BigDecimal balance;

    // Constructor
    public Chequing(int accountNumber, BigDecimal initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter / Setter
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    // Implement interface
    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
        } else {
            throw new IllegalArgumentException("Insufficient funds in Creational_and_Structural_Patterns.Facade_Pattern.Chequing");
        }
    }

    @Override
    public void transfer(int account, BigDecimal amount) {
        throw new UnsupportedOperationException("Use Creational_and_Structural_Patterns.Facade_Pattern.BankService to transfer");
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}
