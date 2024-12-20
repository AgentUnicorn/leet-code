package Array.MergeSortedArray;

import java.util.Arrays;
import java.util.List;

public class MergeSortedArraySolution {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n - 1;
        int c = m + n - 1;

        while (b >= 0) {
            if (a >= 0 && nums1[a] > nums2[b]) {
                nums1[c--] = nums1[a--];
            } else {
                nums1[c--] = nums2[b--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[5];
        int[] nums2 = {1, 2, 3, 4, 5};
        merge(nums1, 0, nums2, 5);
        for (Integer num : nums1) {
            System.out.print(num + " ");
        }
    }
}
