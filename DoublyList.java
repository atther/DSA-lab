// 2 directions
// 2 references


import java.io.*;
class Node
{
 	int Data;
	Node Next,Prev;
 	Node(int new_data)
 	{
  	Data=new_data;
  	Next=null;
  	Prev=null;
 	}
}
class DoublyList
{
 	Node First,Last;
 	DoublyList()
 	{
 	First=null;
 	Last=null;
 	}
 	void insert(int d)
 	{
 	 Node NewNode=new Node(d);
 	 if(First==null)
 	 {
 	 First=NewNode;
 	 Last=NewNode; 
 	 }
 	 else
 	 {
 	  
 	  while(Last.Next!=null)
 	  {
 	   Last=Last.Next;
 	  }
 	  Last.Next=NewNode;
 	  Last.Next.Prev=Last;
 	  Last=NewNode;
 	 }
 	 
 	 }
 	 //-----------------------------------------------------------------
 	// Insert First
 	 void InsertFirst(int d)
 	 {
 	  Node NewNode = new Node(d);
 	  NewNode.Next=First;
 	  First.Prev=NewNode;
 	  First=NewNode;
 	 
 	 }
 	 //-----------------------------------------------------------------
 	 //Insert Last
 	 void InsertLast(int d)
 	 {
 	  Node NewNode = new Node(d);
 	  NewNode.Prev=Last;
 	  Last.Next=NewNode;
 	  Last=NewNode;
 	 }
 	 //-------------------------------------------------------------------
 	 //Insert After
 	 void InsertAfter(int key,int d)
 	 {
 	  Node NewNode= new Node(d);
 	  Node Temp= First;
 	  while(Temp.Next!=null)
 	  {
 	   if(Temp.Data==key)
 	    {
 	    NewNode.Prev=Temp;
 	    NewNode.Next=Temp.Next;
 	    Temp.Next.Prev=NewNode;
 	    Temp.Next=NewNode;
 	    return;
 	    }
 	    else
 	    Temp=Temp.Next;
 	  }
 	 }
 	 //-------------------------------------------------------------------
 	 //Delete First
 	 int DeleteFirst()
 	 {
 	  int Temp=First.Data;
 	  First=First.Next;
 	  First.Prev=null;
 	  return Temp;
 	 }
 	 //-------------------------------------------------------------------
 	 //Delete Last
 	 int DeleteLast()
 	 {
 	  int Temp= Last.Data;
 	  Last=Last.Prev;
 	  Last.Next=null;
 	  return Temp;
 	 }
 	 //------------------------------------------------------------------
 	 //Delete Key
 	 int DeleteKey(int key)
 	 {
 	 int temp;
 	 Node Temp=First;
 	 while(Temp.Next!=null)
 	 {
 	  if(Temp.Data==key)
 	  {
 	   Temp.Prev.Next=Temp.Next;
 	   Temp.Next.Prev=Temp.Prev;
 	   
 	  }
 	  else
 	  {Temp=Temp.Next;}
 	  }
 	   return Temp.Data;
 	 }
 	 
	public void printList() 
	{ 
		Node tnode = Last; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.Data+" "); 
			tnode = tnode.Prev; 
		} 
	}

public static void main(String args[])throws IOException
{ char ch;
do
{
 DoublyList obj = new DoublyList();
 obj.insert(0);
 obj.insert(1);
 obj.insert(2);
 obj.insert(3);
 obj.InsertFirst(-1);
 obj.InsertLast(5);
 obj.InsertAfter(3,4);
  obj.printList();
 int t=obj.DeleteFirst();
 System.out.println("\n\n\nFirst Deleted Element :"+t);
 int p=obj.DeleteLast();
 System.out.println("Last Deleted Element :"+p);
 int q=obj.DeleteKey(4);
  
  System.out.println("key Deleted Element :"+q);
 obj.printList();
 System.out.println("\nDo you want to continue?(y/n)");
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 String S =br.readLine();
 ch=S.charAt(0);
 }while(ch=='y'||ch=='Y');
 }
}
