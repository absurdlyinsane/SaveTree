package Entities;

public class Playthrough{
    private int index;
    private String name;
    private Save[] saveList;

    public Playthrough(int index,String name,Save[] saveList){
        this.index = index;
        this.name = name;
        this.saveList = saveList;
    }

    public void setName(String name){ this.name = name; }

    public int getIndex(){ return index; }

    public String getName(){ return name; }

    public Save[] getSaveList() { return saveList; }
}
