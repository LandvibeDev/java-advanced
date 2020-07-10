package pattern.adapter;

public class Cafeteria {
    public static void main(String[] args) {
        System.out.println("====================A사 시스템====================");
        TicketA ticketA = new TicketSystemA();
        ticketA.choice(1);
        ticketA.buy();
        ticketA.print();

        System.out.println("====================G사 시스템====================");
        TicketG ticketG = new TicketSystemG();
        ticketG.choice(1);
        ticketG.buyOnOffline();
        ticketG.buyOnOnline();
        ticketG.print();
        System.out.println(ticketG.getMenu());

        System.out.println("===========G사에 통합된 A사 티켓 시스템============");
        TicketG newTicketA = new TicketSystemAdaptor(new TicketSystemA());
        newTicketA.choice(1);
        newTicketA.buyOnOffline();
        newTicketA.print();
        System.out.println(newTicketA.getMenu());

        /**
         * Adapter 패턴 정리
         * Client: Main
         * Target Interface: TicketG
         * Adapter: TicketSystemAdaptor
         * Adaptee: TicketA
         */
    }
}
