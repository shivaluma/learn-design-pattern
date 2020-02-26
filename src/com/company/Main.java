package com.company;


import FactoryMethod.Bank;
import FactoryMethod.BankFactory;
import FactoryMethod.BankType;
import Singleton.BillPughSingleton;

public class Main {

    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.Vietcombank);
        System.out.println(bank.getName());
    }
}
