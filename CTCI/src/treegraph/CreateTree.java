package treegraph;

import java.util.*;

public class CreateTree {

	
	public TreeNode create(String str){
	
		if(str==null)
			return null;
		
		String [] data = str.split("");
		Queue<TreeNode> que = new LinkedList<TreeNode>();		
		TreeNode head = new TreeNode(Integer.parseInt(data[0]));
		TreeNode temp;
		que.add(head);
		for(int i=1;i<str.length();i++ )
		{
			temp =que.poll();
			
			if(!data[i].equals("n"))
			{		
				TreeNode left=new TreeNode(Integer.parseInt(data[i])); 
				temp.left = left;
			    que.add(temp.left);
			}
			
			if(!data[++i].equals("n"))
			{				
				TreeNode right = new TreeNode(Integer.parseInt(data[i]));
				temp.right = right;
			    que.add(temp.right);
			}
		}
		
		return head;
		
	};
}
