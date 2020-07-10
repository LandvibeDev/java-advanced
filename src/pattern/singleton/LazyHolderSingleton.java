package pattern.singleton;

public class LazyHolderSingleton {

    private LazyHolderSingleton() {
    }

    /**
     * - 변수가 아니기 때문에 LazyHolderSingleton 객체를 로딩할 때, LazyHolderSingletonHolder를 초기화 하지 않는다.
     * - getInstance() 메소드 호출 시점에 Holder와 instance를 모두 초기화 한다.
     * - volatile과 synchronized 없이도 구현 가능
     * - 가장 많이 사용되는 방법
     */
    private static class LazyHolderSingletonHolder {
        private static final LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    public static LazyHolderSingleton getInstance() {
        return LazyHolderSingletonHolder.instance;
    }
}
