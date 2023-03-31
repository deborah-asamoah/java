package ObjectsAndClasses;

public class Account {
    private double totalTrades;

    private Trade[] tradeobjects;

    public double getTotalTrades(){
        return totalTrades;
    }

    public void setTotalTrades (double totalTrades){
        this.totalTrades = totalTrades;
    }

    public void loopThroughTrades (){
        for (int i =0; i < tradeobjects.length; i++){
            System.out.println(tradeobjects[i]);

            if (tradeobjects[i].getPrice() < 10.00) {
                System.out.println(tradeobjects[i]);

            }
        }
    }

}
