package Model;

import Exceptions.NoMoneyException;

public class BankAccount implements Account {
    private double balance;
    private Owner owner;


    public BankAccount(double balance, Owner owner){
        this.balance = balance;
        this.owner = owner;
    }


    @Override
    public void deposit(double amount) {
        this.balance += amount;
        this.owner = owner;
        System.out.println("Wpłacono środki: " + amount);

    }

    @Override
    public void withdraw(double amount) throws NoMoneyException {
        if (balance <= amount) {
            NoMoneyException nme = new NoMoneyException();
            nme.setInfo("Brak środków na koncie!");
            throw nme;
        }
        else {
            balance -= amount;
            System.out.println("Wypłacono środki: " + amount);
        }

    }


    public double getBalance(){
        return balance;
    }
}
