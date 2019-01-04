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

    List<TreeNode> result = new ArrayList<TreeNode>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ls = new ArrayList<Integer>();
            
        helpFunc(root);
        
        for (TreeNode node : result) {
            ls.add(node.val);
        }
        
        return ls;
    }
    
    public TreeNode helpFunc(TreeNode root) {
         // get root first.
        if (root != null) {
            result.add(root);
            
            // then left child recursively.
            if (root.left != null) {
                helpFunc(root.left);
            } 
        
            // then right child recursively.
            if (root.right != null) {
                helpFunc(root.right);
            } 
        
        }
        
        return root;
    }
	
}
