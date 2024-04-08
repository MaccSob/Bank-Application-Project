package com.company;

import Controler.BusinessLogic;
import Exceptions.NoMoneyException;
import Exceptions.NrAccountEx;
import Model.Bank;
import Model.BankAccount;
import Model.Owner;
import Offices.TaxOffice;
import View.ViewInterface;

public class Main {

    public static void main(String[] args) throws NoMoneyException, NrAccountEx {
        // write your code here
        Bank bank = new Bank();
        ViewInterface view = new ViewInterface();
        BusinessLogic controller1 = new BusinessLogic();

        controller1.setBank(bank);
        view.setController(controller1);

        Owner owner1 = new Owner("Dariusz", "Michnik");
        Owner owner2 = new Owner("Waldemar", "Kapar");

        controller1.addNewAccount(owner1);
        controller1.addNewAccount(owner2);


        try {
            controller1.deposit(10, 1);
            controller1.deposit(12000,1);
            controller1.withdraw(11000,0);
        } catch (NrAccountEx nae) {
            System.out.println(nae.getInfo());
        } catch (NoMoneyException nme) {
            System.out.println(nme.getInfo());

        }

        }
    }
