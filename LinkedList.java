public class LinkedList<T>{
	
	private Node<T>head;
	private Node<T>tail;
	private int size = 0;

	public LinkedList(){
		this.head = this.tail = null;
	}

	void insertFirst(T data){
		Node<T> new_node = new Node<T>(data);
		if(this.head == null) this.head = this.tail = new_node;
		else {
			new_node.setNext(this.head);
			this.head.setPrev(new_node);
			this.head = new_node;
		}
	}
	
	void insertLast(T data){
		Node<T> new_node = new Node<T>(data);
		if(this.head == null) insertFirst(data);
		else {
			new_node.setPrev(this.tail);
			this.tail.setNext(new_node);
			this.tail = new_node;
		}
	}

	void deleteFirst(){
		if(this.head == null) System.out.println("Data Kosong");
		else {
			Node temp = this.head;
			this.head = temp.getNext();
			this.head.setPrev(null);
			temp = null;
		}
	}
	
	void deleteLast(){
		if(this.head == null) System.out.println("Data Kosong");
		else {
			Node temp = this.tail;
			this.tail = temp.getPrev();
			this.tail.setNext(null);
			temp = null;
		}
	}

	void showAll(){
		if(this.head == null) System.out.println("Data Kosong");
		else {
			Node temp = this.head;
			while(temp != null){
				System.out.println((String)temp.getData().toString());
				temp = temp.getNext();
			}
		}
	}

}
