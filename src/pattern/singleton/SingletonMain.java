package pattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazyDCLSingleton lazyDCLSingleton = LazyDCLSingleton.getInstance();
        LazyEnumSingleton lazyEnumSingleton = LazyEnumSingleton.INSTANCE;
        LazyHolderSingleton lazyHolderSingleton = LazyHolderSingleton.getInstance();
    }
}
