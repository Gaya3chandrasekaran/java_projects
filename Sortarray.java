import java.util.Arrays;
import java.util.Collections;

public class Sortarray {
    public static void main(String[] args) {
        Integer[] arr = {89, 56, 11, 78, 45, 94, 67, 32, 20, 3};
        System.out.println("Given array: "+Arrays.toString(arr));
        //sort - ascending order
        Arrays.sort(arr);
        System.out.println("Array in ascending order: " + Arrays.toString(arr));
        //sort - descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array in descending order: " + Arrays.toString(arr));
        //reverse an array
        Integer[] arr1 = {12,23,34,45,56};
        System.out.println("Given array: "+Arrays.toString(arr1));
        Collections.reverse(Arrays.asList(arr1));
        System.out.println("Reversed array: " +Arrays.asList(arr1));
    }
}
