package pattern.singleton;

public class LazyDCLSingleton {

    /**
     * volatile 변수를 사용하면, CPU 캐시에 저장하지 않기 않고 메인 메모리에만 캐시를 저장하기 때문에 멀티코어간의 데이터 불일치 문제를 예방한다.
     */
    private volatile static LazyDCLSingleton instance;

    private LazyDCLSingleton() {
    }

    /**
     *  - 인스턴스를 필요한 시점에 요청 하여 동적 바인딩을 통해 인스턴스 생성
     *  - Thread-safe 함
     *  - 인스턴스가 생성 되지 않은 경우에만 synchronized 블럭을 거침
     */
    public static LazyDCLSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDCLSingleton.class) {
                if (instance == null) {
                    instance = new LazyDCLSingleton();
                }
            }
        }
        return instance;
    }
}
