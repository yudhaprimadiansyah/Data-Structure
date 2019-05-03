class BinarySearchTree<T>{
    private Comparable data;
    BinarySearchTree<T> left;
    BinarySearchTree<T> right;

    public BinarySearchTree(){
        this.data = null;
    }

    public BinarySearchTree(Comparable data){
        this.data = data;
    }

    public void add(Comparable data){
        if(this.data == null)this.data = data;
        else {
            if(data.compareTo(this.data) < 0){
                if(this.left == null) this.left = new BinarySearchTree<T>(data);
                else left.add(data);
            }
            else {
                if(this.right == null) this.right = new BinarySearchTree<T>(data);
                else right.add(data);
            }
        }
        
    }

    public boolean contains(Comparable data){
        if(this.data == null) return false;
        if(this.data.equals(data))return true;
        if(this.data.compareTo(data) < 0)return left.contains(data);
        else return right.contains(data);
    }

    public void preOrder(){
        System.out.print(this.data.toString()+", ");
        if(this.left != null) left.preOrder();
        if(this.right != null) right.preOrder();
        
    }

    public void inOrder(){
        if(this.left != null) left.inOrder();
        System.out.print(this.data.toString()+", ");
        if(this.right != null) right.inOrder();
        
    }

    public void postOrder(){
        if(this.left != null) left.postOrder();
        if(this.right != null) right.postOrder();
        System.out.print(this.data.toString()+", ");
    }

    

}
