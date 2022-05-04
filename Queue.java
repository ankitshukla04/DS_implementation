public class Queue{
	int front;
	int rear;
	int size;
	int[] queueArray;

	public Queue(int size){
		front=rear=-1;
		this.size=size;
		queueArray=new int[size];
	}

	public boolean underflow(){
		return (front==-1&&rear==-1);
	}

	public boolean overflow(){
		return (rear==size-1);
	}

	public void enque(int ele){
		if(!overflow()){
			if(front==-1)	//for first enque element
				front++;
			queueArray[++rear]=ele;
		}
		else
			System.out.println("Queue is Overflow");
	}

	public int deque(){
		if(!underflow()){
			if(front==rear){	//for last deque element
				int temp=front;
				front=rear=-1;
				return queueArray[temp];
			}	
				
			return queueArray[front++];
		}
		System.out.println("Queue is underflow");
		return -1;

	}

	public void display(){
		if(!underflow()){
			for(int i=front; i<=rear; i++)
				System.out.println(queueArray[i]);
		}
		else
			System.out.println("Queue is underflow");
	}

	public static void main(String[] args) {
		Queue q1=new Queue(5);
		q1.display();	// it will print underflow.
		q1.enque(1);
		q1.enque(2);
		q1.enque(3);
		q1.enque(4);
		q1.enque(5);
		q1.enque(6);//	it will print overflow;
		q1.display();	// print queue
		q1.deque();
		q1.deque();
		q1.deque();
		q1.deque();
		q1.deque();
		q1.deque();	// it will print overflow;

	}
}