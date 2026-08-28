package Entities.Structures;

public class Tree{
    private Node root;

    public Tree(Node root){
        this.root = root;
    }

    public Node getRoot(){ return root; }

    public Node searchTraverseBFS(int value){
        if (root == null) {
            IO.println("Value not found. There is not root.");
            return null;
        }
        
        Node current = null;
        CQueue tQueue = new CQueue();

        tQueue.enQ(root);

        while(!tQueue.isEmpty()){
            current = tQueue.getFrontNode();
            if(current.getValue() == value){
                return current;
            }

            tQueue.deQ();
            Node[] temp = current.getChildren();
            for(int i=0;i<current.getNumofChildren();i++){
                tQueue.enQ(temp[i]);
            }
        }

        IO.println("Value not found.");
        return null;
    }
}
