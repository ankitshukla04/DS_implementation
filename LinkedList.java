class LinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			next=null;
		}
	}

	public void display(){
		//creating another reference so that we won't move head
		Node curr=head;
		while(curr!=null){
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.head=new Node(11);
		Node second=new Node(22);
		Node third=new Node(33);

		l1.head.next=second;
		second.next=third;
		third.next=null;

		l1.display();

	}
}