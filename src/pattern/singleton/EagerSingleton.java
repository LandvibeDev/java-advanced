package pattern.singleton;

public class EagerSingleton {

    /**
     *  - 클래스 로더가 초기화 하는 시점에 정적 바인딩
     *  - Thread-safe 하지 않음
     */
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
