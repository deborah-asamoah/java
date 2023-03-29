package ObjectsAndClasses;

public class Trade {
    private String id ;
    private String symbol;
    private int quantity;
    private double price;

    public Trade(String id, String symbol, int quantity){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public Trade(String id, String symbol, int quantity, double price){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public void setPrice(double myPrice) {
        if (myPrice > 0){
            this.price = myPrice;
        }
    }

    public int getQuantity (){
        return  quantity;
    }

    public double getPrice (){
        return  price;
    }


    public String toString(){
        return ("ID: " + id + ", Symbol: " + symbol + ", Quantity: " + quantity + ", Price: " + price);
    }

    public static void main (String[] args){
        Trade t1 = new Trade("T1", "APPL", 100, 15.25);
        System.out.println(t1.toString());
    }


}
