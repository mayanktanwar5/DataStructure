package treegraph;

public class MinHeightBST {

	public TreeNode create(int[] tree)
	{
		return  createBST(0,tree.length-1,tree);
		
	}
	
	public TreeNode createBST(int start, int end,int[] tree)
	{
		
		if(end<start)
		 return null;
		
		int mid = (start+end)/2;
		TreeNode root = new TreeNode(tree[mid]);
		root.left=createBST(start,mid,tree);
		root.right = createBST(mid,end,tree);
		return root;
		
	}
	
}
