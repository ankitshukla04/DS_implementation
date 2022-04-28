import java.util.Scanner;
class Stack{
	int tos;
	char[] stackArray;
	int stackSize;

	public Stack(int stackSize){
		this.stackSize=stackSize;
		stackArray=new char[stackSize];
		tos=-1;
	}

	public boolean isFull(){
		return (tos==stackSize-1);
	}

	public boolean isEmpty(){
		return (tos==-1);
	}

	public void push(char element){
		if(!isFull())
			stackArray[++tos]=element;
		else
			System.out.println("Stack is full.");
	}

	public char pop(){
		if(!isEmpty())
			return (stackArray[tos--]);
		System.out.println("Stack is Empty.");
		return 'a';
	}

	public void displayStack(){
		if(!isEmpty())
			for(char ch: stackArray)
				System.out.println(ch);
		else
			System.out.println("Stack is Empty.");
	}

	public char peek(){
		if(!isEmpty())
			return (stackArray[tos]);
		System.out.println("Stack is Empty.");
		return '*';
	}
}
public class ParenthesisBalance{
	public static void main(String[] args) {

		Stack s1=new Stack(5);//for only 5 symbols
		int flag=0;
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		//input length
		int n=input.length();
		int i;
		for(i=0;i<n;i++){

			char ch=input.charAt(i);
			switch(ch){
			case '(':
			case '{':
			case '[':
					 System.out.println("Pushed element is:"+ch);
					 s1.push(ch);
					 break;
			case ')': 
			case '}':
			case ']':
					char peek=s1.peek();
					if((ch==')'&&peek=='(')||(ch=='}'&&peek=='{')||(ch==']'&&peek=='['))
						System.out.println("popped element is "+s1.pop());
					else
						flag=1;	
			}
		}
		if(i==n&&s1.isEmpty())
			System.out.println("statement balanced.");
		else
			System.out.println("statement is not balanced.");
	}
}