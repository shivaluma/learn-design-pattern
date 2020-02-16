package Singleton;


// like eager but add additional error handling.

public class StaticBlockSingleton {
    private static final StaticBlockSingleton instance;

    StaticBlockSingleton() {}


    static {
        try {
            instance = new StaticBlockSingleton();
        }
        catch (Exception ex) {
            throw new RuntimeException("Exception occurs when create new instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
