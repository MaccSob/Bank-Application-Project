package Model;

import Exceptions.NoMoneyException;

public class SavingAccount extends BankAccount {
    private double interest;

    public SavingAccount(double balance, Owner owner) {
        super(balance, owner);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) throws NoMoneyException {
        super.withdraw(amount);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}
