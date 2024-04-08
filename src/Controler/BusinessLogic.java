package Controler;

import Exceptions.NoMoneyException;
import Exceptions.NrAccountEx;
import Model.Bank;
import Model.BankAccount;
import Model.Owner;

public class BusinessLogic {
    private Bank bank;

    public void setBank (Bank bank) {
        this.bank=bank;
    }




    public BankAccount addNewAccount(Owner owner){
        BankAccount account = new BankAccount(0,owner);
        this.bank.accounts.add(account);
        return account;

    }


    public void deposit(double amount, int nrAccount) throws NrAccountEx {
        this.bank.deposit(nrAccount, amount);
        if (amount > 10000){
            bank.raport();
        }

    }
    public void withdraw(double amount, int nrAccount) throws NoMoneyException, NrAccountEx {
        this.bank.withdraw(nrAccount,amount);
        if (amount > 10000){
            bank.raport();
        }


    }
    public void transfer(int nrAccountFrom,int nrAccountTo,double amount) throws NrAccountEx, NoMoneyException {
        this.bank.transfer(nrAccountFrom, nrAccountTo, amount);
        if (amount > 10000){
            bank.raport();
        }


    }
    {

    }
}
