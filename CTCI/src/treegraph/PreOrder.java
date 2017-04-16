package treegraph;

import java.util.*;

public class PreOrder {

	public List<Integer> iterative(TreeNode node)
	{
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(node == null)
			return null;
		
		while(node !=null)
		{
		 result.add(node.data);
		 
		 if(node.right!=null)
		 stack.push(node.right);
		 
		 node = node.left;
		 
		 if(node==null &&  !stack.isEmpty())
			 node=stack.pop();
			
		}
		
		return result;
		
	}
	
	public void recursive(TreeNode node)
	{
		if(node == null)
			return ;
		System.out.println(node.data);
		recursive(node.left);
		recursive(node.right);
		
	}
	
}
