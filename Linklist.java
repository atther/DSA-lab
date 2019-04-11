import java.io.*;
class Node
{
 	int data;
	Node Next;
 	Node(int new_data)
 	{
  	data=new_data;
  	Next=null;
 	}
	public void DisplayNode()
	{
	 System.out.print(data+" ");
	}

}

class Linklist
{
 	Node First,Last;
 	Linklist()
 	{
 	First=null;
 	Last=null;
 	}
 
 /*-----------------------------------------------------------*/
     /*Insert First*/
 void Insert(int d)
 {
 	Node NewNode= new Node(d);
  	if(First==null)
  	{
  	 	First=NewNode;
  	 	Last=NewNode;
  	 	NewNode.Next=First;
  	 	return;
  	}
   else
   {
  	 NewNode.Next=Last.Next;
  	 Last.Next=NewNode;
  	 Last=NewNode;
   }
 }
 
public void selection()
{
	Node cur=First;
	do
	{
	 Node min = cur;
	 Node temp=cur;
	 do
	 {
	  if(temp.data<min.data)
	  {
	   min=temp;
	  }
	  
	  int tmp = min.data;
	  min.data=cur.data;
	  cur.data=tmp;
	  temp=temp.Next;
	 }while(temp!=First);
	 cur=cur.Next;
	 
	}while(cur!=First);
} 
 
 
 
 
 public void DisplayLink()
 {
 	Node temp=First;
 	do
 	{
 		temp.DisplayNode();
 		temp=temp.Next;
 	}while(temp!=First);
  System.out.println("\n ");
 }



public static void main(String args[])
 {
  Linklist obj =new Linklist();
  obj.Insert(4);
  obj.Insert(1);
  obj.Insert(7);
  obj.Insert(2);
  obj.DisplayLink();
  obj.selection();
  obj.DisplayLink();
}
}
