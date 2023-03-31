package Arrays;

import java.util.Arrays;

public class ArrayOfSix {
    private int[] values = new int[6];
    private int rand;

    public ArrayOfSix (){
        generateValues();
        checkingForDuplicates();
        insertionSort();
    }
    public int[] generateValues (){
        for (int i = 0; i < 6; i++) {
            rand = (int) (1 + Math.random()*49);
            values[i] = rand;
        }
        return values;
    }

    public  void checkingForDuplicates () {
        for (int i = 0; i < 6; i++) {
            for (int j = i+1; j < 6; j++) {
                if (values[i] == values[j]) {
                    generateValues();
                }
            }
        }
    }
    
    public void  insertionSort (){
        for (int i = 0; i < values.length; i++) {

        }
    }

    public static void main (String[] args){
        ArrayOfSix arrayOfSix = new ArrayOfSix();
        System.out.println("Array when not sorted "+ Arrays.toString(arrayOfSix.values));
                Arrays.sort(arrayOfSix.values);
        System.out.println("Array when sorted "+ Arrays.toString(arrayOfSix.values));
    }
}