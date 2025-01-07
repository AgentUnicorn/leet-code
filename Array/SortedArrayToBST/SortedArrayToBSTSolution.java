package Array.SortedArrayToBST;

import java.util.*;

public class SortedArrayToBSTSolution {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTRecursive(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedArrayToBSTRecursive(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = sortedArrayToBSTRecursive(nums, start, mid - 1);
        root.right = sortedArrayToBSTRecursive(nums, mid + 1, end);
        return root;
    }

    public static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int[][] inputs = {
            {-10,-3,0,5,9},
            {1,3}
        };
        for (int i = 0; i < inputs.length; i++) {
            TreeNode tree = sortedArrayToBST(inputs[i]);
            System.out.println(" ");
            preOrder(tree);
        }
    }
}
