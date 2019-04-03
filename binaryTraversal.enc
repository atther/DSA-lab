//Binary Search Tree
import java.util.*;
class binaryTraversal
{
	static class Node
	{
		int data;
		Node lChild;
		Node rChild;
		public Node(int d)
		{
			data=d;
			lChild=null;
			rChild=null;
		}
		public void displayNode()
		{
			System.out.println(data+" ");
		}
	}
	static class tree
	{
		Node root;
		public tree()
		{
			root=null;
		}
		/*public void insertElement(int d)
		{
		
			Node newNode=new Node(d);
			//newNode.displayNode();
			if(root==null)
				root=newNode;
			else
			{
				
				while(troot!=null)
				{
					if(newNode.data<troot.data)
					{
						troot=troot.lChild;
					}
					else
					{
						troot=troot.rChild;
					}
				}
				troot=newNode;
				
			}
		}*/
		public void insertElement(int d)
		{
			root=insert(root,d);
		}
		public Node insert(Node root,int d)
		{
			if(root==null)
			{
				root=new Node(d);
				return root;
			}
			if(d<root.data)
				root.lChild=insert(root.lChild,d);
			else if(d>root.data)
			{
				root.rChild=insert(root.rChild,d);
			}
			return root;
		}
		public void recInorder(Node troot)
		{
			//troot.displayNode();
			//troot=troot.lChild;
			//troot.displayNode();
			if(troot!=null)
			{
				recInorder(troot.lChild);
				troot.displayNode();
				recInorder(troot.rChild);
			}
		}
		public void recPreorder(Node troot)
		{
			if(troot!=null)
			{
				troot.displayNode();
				recPreorder(troot.lChild);
				recPreorder(troot.rChild);
			}
		}
		public void recPostorder(Node troot)
		{
			if(troot!=null)
			{
				recPostorder(troot.lChild);
				recPostorder(troot.rChild);
				troot.displayNode();
			}
		}
		public void iterateInorder(Node troot)
		{
			Stack s=new Stack(20);
			do
			{
				while(troot!=null)
				{
					s.push(troot);
					troot=troot.lChild;
				}
				if(!s.isEmpty())
				{
					troot=s.pop();
					troot.displayNode();
					troot=troot.rChild;
				}
			}while(!s.isEmpty() || troot!=null);
			System.out.println();
		}
		public void iteratePreorder(Node troot)
		{
			Stack s=new Stack(20);
			s.push(troot);
			while(!s.isEmpty())
			{
				troot=s.pop();
				troot.displayNode();
				if(troot.rChild!=null)
					s.push(troot.rChild);
				if(troot.lChild!=null)
					s.push(troot.lChild);
			}
			System.out.println();
		}
		public void iteratePostorder(Node troot)
		{
			Stack s=new Stack(20);
			/*s.push(troot);
			while(troot!=null)
			{
				if(troot.rChild!=null)
					s.push(troot.rChild);
				if(troot.lChild!=null)
					s.push(troot.lChild);
				troot=troot.lChild;
				if(troot.rChild==null && troot.lChild==null)
					break;
			}
			troot=s.pop();
			troot.displayNode();
			while(!s.isEmpty())
			{
				troot=s.pop();
				if(troot.rChild!=null)
					s.push(troot.rChild);
				if(troot.lChild!=null)
					s.push(troot.lChild);
				
			}
			System.out.println();*/
			
		}
		public void run()
		{//root.displayNode();
		//root=root.lChild;
		//root.displayNode();
			//recInorder(root);
			//recPreorder(root);
			recPostorder(root);
			//iterateInorder(root);
			//iteratePreorder(root);
			iteratePostorder(root);
		}
	}
	static class Stack
	{
		int max;
		Node[] data;
		int top;
		public Stack(int m)
		{
			max=m;
			data=new Node[max];
			top=-1;
		}
		public void push(Node j)
		{
			data[++top]=j;
		}
		public Node pop()
		{
			return (data[top--]);
		}
		public Node peek()
		{
			return (data[top]);
		}
		public boolean isEmpty()
		{
			return (top==-1);
		}
	}
	public static void main(String args[])
	{
		tree t=new tree();
		t.insertElement(10);
		t.insertElement(15);
		t.insertElement(7);
		t.insertElement(1);
		t.insertElement(8);
		t.run();
		
	}
}
