package org.example.maximumDepthofBinaryTree;

public class Solution {
    public static void main(String[] args) {

    }

    public static int maxDepth(TreeNode root) {
        int leftDepth;
        int rightDepth;
        if (root == null)
            return 0;
        else {
            leftDepth = maxDepth(root.left);
            rightDepth = maxDepth(root.right);
        }

        return leftDepth < rightDepth ? rightDepth : leftDepth;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
