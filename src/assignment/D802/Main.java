package assignment.D802;


import java.lang.reflect.Array;

public class Main {
    public int[] findAndReturnPrimeNumbers(int[] inputArray){
        Array[] array = new Array[8];

    }

    public static void main(String[] args) {
        Main m1 = new Main();
        int[] arr = {10,12,5,50,11,14,15};
        int[] returnedArray =  m1.findAndReturnPrimeNumbers(arr);
        if(returnedArray.length == 0){
            System.out.println( "Prime number not found in the supplied Array");
        }
        else{
            for (int i = 0; i < returnedArray.length; i++) {
                System.out.println(returnedArray[i]);
            }
        }
    }
}
