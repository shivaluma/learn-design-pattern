package FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.Vietcombank);
        System.out.println(bank.getName());
    }
}
