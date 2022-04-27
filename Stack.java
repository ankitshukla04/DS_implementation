public class Stack{
	int size;
	int tos;
	int[] stackArray;

	//creating stack using constructor
	public Stack(int size){
		this.size=size;
		stackArray=new int[size];
		tos=-1;
	}
	//public methods

	public boolean isEmpty(){
		return (tos==-1);
	}

	public boolean isFull(){
		return (tos==size-1);
	}

	public void push(int element){
		if(!isFull())
			stackArray[++tos]=element;
		else
			System.out.println("Stack is Full.");
	}

	public int pop(){
		if(!isEmpty())
			return stackArray[tos--	];
		System.out.println("Stack is empty.");
		return -1; 	//coz function returning int
		
	}

	public void displayStack(){
		if(!isEmpty()){
			for(int x:stackArray)
				System.out.println(x);
		}
		else
			System.out.println("Stack is empty.");
	}

	public int peek(){
		if(!isEmpty())
			return stackArray[tos];
		System.out.println("Stack is empty.");
		return -1;
	}
	public static void main(String[] args) {
		Stack s1=new Stack(5);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);

		System.out.println("Stack is Full condition.");
		s1.push(5);	// to check full condition

		System.out.println("Displaying Stack");
		s1.displayStack();
		s1.peek();

		System.out.println("Displaying Pop Stack");
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop()); // to check empty condition

	}
}
	
