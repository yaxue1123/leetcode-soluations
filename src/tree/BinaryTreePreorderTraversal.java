package tree;

public class BinaryTreePreorderTraversal {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */

    List<Integer> result = new ArrayList<Integer>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        // get root first.
        if (root != null) {
            result.add(root.val);
            
            // then left child recursively.
            if (root.left != null) {
                preorderTraversal(root.left);
            } 
        
            // then right child recursively.
            if (root.right != null) {
                preorderTraversal(root.right);
            } 
        
        }
        
        return result;
    }
}

// Better solution using dfs.
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }
    
    void dfs(TreeNode root, List<Integer> list) {
        if (root == null) return;
        
        list.add(root.val);
        dfs(root.left, list);
        dfs(root.right, list);
    }
}
