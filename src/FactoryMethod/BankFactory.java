package FactoryMethod;

public class BankFactory {
    private BankFactory() {}

    public static Bank getBank(BankType bankType) {
        switch (bankType) {
            case Techcombank: return new Techcombank();
            case Vietcombank: return new Vietcombank();
            default: throw new IllegalArgumentException("No bank with this type");
        }
    }
}
