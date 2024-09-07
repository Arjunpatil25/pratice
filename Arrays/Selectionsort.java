package Arrays;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int Arr[] = { 8,9,5,6,6,7,2,4,3,1};
        for (int i = 0; i < Arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[min] > Arr[j]) {
                    min = j;
                }
               
            }
            int temp = Arr[min];
            Arr[min] = Arr[i];
            Arr[i] = temp;
        }
         System.out.println("Original Array: " + Arrays.toString(Arr));

    }
}
