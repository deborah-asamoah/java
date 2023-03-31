package ObjectsAndClasses;

import java.time.LocalTime;

public class Client {
    private String firstName;
    private String lastName;

    private MembershipType membershipType;

    private int points;

    private int totalTrades;

    private double totalValueTraded;


    public Client (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipType = null;
    }


    private void addPoints (){
        this.points += 1;
    }

    public int getPoints (){
        return this.points;
    }

    public void updatePoints (){
        this.addPoints();
        int point = this.getPoints();
        if (point > 0 && point < 10) {
            upgradeMembership(new Bronze());
        } else if (point >= 10 && point <= 19) {
             upgradeMembership(new Silver());
        } else if (point > 20) {
            upgradeMembership(new Gold());
        }
    }

    private void upgradeMembership (MembershipType newMembershipType){
        this.membershipType = newMembershipType;

    }

    private int maxValueOfTrade;


    public void addTrade (Trade trade){

        if (membershipType instanceof  Bronze && trade.getTimeOfTrade().isBefore(LocalTime.of(10, 0, 0))) {
            return;
        }

        if (this.canTrade()) {
            System.out.println("Hurayyyyy.. ou can make a trade");
        } else {
            System.out.println("Sorry, you cannot make a trade");
        }

    }


    public boolean canTrade (){
        if (membershipType instanceof Bronze) {
            return (this.getClientTrade() < membershipType.getMemberLimit()) ;
        } else if (membershipType instanceof Silver) {
            return this.getClientTrade() < membershipType.getMemberLimit();
        } else if (membershipType instanceof Gold) {
            return this.getClientTrade() < membershipType.getMemberLimit();
        } else {
            return false;
        }
    }


//    returns the total number of client trades
    private int getClientTrade (){
        return  0;
    }



    public String toString (){
        return firstName + " " + lastName +  " has membershipType: " + membershipType;
    }


    public static void main(String[] args) {

        Client client = new Client("Debbie", "A");
        client.updatePoints();
        System.out.println(client.toString());
    }

}
