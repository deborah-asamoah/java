package ObjectsAndClasses;

public class MainTrade {
    public static void main(String[] args) {
        Trade trade = new Trade("T1", "MAR", 12, 10.0 );
        System.out.println(trade.toString());

        Account account = new Account();

        Trader trader = new Trader("Debbie");
        trader.addTrade(trade);
        System.out.println(trader.toString());
    }
}
