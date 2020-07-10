package pattern.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    /**
     *  - 인스턴스를 필요한 시점에 요청 하여 동적 바인딩을 통해 인스턴스 생성
     *  - Thread-safe 함
     *  - getInstance()를 호출할 때 마다 무조건 synchronized 블럭을 거치기 때문에 성능상 문제가 발생할 수 있음
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
