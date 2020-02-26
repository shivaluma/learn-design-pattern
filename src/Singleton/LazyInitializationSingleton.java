package Singleton;

// pros : only init instance when being called
//        good on single thread
// cons : can be more than one instance when running on multithread ( being call at the same time);



public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance = null;
    LazyInitializationSingleton() {}

    public static LazyInitializationSingleton getInstance() {
        if (instance == null) instance = new LazyInitializationSingleton();
        return instance;
    }
}
