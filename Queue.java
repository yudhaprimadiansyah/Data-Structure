class Queue<T>{
    private Node<T>front;
    private Node<T>back;
    private int size = 0;

    public Queue(){
        this.front = null;
    }

    public void enqueue(T data){
        Node<T> new_node = new Node<T>(data);
        if(front == null) this.front = this.back = new_node;
        else {
            this.back.setNext(new_node);
            this.back = new_node;
        }
        this.size++;
    }

    public T peek(){
        if(this.front == null) return null;
        else {
            return this.front.getData();
        }
    }

    public T dequeue(){
        if(this.front == null) return null;
        else {
            T data = this.peek();
            Node temp = this.front;
            this.front = this.front.getNext();
            temp = null;
            return data;
        }
    }

}