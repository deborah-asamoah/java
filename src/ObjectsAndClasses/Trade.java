package ObjectsAndClasses;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Trade {
    private String id ;
    private String symbol;
    private int quantity;
    private double price;

    private LocalDate dateOfTrade;

    private LocalTime timeOfTrade;

    private double tradeValue;


    private double dividend;

    public abstract double calcDividend();

    public Trade(double dividend, String id, String symbol, int quantity ){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.dividend = dividend;
        this.timeOfTrade = LocalTime.now();
        this.dateOfTrade = LocalDate.now();
    }

    public Trade(double dividend, String id, String symbol, int quantity, double price){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.dividend = dividend;
        this.timeOfTrade = LocalTime.now();
        this.dateOfTrade = LocalDate.now();
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


    public double getDiviend (){
        return dividend;
    }

    public void setDividend (double dividend){
        this.dividend = dividend;
    }



    public double getTradeValue (){
        return this.tradeValue;
    }

    public LocalTime getTimeOfTrade (){
        return this.getTimeOfTrade();
    }

    public LocalDate getDateOfTrade (){
        return this.getDateOfTrade();
    }

}
