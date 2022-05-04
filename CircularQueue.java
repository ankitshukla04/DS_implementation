public class CircularQueue{
	int front;
	int rear;
	int size;
	int[] circularQueueArray;

	public CircularQueue(int size){
		front=rear=-1;
		this.size=size;
		circularQueueArray=new int[size];
	}

	public boolean underflow(){
		return (front==-1&&rear==-1);
	}

	public boolean overflow(){
		return (rear+1)%size==front;
	}

	public void enque(int ele){
		if(!overflow()){
			if(front==-1)// first element
				front++;
			rear=(rear+1)%size;
			circularQueueArray[rear]=ele;
		}
		else
			System.out.println("Queue is Overflow");
	}

	public int deque(){
		if(!underflow()){
			if(front==rear){
				int temp=front;
				front=rear=-1;
				return circularQueueArray[temp];
			}

			return circularQueueArray[(front+1)%size];

		}
		else
			System.out.println("Queue is underflow");
			return -1;
	}

	public void display(){
		if(!underflow()){
			int i;
			for(i=front;i!=rear;i=(i+1)%size)
				System.out.println(circularQueueArray[i]);
			System.out.println(circularQueueArray[i]);	//last element
		}
		else
			System.out.println("Queue is underflow");
	}

	public static void main(String[] args) {
		CircularQueue c1=new CircularQueue(5);
		c1.display();
	}
}