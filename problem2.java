
public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data myQ=new Data();
		
		myQ.add(1);
		myQ.add(9);
		myQ.add(4);
		myQ.add(5);
		myQ.add(10);
		myQ.add(0);
		myQ.printQ();
	}

}

class Data{	//queue class
	int[] queue;
	int size;
	int capacity=10;
	int numRemoved;
	
	void Data(){
		//this.capacity=10;
		this.queue= new int[capacity];
		this.size=0;
		this.numRemoved=0;
	}
	
	void doubleQueue(){
		capacity=capacity*2;
		int[] doubledQ= new int[capacity];
		for(int i=0; i<capacity; i++){
			doubledQ[i]=queue[i];
		}
		queue=doubledQ;
	}
	
	void printQ(){
		for(int i=0; i<size; i++){
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
	
	void add(int a){
		//System.out.println(size);
		//System.out.println(capacity);
		if(size==capacity){
			System.out.println("doubling");
			doubleQueue();
		}
		queue[size]=a;
		size++;
	}
	
	int remove(){
		int ret=queue[numRemoved];
		queue[numRemoved]=0;
		numRemoved++;
		return ret;
	}
	
	int getValue(int index){
		if (index > size-1){
			return -1;
		}
		return queue[index];
	}
}


