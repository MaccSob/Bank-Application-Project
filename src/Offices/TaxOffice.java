package Offices;

import Model.BankAccount;
import ObserverPattern.ObserverOffice;

public class TaxOffice implements ObserverOffice {
    public static void raport(){
        System.out.println("Wysłano informację do urzędu skarbowego.");

    }

    @Override
    public void update(BankAccount bankAccount, double amount) {

    }
}
