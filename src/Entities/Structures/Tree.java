package Entities.Structures;

public class Tree{
    private Node root;

    public Tree(Node root){
        this.root = root;
    }

    public Node getRoot(){ return root; }

    public Node searchTravarseBFS(int value){
        if (root == null) {
            IO.println("Value not found. There is not root.");
            return null;
        }
        
        Node result = null;
        Node current = null;
        CQueue tQueue = null;
        CQueue pQueue = null;

        tQueue.enQ(root);

        while(!tQueue.isEmpty()){
            current = tQueue.getFrontNode();
            if(current.getValue() == value){
                result = current;
                break;
            } else{
                tQueue.deQ();
                for(int i=0;i<current.getNumofChildren();i++){
                    Node[] temp = current.getChildren();
                    tQueue.enQ(temp[i]);
                }
                pQueue.enQ(current);
            }
        }

        IO.println("Value not found.");
        return result;
    }
}
