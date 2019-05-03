public class Node<T>{
	private T data;
	private Node n;
	private Node p;

	public Node(T data){
		this.data = data;
	}

	Node getNext(){
		return this.n;
	}

	void setNext(Node node){
		this.n = node;
	}

	Node getPrev(){
		return this.p;
	}

	void setPrev(Node node){
		this.p = node;
	}

	T getData(){
		return this.data;
	}

}
