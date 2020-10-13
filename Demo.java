/*
SinglyLinkedList creation in java
*/

import java.lang.*;
import java.util.*;



class Node
{
	public int data;
	public Node next;

	public Node(int value)
	{
		data = value;
		next = null;
	}
}

class SinglyLinkedList
{
	public Node Head;
			
	public SinglyLinkedList()
	{
		Head = null;
	}

	public void InsertFirst(int no)
	{
		Node newn = new Node(no);     // new statment
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			newn.next = Head;
			Head = newn;
		}

	}

		public void InsertLast(int no)
	{
		Node newn = new Node(no);     // new statment
	
		//C      PNODE newn = (PNODE)malloc(sizeof(Node));
		//C++ 	 PNODE newn = newn Node();
		//JAVA   Node newn = new Node(no);
		
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			Node temp = Head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			newn.next = Head;
			Head = newn;
		}

	}


		public void InsertAtPos(int pos, int data)
		{
			int size = 0;
			size = count();

			if((pos <= 0) || (pos > size+1))
			{
				return;
			 }

			if(pos ==1)
			{
				InsertFirst(data);
			}
			else if(pos == size+1)
			{
				InsertLast(data);
			}
			else
			{
				Node newn = new Node(data);
				Node temp = Head;
				int i =0;
				for( i= 1; i < pos-1; i++)
				{
					temp = temp.next;
				}
				newn.next=temp.next;
				temp.next = newn;
			}
			
		}


		
	public void DeleteFirst()
	{
		if(Head == null)
		{
			return;
		}
		else
		{
			Head = Head.next;
		}
	}

	public void DeleteLast()
	{
		if(Head == null)
		{
			return;
		}
		else
		{
			if(Head.next == null)
			{
				Head= null;
				return;
			}
			Node temp = Head;
			
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	
	
		public void DeleteAtPos(int pos)
		{
			int size = 0;
			size = count();

			if((pos <= 0) || (pos > size+1))
			{
				return;
			 }

			if(pos ==1)
			{
				DeleteFirst();
			}
			else if(pos == (size))
			{
				DeleteLast();
			}
			else
			{
				Node temp = Head;
				int i =0;
				for( i= 1; i < pos-1; i++)
				{
					temp = temp.next;
				}
				temp.next = temp.next.next;

			}
			
		}

		

		public void Display()
		{
			Node temp = Head;
			
			System.out.println("Elements of linked list");
			while(temp != null)
			{
				System.out.print("|"+ temp.data+"|");
				temp = temp.next;
			}
			System.out.println();
		}

	public int count()
	{
		int iCnt = 0;
		Node temp = Head;
		
		while(temp != null)
		{
			iCnt ++;
			temp = temp.next;
		}
		return iCnt;
	}
}

class Demo
{
	public static void main(String args[])
	{
		System.out.println("Hello");
		
		Scanner sobj = new Scanner(System.in);
		int choice = 1, iRet =0, value =0,Pos=0;

		SinglyLinkedList obj = new SinglyLinkedList();
		
		while(choice != 0)
		{
			System.out.println("____________________");
			System.out.println("Enter Your Choice");
			System.out.println("____________________");
			System.out.println("1: Insert First");
			System.out.println("2 : Insert Last");
			System.out.println("3 : Insert At Position");			
			System.out.println("4: Delete First");
			System.out.println("5: Delete Last");
			System.out.println("6 : Delete At Position");
			System.out.println("7.Display");
			System.out.println("8: Count");
			
			System.out.println("0:Exit");
			System.out.println("____________________");
		
			choice  =sobj.nextInt();
		
			switch(choice)
			{
				case 1 :
					System.out.println("Enter Your vlaue");
					value = sobj.nextInt();
					obj.InsertFirst(value);
					break;
				case 2 :
					System.out.println("Enter Your vlaue");
					value = sobj.nextInt();
					obj.InsertLast(value);
					break;
				case 3 :
					System.out.println("Enter the value");
					value = sobj.nextInt();					
					System.out.println("Enter the position");
					Pos = sobj.nextInt();
					obj.InsertAtPos(Pos,value);
					break;
				case 4 :
					obj.DeleteFirst();
					break;
				case 5 :
					obj.DeleteLast();
					break;
				case 6 :					
					System.out.println("Enter the position");
					Pos = sobj.nextInt();
					obj.DeleteAtPos(Pos);
					break;

				case 7 :
					obj.Display();
					break;
				case 8 :
					System.out.println("Total number of elements : "+ obj.count());
					break;
				

				


				
			}
		
		}		

		System.out.println("Thank u for using marvellous Linked List");
		obj.Head = null;

		
		

	}	
}














