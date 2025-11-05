package Creational_and_Structural_Patterns.Facade_Pattern;

import java.math.BigDecimal;

public class Customer {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        int mySaving = bankService.createAccount("Creational_and_Structural_Patterns.Facade_Pattern.Saving", new BigDecimal(1000));
        System.out.println("My saving account balance: " + bankService.getBalance(mySaving));

        int myInvestment = bankService.createAccount("Creational_and_Structural_Patterns.Facade_Pattern.Investment", new BigDecimal(500));
        System.out.println("My investment account balance: " + bankService.getBalance(myInvestment));

        bankService.transferMoney(myInvestment, mySaving, new BigDecimal(200));
        System.out.println("After transfer, my investment account balance: " + bankService.getBalance(myInvestment));
        System.out.println("After transfer, my saving account balance: " + bankService.getBalance(mySaving));
    }
}
