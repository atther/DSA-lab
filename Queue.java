import java.io.*;
class Queue
{
	 int rear,front,maxSize,array[],item,temp;
	 static int t;
	Queue(int size)
	{
		array=new int[size];
		maxSize=size;
		front=0;
		rear=-1;
	}
	
	
	 boolean isEmpty()
	{
	 if((rear+1)%maxSize==front)
	  {return true;}
	  else
	  {return false;}
	}
	
	
	 boolean isFull()
	{
	 if((rear+2)%maxSize==front)
		{return true;}
	else
		{return false;}
	}
	
	
	void Enqueue(int d)
	{
	 if(isEmpty())
	 rear++;
	 else if(isFull())
	 {
	 System.out.println("Queue is Full!");
	 return;
	 }
	 else
	 {
	 rear=(rear+1)%maxSize;}
	 array[rear]=d;
	 System.out.println(d+ " enqueued to queue"); 
	}
	
	
	void Dequeue()
	{
	if(isEmpty()){
		System.out.println("Queue is Empty!");
		return ;
		}
	else{
		item=array[front];
		if(front==rear){
			rear=-1;
			front=0;
			}
		else{
    		front=(front+1)%maxSize;
    		}
			System.out.println(item+" dequeued from queue\n");
		}
	}
	int QueueSize()
	{
	 if(rear>=front)
	  {temp=rear-front+1;
	  return temp;}
	  else
	  {temp=((maxSize-front)+ (rear +1));
	  return temp;}
	}
	void Display()
	{
	 System.out.print("Queue is :");
	 int t= QueueSize();
	 for(int i=front;i<rear+1;i++)
	 System.out.print(array[i]+" ");
	 System.out.println();
	}
	
	
	
public static void main(String args[])throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter the Queue Size : ");
  int size = Integer.parseInt(br.readLine());
  Queue obj = new Queue(size);
  
int choice;

	do
	{
  	System.out.print("\n\n1.Enqueue\n2.Dequeue\n3.Display\n4.No. of Elements in Queue \n0.Exit\nEnter your Choice : ");
  	
  	char ch='b';
  	String s;
  	choice = Integer.parseInt(br.readLine());
  	switch(choice)
  	{
  		case 1 :
  				System.out.println("Enter the Elements!\nIf you want to stop entering then press (y/Y)");
  				while(true)
  				{   
  					s=br.readLine();
  					ch =s.charAt(0);
  					if(ch=='y'||ch=='Y')
  						break;
  					else
  					{
  					int element = Integer.parseInt(s);
					obj.Enqueue(element);
					//System.out.print("Do you want to add more Elements?(y/n)");
				    }
				 }
				
				 break;
  		case 2 :
  				System.out.print("Press d/D for Dequeing elements! ");
  				while(true)
  				{   
  					s=br.readLine();
  					ch =s.charAt(0);
  					if(ch=='d'||ch=='D')
  						//System.out.println(obj.Dequeue() +" dequeued from queue\n");
  						obj.Dequeue();
  					else
  					{
  					break;
				    }		
  				}
  				break;
  		case 3:
  				obj.Display();
  				break;
  		case 4:
  				int t = obj.QueueSize();
  				System.out.println("Number of Elements in Queue is : "+t);
  				break;
  		default: 
  					System.out.println("Exited!\n");
  				
  	}
  	
  }while(choice!=0);
 }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	public static void 	main(String args[]) 
	{
		
		
		obj.Enqueue(2);
		obj.Enqueue(3);
		obj.Enqueue(4);
		obj.Enqueue(5);
		obj.Enqueue(6);
		obj.Enqueue(7);
		obj.Enqueue(8);
		obj.Enqueue(9);
		obj.Enqueue(10);
		t=obj.QueueSize();
		obj.Display();
		obj.Enqueue(11);
		 
		obj.Enqueue(12);
		obj.Enqueue(13);
		;
		System.out.println("Rear : "+obj.rear+" Front : "+obj.front+" MaxSize : "+obj.maxSize);
		t=obj.QueueSize();
		System.out.println(t);
		obj.Display();
		
	}
} */
