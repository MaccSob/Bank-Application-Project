package Model;

import Exceptions.NoMoneyException;
import Exceptions.NrAccountEx;

public interface BankingOperations {
    public void deposit(int NrAccount,double amount) throws NrAccountEx;
    public void withdraw(int nrAccount,double amount) throws NoMoneyException, NrAccountEx;
    public void transfer(int nrAccountFrom,int NrAccountTo,double amount) throws NrAccountEx, NoMoneyException;
}
