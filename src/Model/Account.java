package Model;

import Exceptions.NoMoneyException;

public interface Account {

    public void deposit(double amount);

    public void withdraw(double amount) throws NoMoneyException;
}
