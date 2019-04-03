 import java.io.*;

class Node
{
 	int exp,coef;
	Node Next;
 	Node(int c,int e)
 	{
  	exp=e;
  	coef=c;
  	Next=null;
 	}
}
class Polynomial
{
 	Node First;
 	Polynomial()
 	{
 	First=null;
 	}
 
 /*-----------------------------------------------------------*/
     /*Insert First*/
 void Insert(int c, int e)
 {
 	Node NewNode= new Node(c,e);
  	if(First==null)
  	{
  	 	First=NewNode;
  	 	return;
  	}
  	Node Trev =First;
  	while(Trev.Next!=null)
  	{
  	 Trev=Trev.Next;
  	}
  	Trev.Next=NewNode;	
  }
 
 
 
 public void input()throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the Degree of Polynomial!");
  int degree = Integer.parseInt(br.readLine());
  for(int i=degree;i>=0;i--)
  {
   System.out.print("Enter Coefficient of variable of degree "+i+" :");
   Insert(Integer.parseInt(br.readLine()),i);
  }
 }
 
 
 
  public void Evaluate()
  {
    int c,e;
     Node Temp1=p1.First;
     Node Temp2=p2.First;
    while(Temp1!=null&&Temp2!=null)
     {
       if(Temp1.exp==Temp2.exp)
       {
         c=Temp1.coef+Temp2.coef;
         e=Temp1.exp;
         Temp1=Temp1.Next;
         Temp2=Temp2.Next;
       }
       else if(Temp1.exp>Temp2.exp)
       {
         c=Temp1.coef;
         e=Temp1.exp;
         Temp1=Temp1.Next;
       }
       else
       {
         c=Temp2.coef;
         e=Temp2.exp;
         Temp2=Temp2.Next;
       }
       res.Insert(c,e);
     }
    /* while(Temp1!=null)
     {
       c=Temp1.coef;
       e=Temp1.exp;
       Temp1=Temp1.Next;
       res	.insert(x,y);
     }
     while(Temp2!=null)
     {
       c=Temp2.coef;
       e=Temp2.exp;
       Temp2=Temp2.Next;
       l1.insertLast(x,y);
     }*/
   }
        
   
   
   
   public void printList() 
	{ 
		Node TempNode = First; 
		while (TempNode != null) 
		{   if(TempNode.Next != null)
				{System.out.print(TempNode.coef+"x^"+TempNode.exp+"+");}
			else
				{System.out.print(TempNode.coef);}
		 TempNode = TempNode.Next; 
		} 
	}
	
 static Polynomial p1 =new Polynomial();
 static Polynomial p2 =new Polynomial();
 static Polynomial res=new Polynomial();
public static void main(String args[])throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the first Polynomial!");
  p1.input();
  System.out.println("Enter the second  Polynomial!");
  p2.input();
  res.Evaluate();
  System.out.println("First Polynomial is ");
  p1.printList();
  System.out.println("\nSecond Polynomial is ");
  p2.printList();
  System.out.println("\nResulting Polynomial is ");
  res.printList();
  System.out.println("\n");
 }
}
