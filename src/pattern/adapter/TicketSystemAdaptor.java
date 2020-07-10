package pattern.adapter;

public class TicketSystemAdaptor implements TicketG {
    private TicketA ticket;

    public TicketSystemAdaptor(TicketA ticket) {
        this.ticket = ticket;
    }

    @Override
    public void choice(int token) {
        // A 티켓 시스템을 그대로 사용
        ticket.choice(token);
    }

    @Override
    public void print() {
        // A 티켓 시스템을 그대로 사용
        ticket.print();
    }

    @Override
    public void buyOnOffline() {
        // A 티켓 시스템을 그대로 사용
        ticket.buy();
    }

    @Override
    public void buyOnOnline() {
        throw new UnsupportedOperationException("지원되지 않는 기능");
    }

    @Override
    public String getMenu() {
        // 신규 기능 추가
        return "메뉴정보를 DB에서 가져왔습니다";
    }

}