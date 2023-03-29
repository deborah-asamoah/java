package ObjectsAndClasses;

public class Trader {
    private String name;
    private Account account;

    public Trader (String name){
        this.name = name;
        this.account = new Account();
    }

    public void addTrade (Trade trade){
        double finalTrade = (trade.getPrice() * trade.getQuantity()) + account.getTotalTrades();
        account.setTotalTrades(finalTrade);
    }

    public String toString(){
        return ("Total trades is for  " + name + " is :" + account.getTotalTrades());
    }

    public static void main(String[] args) {
        Trader trader = new Trader("Ama");
        System.out.println(trader.toString());
    }
}
