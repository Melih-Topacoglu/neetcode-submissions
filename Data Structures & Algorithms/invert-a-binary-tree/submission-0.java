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
    public TreeNode invertTree(TreeNode root) {
        ArrayList<TreeNode> result = new ArrayList<>();

        swap(root);

        return root;
    }

    public void swap(TreeNode node){
        if(node == null) return;
        TreeNode temp;
        temp = node.left;
        node.left = node.right;
        node.right = temp;

        swap(node.left);

        swap(node.right);
    }
}
