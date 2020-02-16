package Singleton;
// initialized at the time it was called
// pros : easiest
// cons : the instance was initialized but not used

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
