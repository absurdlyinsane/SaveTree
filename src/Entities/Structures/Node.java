package Entities.Structures;

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
