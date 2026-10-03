package Entities;

import Entities.Structures.*;

public class Playthrough{
    private int index;
    private String name;
    private Tree saveTree;

    public Playthrough(int index,String name,Tree saveTree){
        this.index = index;
        this.name = name;
        this.saveTree = saveTree;
    }

    public void setName(String name){ this.name = name; }

    public int getIndex(){ return index; }

    public String getName(){ return name; }

    public Tree getSaveTree(){ return saveTree; }
}
