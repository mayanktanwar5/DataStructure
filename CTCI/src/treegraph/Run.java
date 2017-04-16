package treegraph;

import java.util.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeNode head;
		//CreateTree  tree = new CreateTree();
		//head= tree.create("123nn45nn67");
		
		//PreOrder pre = new PreOrder();
		//pre.recursive(head);
		//printList(pre.iterative(head));
		
		//InOrder in = new InOrder();
		//printList(in.iterative(head));
		//in.recursive(head);
		
		//BalancedTree bal = new BalancedTree();
		//System.out.println(bal.check(head));
		System.out.println(fib(5));
	}
	
	public static int fib(int n)
	{
		
	    if(n == 0 || n == 1)
	        return n;
	   	
	    return fib(n-1) + fib(n-2);
	}
	public static void printList(List<Integer> list)
	{
		
		for(Integer l:list)
		{
			System.out.print(l+" ");
		}		
		
	}

}
