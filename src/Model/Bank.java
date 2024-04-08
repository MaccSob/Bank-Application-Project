package Model;

import Exceptions.NoMoneyException;
import Exceptions.NrAccountEx;
import ObserverPattern.Observable;
import ObserverPattern.ObserverOffice;
import Offices.TaxOffice;

import java.util.ArrayList;

public class Bank implements Observable, BankingOperations {
    public ArrayList<BankAccount> accounts = new ArrayList<>();
    private ArrayList<ObserverOffice> observers = new ArrayList<>();
    private BankAccount bankAccount;
    private double amount;




    @Override
    public void addObserverOffice(ObserverOffice observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserverOffice(ObserverOffice observer) {
        this.observers.remove(observer);

    }

    @Override
    public void notifyObserversOffices(ObserverOffice observer) {
        for ( int i=0;i<this.observers.size();i++){
            this.observers.get(i).update(this.bankAccount,this.amount);
        }

    }


    @Override
    public void deposit(int NrAccount, double amount) throws NrAccountEx {
        if (NrAccount >= accounts.size()) {
            NrAccountEx nae = new NrAccountEx();
            nae.setInfo("Wrong account number");
            throw nae;
        }
        else this.accounts.get(NrAccount).deposit(amount);



    }

    @Override
    public void withdraw(int nrAccount, double amount) throws NoMoneyException, NrAccountEx {
        if (nrAccount >= accounts.size()){
            NrAccountEx nae = new NrAccountEx();
            nae.setInfo("Brak środków na koncie");
            throw nae;
        }
        else {
            this.accounts.get(nrAccount).withdraw(amount);
        }
    }

    @Override
    public void transfer(int nrAccountFrom, int NrAccountTo, double amount) throws NrAccountEx, NoMoneyException {
        if (nrAccountFrom >= accounts.size() || NrAccountTo >= accounts.size())
        {
            NrAccountEx nae = new NrAccountEx();
            nae.setInfo("Brak środków na koncie!");
            throw nae;
        }
        else {
            this.accounts.get(nrAccountFrom).withdraw(amount);
            this.accounts.get(NrAccountTo).deposit(amount);
        }
    }

    public void raport() {
        TaxOffice.raport();
    }



}
