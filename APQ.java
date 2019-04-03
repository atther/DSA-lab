import java.io.*;
class APQ
{
 int nItems,maxSize,array[];
	 static int t;
	APQ(int size)
	{
		array=new int[size];
		maxSize=size;
		nItems=0;
	}
	
	//-------------------------------------------------------------
	//insertion
	void Insert(int d)
	{
		int i=0;
		if(nItems==0)
		 array[nItems++]=d;
		 else
		 for(i=nItems-1;i>=0;i--)
		 {
		 if(d>array[i])
		 {array[i+1]=array[i];}
		  else 
		  break;
		 }
		array[i+1]=d;
		nItems++;
	}
	
	public boolean isEmpty()
		{ return (nItems==0); }
	
	public int remove()
		{ return array[--nItems]; }
	public static void main(String[] args) throws IOException
	{
		APQ obj = new APQ(10);
		obj.Insert(30);
		obj.Insert(50);
		obj.Insert(10);
		obj.Insert(40);
		obj.Insert(20);
		while( !obj.isEmpty() )
		{
			int item = obj.remove();
			System.out.print(item + "  "); 
		}
		System.out.println("");
	}
}
