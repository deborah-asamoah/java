package ObjectsAndClasses;

public class BondTrades extends Trade{

    public BondTrades (double dividend, String id, String symbol, int quantity){
        super(dividend, id, symbol, quantity);
    }

    public BondTrades (double dividend, String id, String symbol, int quantity, double price){
        super(dividend, id, symbol, quantity, price);
    }

    @Override
    public double calcDividend (){
        return super.getDiviend();
    }
}
