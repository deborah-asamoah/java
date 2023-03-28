package Lab1.Question2;

public class RandomInteger {

    public static void random(){
        int rand = (int)(Math.random()*100 )+0;

        System.out.println(rand);
        if (rand % 2 == 0 )  {
            System.out.println("This random integer is even");
        } else {
            System.out.println("This random integer is odd");
        }


//        if ( rand == 0 )  {
//            System.out.println("frozen");
//        } else if (rand >= 1 && rand <= 14) {
//            System.out.println("cold");
//        } else if (rand >= 15 && rand <= 24 ) {
//            System.out.println("cool");
//        } else if (rand >= 25 && rand <= 40 ) {
//            System.out.println("warm");
//        } else if (rand >= 41 && rand <= 60 ) {
//            System.out.println("hot");
//        } else if (rand >= 61 && rand <= 80 ) {
//            System.out.println("very hot");
//        } else if (rand >= 81 && rand <= 99) {
//            System.out.println("extremely hot");
//        } else if (rand == 100) {
//            System.out.println("boiling");
//        }



    }
}
