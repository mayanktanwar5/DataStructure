package treegraph;

public class BalancedTree {

	public boolean check(TreeNode root)
	{
		if(checkHeight(root) ==-1)
			return false;
		else
			return true;
	}
	
	public int checkHeight(TreeNode root)
	{
		if(root==null)
			return 0;
		
		int left= checkHeight(root.left);
		 if(left==-1)
			 return -1;
		int right = checkHeight(root.right);
		if(right==-1)
			return -1;
		int height = Math.abs(left-right);
		if(height>1)
			return -1;
		else
			return Math.max(left, right)+1;
		
		
	}
	
}
