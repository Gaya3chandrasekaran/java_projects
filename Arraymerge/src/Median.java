import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        double median;
        int[] sortedarray= new int[m+n];
        for (int i = 0; i <m ; i++) {
            sortedarray[i]=nums1[i];
        }
        for (int j = 0; j <n ; j++) {
            sortedarray[m+j]=nums2[j];
        }
        Arrays.sort(sortedarray);
        int x=sortedarray.length;
        int z=x%2;
        int y=x/2;
        switch (z){
            case 1:
                median= sortedarray[y];
                System.out.print("merged array: "+Arrays.toString(sortedarray)+ " and the median is "+ median);
                break;
            case 0:
                double value= sortedarray[y]+sortedarray[(y-1)];
                median = (value) / 2.0;
                System.out.print("merged array: "+Arrays.toString(sortedarray)+ " and the median is "+ median);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + y);
        }
        
        return median;
    }
}
public class Example2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        Solution solution = new Solution();
        solution.findMedianSortedArrays(nums1, nums2);
    }
}
