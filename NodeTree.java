class NodeTree<T>{
    private T data;
    private Node left;
    private Node right;

    public NodeTree(T data){
        this.data = data;
        this.left = this.right = null;
    }

    public NodeTree getLeft(){
        return this.left;
    }

    public NodeTree getRight(){
        return this.right;
    }

    public T getData(){
        return this.data;
    }

    public void setLeft(NodeTree l){
        this.left = l;
    }

    public void setLeft(NodeTree r){
        this.right = r;
    }
}