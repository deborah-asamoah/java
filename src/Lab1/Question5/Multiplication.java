package Lab1.Question5;

public class Multiplication {
    public static void main(String[] args) {
        for (int i =0; i <=10; i++) {
            System.out.println( "Multiplication by " + i);
            System.out.println("********************************");
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
