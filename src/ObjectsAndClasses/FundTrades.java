package ObjectsAndClasses;

public class FundTrades extends Trade{
    private double percentage;

    public FundTrades (double dividend, String id, String symbol, int quantity, double percentage){
        super(dividend, id, symbol, quantity);
        this.percentage = percentage;
    }

    public FundTrades (double dividend, String id, String symbol, int quantity, double price, double percentage){
        super(dividend, id, symbol, quantity, price);
        this.percentage = percentage;
    }

    @Override
    public double calcDividend (){
        double fixed = percentage * getPrice();
        super.setDividend(fixed);
        return super.getDiviend();
    }
}
