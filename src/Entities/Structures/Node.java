package Entities.Structures;

import Entities.Save;

public class Node{
    private Save value;
    private Node parent;
    private int numofChildren;
    private Node[] children;

    public Node(Save value,int numofChildren){
        this.value = value;
        this.numofChildren = numofChildren;
        this.parent = null;
        this.children = null;
    }

    public Node(Save value,int numofChildren,Node parent){
        this.value = value;
        this.numofChildren = numofChildren;
        this.parent = parent;
        this.children = null;
    }

    public void setValue(Save value){ this.value = value; }

    public void setParent(Node parent){ this.parent = parent; }

    public void setNumofChildren(int numofChildren) { this.numofChildren = numofChildren; }
    
    public void setChildren(Node[] children){ this.children = children; }

    public Save getValue(){ return value; }

    public int getNumofChildren() { return numofChildren; }

    public Node getParent(){ return parent; }

    public Node[] getChildren(){ return children; }
};
