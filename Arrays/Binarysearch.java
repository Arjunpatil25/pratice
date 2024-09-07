package Arrays;

public class Binarysearch {
     public static int search(int []arr,int target){
        int left=0;int right=arr.length-1;
        while (left<=right) {
            int mid =left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }

        return -1;
        
     }
     public static void main(String[] args) {
        int[] sortedArr = {1, 3, 5, 7, 9, 11};
int target = 11;
int result = Binarysearch.search(sortedArr, target);
System.out.println(result); 

     }
}
