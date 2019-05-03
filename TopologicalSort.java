class TopologicalSort<T>{

    LinkedList<NodeTopological> Vertex;

    public TopologicalSort(){
        this.Vertex = new LinkedList<NodeTopological>();
    }

    class NodeTopological<T>{
        Node edge;
        T edge;
    }
}