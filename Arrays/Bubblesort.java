package Arrays;



public class Bubblesort{
public static void main(String[] args) {
    
    int Arr[]={9,5,6,7,4,5,78,4,5,7,5};

    for(int i=0;i<Arr.length-1;i++){
        for(int j=0;j<Arr.length-1;j++){
            if(Arr[j]>Arr[j+1]){
                int temp =Arr[j];
                Arr[j]=Arr[j+1];
                Arr[j+1]=temp;
            }
        }
    }
    for(int i=0;i<Arr.length;i++){
        System.out.print(Arr[i]);
    }

}
}