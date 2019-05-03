class Stack<T>{
    private Node<T>top;
    private int size = 0;

    public Stack(){
        this.top = null;
    }

    public void push(T data){
        Node<T> new_node = new Node<T>(data);
        if(this.top == null) this.top = new_node;
        else {
            new_node.setNext(this.top);
            this.top = new_node;
        }
        this.size++;
    }

    public T pop(){
        if(this.top == null) return null;
        else {
            T data = peek();
            this.top = this.top.getNext();
            return data;
        }
    }

    public T peek(){
        if(this.top == null) return null;
        else {
            return this.top.getData();
        }
    }

    public void popAll(){
        if(this.top == null) System.out.println("Data Kosong");
        while(this.top != null){
            System.out.println(pop().toString());
        }
    }
}