package Creational_and_Structural_Patterns.Facade_Pattern;

import java.math.BigDecimal;
import java.util.Hashtable;

public class BankService{
    private Hashtable<Integer, IAccount> bankAccounts;

    public BankService() {
        this.bankAccounts = new Hashtable<>();
    }

    private static int accountCounter = 1000;

    public int createAccount(String type, BigDecimal initAmount) {
        IAccount newAccount = null;
        int accountNumber = ++accountCounter;
        switch (type) {
            case "Creational_and_Structural_Patterns.Facade_Pattern.Chequing":
                newAccount = new Chequing(accountNumber, initAmount);
                break;
            case "Creational_and_Structural_Patterns.Facade_Pattern.Saving":
                newAccount = new Saving(accountNumber, initAmount);
                break;
            case "Creational_and_Structural_Patterns.Facade_Pattern.Investment":
                newAccount = new Investment(accountNumber, initAmount);
                break;
            default:
                throw new IllegalArgumentException("Invalid account type: " + type);
        }

        bankAccounts.put(accountNumber, newAccount);
        return accountNumber;
    }


    public void transferMoney(int to, int from, BigDecimal amount){
        IAccount toAccount = bankAccounts.get(to);
        IAccount fromAccount = bankAccounts.get(from);

        BigDecimal fromBalance = getBalance(from);
        System.out.println("Before transfer, from balance: " + fromBalance);
        BigDecimal toBalance = getBalance(to);
        System.out.println("Before transfer, to balance: " + toBalance);
        if(fromBalance.compareTo(amount) < 0){
            throw new IllegalArgumentException("Insufficient funds in the source account.");
        }
        BigDecimal newToBalance = toBalance.add(amount);
        BigDecimal newFromBalance = fromBalance.subtract(amount);
        if (toAccount instanceof Saving) {
            ((Saving) toAccount).setBalance(newToBalance);
        } else if (toAccount instanceof Investment) {
            ((Investment) toAccount).setBalance(newToBalance);
        } else if (toAccount instanceof Chequing) {
            ((Chequing) toAccount).setBalance(newToBalance);
        }

        if (fromAccount instanceof Saving) {
            ((Saving) fromAccount).setBalance(newFromBalance);
        } else if (fromAccount instanceof Investment) {
            ((Investment) fromAccount).setBalance(newFromBalance);
        } else if (fromAccount instanceof Chequing) {
            ((Chequing) fromAccount).setBalance(newFromBalance);
        }

    }

    public BigDecimal getBalance(int accountNumber){
        IAccount account = bankAccounts.get(accountNumber);

        if(account instanceof Saving){
            return ((Saving) account).getBalance();
        } else if(account instanceof Investment){
            return ((Investment) account).getBalance();
        }else if (account instanceof Chequing){
            return ((Chequing) account).getBalance();
        }else {
            throw new IllegalArgumentException("Account type does not support balance retrieval.");
        }
    }
}
