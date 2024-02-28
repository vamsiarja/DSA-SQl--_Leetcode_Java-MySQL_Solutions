/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
         if(root == null){
            return;
        }
        TreeNode leftside = root.left;
        TreeNode Rightside = root.right;
        root.left = null;
        flatten(leftside);
        flatten(Rightside);
        root.right =leftside;
        TreeNode current = root;
        while(current.right!=null){
            current = current.right;
        }
        current.right = Rightside;
    }
}