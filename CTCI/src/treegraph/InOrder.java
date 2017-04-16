package treegraph;

import java.util.*;

public class InOrder {

	public List<Integer> iterative(TreeNode root)
	{
		List<Integer> result = new ArrayList<>();
		if(root==null)
		 return result;		
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root!=null || !stack.isEmpty())
		{
			while(root!=null)
			{
				stack.add(root);
				root=root.left;
			}
			root= stack.pop();
			result.add(root.data);
			root=root.right;
		}		
		return result;		
	}
	
	public void recursive(TreeNode root)
	{
		if(root==null)
			return ;
		
		recursive(root.left);
		System.out.println(root.data);
		recursive(root.right);
		
	}
}
