package treegraph;

public class CheckBST {

	public boolean check(TreeNode root)
	{
	  return verifyBST(root,null,null);
	}

	private boolean verifyBST(TreeNode root, Integer max, Integer min) {
		
	if(root == null)	
	 return true;
	
	if(min!=null && root.data<min )
		return false;
	
	if(max!=null && root.data>=max)
		return false;
		
	if( !verifyBST(root.left,root.data,min)|| !verifyBST(root.right,max,root.data))
			return false;
	return true;
	}
	
	
	
}
