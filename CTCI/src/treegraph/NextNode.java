package treegraph;

public class NextNode {

	public TreeNode inorderParent(TreeNode root)
	{
		
		if(root == null)
			return null;
		
		if(root.right!=null)
			return rightTraverse(root.right);
		else
		{
			TreeNode temp = root;
			TreeNode parent = temp.parent;
			
			while(parent!=null && parent.left ==temp)
			{
				temp=parent;
				parent=parent.parent;
			}
			
			return parent;			
		}
	}

	public TreeNode rightTraverse(TreeNode root) {
		// TODO Auto-generated method stub
		
		while(root.left!=null)
			root=root.left;
		return root;
	}
	
	
	public TreeNode inorderBST(TreeNode node, TreeNode root)
	{
		
		if(root==null || node==null)
			return null;
		if(node.right!=null)
			return rightTraverse(root.right);
		else
		{
			TreeNode successor = null;
			TreeNode ancestor = root;
			
			while(ancestor!=node)
			{
				if(node.data<ancestor.data)
				{
					successor = ancestor;
					ancestor = ancestor.left;
				}
				else
				{
					ancestor = ancestor.right;
					
				}
				
			}
			
			return successor;
		}
		
	}
	
	
}
