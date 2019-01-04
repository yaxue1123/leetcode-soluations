/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {    
       List<Integer> list = new ArrayList();
       dfs(root, list);
       return list;
    }

    void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        
        dfs(root.left, list);
        list.add(root.val);
        dfs(root.right, list);
    }
}