package Singleton;


// best way to implement singleton
// avoid create instance when running in multithread.
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return BillPughSingletonHelper.instance;
    }

    static class BillPughSingletonHelper {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

}
