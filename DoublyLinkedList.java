public class DoublyLinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data){
			this.data=data;
			next=null;
			prev=null;
		}
	}

	public void insertBegining(int ele){
		Node newNode=new Node(ele);
		if(head!=null){
			head.next.prev=newNode;
			newNode.next=head;
			head=newNode;
		}
		else
			head=newNode;
	}

	public void insertEnding(int ele){
		if(head!=null){
			Node newNode=new Node(ele);
			Node curr=head;
			while(curr.next!=null)
				curr=curr.next;
			curr.next=newNode;
			newNode.prev=curr.next;
		}
		else{
			Node newNode=new Node(ele);
			head=newNode;
		}
	}

	public void insertAfter(int ele, int aele){
		if(head!=null){
			Node curr=head;
			while(curr!=null&&curr.data!=aele)
				curr=curr.next;
			if(curr!=null){
				Node newNode=new Node(ele);
				newNode.prev=curr;
				newNode.next=curr.next;
				if(curr.next!=null)
					curr.next.prev=newNode;
				curr.next=newNode;
			}	
		}
		else
			System.out.println("List is empty.");
	}

	public void insertBefore(int ele, int bele){
		if(head!=null){
			Node curr=head;
			while(curr!=null&&curr.data!=bele)
				curr=curr.next;
			if(curr.next!=null){
				Node newNode=new Node(ele);

				if(curr.prev!=null){
					newNode.next=curr;
					newNode.prev=curr.prev;
					curr.prev.next=newNode;
					curr.prev=newNode;
				}
				else{
					newNode.next=curr;
					curr.prev=newNode;
					head=newNode;
				}

			}	
		}
		else
			System.out.println("List is empty.");
	}

	public int size(){
		Node curr=head;
		int size=0;
		while(curr!=null){
			size++;
			curr=curr.next;
		}
		return size;
	}

	public void travelForward(){
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

	public static void main(String[] args) {
		DoublyLinkedList l1=new DoublyLinkedList();

		l1.insertBegining(10);
		l1.insertEnding(20);
		l1.insertAfter(15,10);
		l1.insertAfter(25,20);
		l1.insertBefore(5,10);
		l1.insertBefore(18,20);
		l1.travelForward();
		System.out.println("size of list is "+l1.size());
	}
}