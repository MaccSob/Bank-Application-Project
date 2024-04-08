package ObserverPattern;

import Model.BankAccount;

public interface ObserverOffice {
    public void update(BankAccount bankAccount, double amount);
}
