package Creational_and_Structural_Patterns.Facade_Pattern;

import java.math.BigDecimal;

public interface IAccount {
    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(int account, BigDecimal amount);
    public int getAccountNumber();
}
