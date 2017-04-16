package treegraph;
import java.util.*;
public class TreeBFS {

	public ArrayList<ArrayList<Integer>> bfs(TreeNode root)
	{
		
		if(root==null)
			return null;
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		Queue<TreeNode> que = new LinkedList<>();
		
		que.add(root);
		TreeNode temp;
		int size;
		while(!que.isEmpty())
		{
			size = que.size();
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0;i<size;i++)
			{
				temp = que.poll();
				list.add(temp.data);
				if(temp.left!=null)
					que.add(temp.left);
				if(temp.right!=null)
					que.add(temp.right);
			}
			result.add(list);
		}
		
		return result;
		
	}
	
}
