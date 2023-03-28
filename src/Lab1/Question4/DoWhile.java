package Lab1.Question4;

public class DoWhile {
    public static void main(String[] args) {
        int n = (int) (-3 + Math.random()*(3 - -3 + 1));
//        do {
//            System.out.println(n);
//        } while(n != 0);


        while ( n != 0){
            System.out.println(n);
        }
    }
}
