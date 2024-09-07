package Arrays;

public class Linnersearch {

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {4, 7, 1, 9, 3};
int target = 9;
int result = search(numbers, target);
System.out.println(result);  // Output: 3 (since 9 is at index 3)

    }
}
