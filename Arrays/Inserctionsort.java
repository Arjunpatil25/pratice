package Arrays;

import java.util.Arrays;

public class Inserctionsort {
    public static void main(String[] args) {
        int Arr []={9,8,7,44,7,2,6,4,5,8,2};

        for(int i=1;i<Arr.length;i++){
            int key =Arr[i];
            int j=i-1;
            while ((j>=0)&&(Arr[j]>key)) {
                Arr[j+1]=Arr[j];
                j=j-1;
                
            }
            Arr[j+1]=key;
        }
        System.out.println(Arrays.toString(Arr));

    }
}
