package Entities.Structures;

import java.util.List;
import Entities.Save;

public class Node{
    private Save value;
    private Node parent;
    private List<Node> children;

    public Node(Save value){
        this.value = value;
        this.parent = null;
        this.children = null;
    }

    public Node(Save value,Node parent){
        this.value = value;
        this.parent = parent;
        this.children = null;
    }

    public void setValue(Save value){ this.value = value; }

    public void setParent(Node parent){ this.parent = parent; }
    
    public void addChild(Node child){ children.add(child); }

    public Save getValue(){ return value; }

    public Node getParent(){ return parent; }

    public List<Node> getChildren(){ return children; }
};
