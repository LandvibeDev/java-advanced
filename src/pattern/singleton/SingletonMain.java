package pattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazyDCLSingleton lazyDCLSingleton = LazyDCLSingleton.getInstance();
        LazyEnumSingleton lazyEnumSingleton = LazyEnumSingleton.INSTANCE;
        LazyHolderSingleton lazyHolderSingleton = LazyHolderSingleton.getInstance();
        LazyHolderSingleton lazyHolderSingleton1 = LazyHolderSingleton.getInstance();
        LazyHolderSingleton lazyHolderSingleton2 = LazyHolderSingleton.getInstance();
        LazyHolderSingleton lazyHolderSingleton3 = LazyHolderSingleton.getInstance();

        System.out.println(lazyHolderSingleton);
        System.out.println(lazyHolderSingleton1);
        System.out.println(lazyHolderSingleton2);
        System.out.println(lazyHolderSingleton3);
    }
}
