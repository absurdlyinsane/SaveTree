package Entities.Structures;

import java.util.List;
import Entities.Save;

public class Tree{
    private final Node root;

    public Tree(Node root){
        this.root = root;
    }

    public Node getRoot(){ return root; }

    public Node searchTraverseBFS(String value){
        if(root == null){
            IO.println("Value not found. There is no root.");
            return null;
        }

        CQueue tQueue = new CQueue(256);   // some capacity; see note below
        tQueue.enQ(root);

        while(!tQueue.isEmpty()){
            Node current = tQueue.deQ();

            if(current.getValue().index().equals(value)){
                return current;
            }

            for(Node child : current.getChildren()){
                tQueue.enQ(child);
            }
        }

        IO.println("Value not found.");
        return null;
    }

    public void printTree(){
        if (root == null) {
            IO.println("Value not found. There is not root.");
        }
        
        // TO BE IMPLEMENTED.
    }
}
