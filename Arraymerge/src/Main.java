
import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i <m ; i++) {
            nums1[i]=nums1[i];
        }
        for (int j = 0; j <n ; j++) {
            nums1[m+j]=nums2[j];
        }
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));
    }
}
public class Main {
    public static void main(String[] args) {
        int[] nums1 ={};
        int[] nums2 = {1};

        int m=nums1.length;
        int n=nums2.length;

        Solution solution=new Solution();
        solution.merge(nums1,nums1.length,nums2,nums2.length);
    }
}