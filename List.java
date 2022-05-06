class List{

	private Node head;
	class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			next=null;
		}
	}

	public void insertAtBegining(int ele){
		if(head!=null){
			Node newNode=new Node(ele);
			newNode.next=head;	// assigning previous head pointer to new node
			head=newNode;	// now head is pointing to new node
		}
		else{
			Node newNode=new Node(ele);
			head=newNode;
		}

	}

	public void insertAtEnding(int ele){
		if(head!=null){
			Node curr=head;
			while(curr.next!=null){
				curr=curr.next;
			}
			Node newNode=new Node(ele);
			curr.next=newNode;
		}
		else{
			Node newNode=new Node(ele);
			head=newNode;
		}
	}

	public void insertAfter(int ele, int aele){
		if(head!=null){
			Node curr=head;	//iterator
			while(curr!=null&&curr.data!=aele)
				curr=curr.next;
			//condition when element found and not end of the list
			if(curr!=null){
				Node newNode=new Node(ele);
				newNode.next=curr.next;
				curr.next=newNode;
			}
			else
				System.out.println("Element not found.");
		}
		else
			System.out.println("List is empty.");
	}

	public void insertBefore(int ele, int bele){
		if(head!=null){
			if(head.data==bele){
				Node newNode=new Node(ele);
				newNode.next=head;
				head=newNode;
			}
			else{
				Node curr=head;
				while(curr.next!=null&&curr.next.data!=bele)
					curr=curr.next;
				//there is ele after after desired node
				if(curr.next!=null){
					Node newNode=new Node(ele);
					newNode.next=curr.next;
					curr.next=newNode;
				}
				else
					System.out.println("Element not found.");
			}
		}
		else{
			System.out.println("List is empty");
		}
	}

	public int deleteFirst(){
		if(head!=null){
			int temp=head.data;
			head=head.next;
			return temp;
		}
		System.out.println("List is empty");
		return -1;
	}

	public int deleteLast(){
		if(head!=null){
			// only one element in list
			if(head.next==null){
				head=null;
			}
			else{
				Node curr=head;
				while(curr.next.next!=null)
					curr=curr.next;
				int temp=curr.next.data;
				curr.next=null;
				return temp;
			}
		}
		System.out.println("List is empty");
		return -1;
	}

	public int deleteSpecific(int ele){
		if(head!=null){
			Node curr=head;
			if(curr.next==null){
				if(curr.data==ele){
					head=null;
					return	curr.data;
				}
				System.out.println("List is empty");
				return -1;
			}
			else{
				while(curr.next.next!=null&&curr.next.data!=ele)
					curr=curr.next;
				if(curr.next!=null){
					int temp=curr.next.data;
					curr.next=curr.next.next;
					return temp;
				}
				System.out.println("Element not found");
				return -1;	
			}
		}
		System.out.println("List is empty");
		return -1;
	}

	public void display(){
		if(head!=null){
			Node curr=head;
			while(curr!=null){
				System.out.print(curr.data+" ");
				curr=curr.next;
			}
			System.out.println();
		}
		else
			System.out.println("List is empty.");
		
	}

	public void displayReverse(){
		if(head!=null){
			Node curr=head;

		}
		else
			System.out.println("List is empty.");
	}

	public int getSize(){
		if(head!=null){
			Node curr=head;
			int size=0;
			while(curr!=null){
				size++;
				curr=curr.next;
			}
			return size;
		}
		System.out.println("List is empty");
		return -1;
	}

	public boolean searchElement(int ele){
		if(head!=null){
			Node curr=head;
			while(curr!=null&&curr.data!=ele)
				curr=curr.next;
			if(curr!=null)
				return true;
			else
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		List l1=new List();
	
		List.Node first=l1.new Node(10);	// new node has data 10 and null
		List.Node second=l1.new Node(11);	
		List.Node third=l1.new Node(12);

		l1.head=first;				//reference of first node is in head now.
		first.next=second;
		second.next=third;

		System.out.println("List at Starting.");
		l1.display();
		System.out.println("List after adding 9 at begining.");
		l1.insertAtBegining(9);
		l1.display();
		System.out.println("List after adding 13 at ending.");
		l1.insertAtEnding(13);
		l1.display();
		System.out.println("List after adding 10 after 9.");
		l1.insertAfter(10,9);
		l1.display();
		System.out.println("List after adding 11 before 10.");
		l1.insertBefore(11,10);
		l1.display();
		System.out.println("List after deleting first node.");
		int temp=l1.deleteFirst();
		l1.display();
		System.out.println("deleted element: "+temp);
		System.out.println("List after deleting last node.");
		temp=l1.deleteLast();
		l1.display();
		System.out.println("deleted element: "+temp);
		System.out.println("Size of the list is: "+l1.getSize());

		System.out.println("List after deleting 10");
		temp=l1.deleteSpecific(10);
		l1.display();
		System.out.println("deleted element: "+temp);
		System.out.println("Size of the list is: "+l1.getSize());

		temp=5;
		if(l1.searchElement(temp))
			System.out.println("Element "+temp+" is present.");
		else
			System.out.println("Element "+temp+" is not present.");

		temp=10;
		if(l1.searchElement(temp))
			System.out.println("Element "+temp+"is present.");
		else
			System.out.println("Element "+temp+"is not present.");
	}
}