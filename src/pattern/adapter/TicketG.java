package pattern.adapter;

public interface TicketG {
    public void choice(int token);
    public void print();
    public void buyOnOffline();
    public void buyOnOnline();
    public String getMenu();
}
