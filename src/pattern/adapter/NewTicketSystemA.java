package pattern.adapter;

public class NewTicketSystemA implements TicketG {
    // 만약 중복 코드의 양이 엄청나다면 비효율적인 상황이 발생할 것

    @Override
    public void choice(int token) {
        // 중복
        System.out.println("선택된 식권 타입은... " + token + " 입니다");
    }

    @Override
    public void print() {
        // 중복
        System.out.println("식권을 출력합니다..");
    }

    @Override
    public void buyOnOffline() {
        // 중복
        System.out.println("식권을 구매합니다..");
    }

    @Override
    public void buyOnOnline() {
        throw new UnsupportedOperationException("지원되지 않는 기능");
    }

    @Override
    public String getMenu() {
        throw new UnsupportedOperationException("지원되지 않는 기능");
    }

}