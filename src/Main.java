public class Node{
    private int value;
    private Node parent;
    private Node[] children;

    public Node(int value){
        this.value = value;
        this.parent = null;
        this.children = null;
    }

    public Node(int value,Node parent){
        this.value = value;
        this.parent = parent;
        this.children = null;
    }

    public void setValue(int value){ this.value = value; }

    public void setParent(Node parent){ this.parent = parent; }
    
    public void setChildren(Node[] children){ this.children = children; }

    public int getValue(){ return value; }

    public Node getParent(){ return parent; }

    public Node[] getChildren(){ return children; }
};

public class Queue{
    int capacity;
    int size;
    Node[] mainQ;
    Node front;
    Node rear;

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public Node[] getMainQ() {
        return mainQ;
    }

    public Node getFront() {
        return front;
    }

    public Node getRear() {
        return rear;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setMainQ(Node[] mainQ) {
        this.mainQ = mainQ;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    boolean isEmpty(){}

    boolean isFull(){}

    void enqueue(Node newNode){}

    void dequeue(){}
};

public class Tree{
    private Node root;

    public Tree(Node root){
        this.root = root;
    }

    public void setRoot(Node root){ this.root = root; }

    public Node getRoot(){ return root; }

    // public Node searchTravarse(){
    //     Node result;
    //     int[] queue;
    //     int[] visited;

    //     whileif(!(queue == null)){
            
    //     }

    //     return result;
    // }
}

void main(){
    IO.print("Enter --> ");
    String in;
    in = IO.readln();
    IO.println(in);
}
