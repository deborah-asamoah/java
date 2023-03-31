package Arrays;

import java.util.Arrays;

public class ArrayOfInt {
    private static int lengthOfArray;
    private int[] values;

    public ArrayOfInt (int lengthOfArray){
        this.lengthOfArray = lengthOfArray;
        this.values = new int[lengthOfArray];
        updateArray();

    }



    private void updateArray() {
        for (int i = 0; i < lengthOfArray; i++) {
            values[i] = i+1;
        }
    }

    @Override
    public String toString() {
        return "ArrayOfInt{" +
                "values=" + Arrays.toString(values) +
                '}';
    }

//    public static void main (String[] args){
//        ArrayOfInt arrayOfInt = new ArrayOfInt(7);
//        System.out.println(arrayOfInt);
//
//    }
}
