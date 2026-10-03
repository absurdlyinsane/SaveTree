package Entities;

import java.nio.file.Path;
import java.util.List;

public class Game{
    //private final int globalID;
    private final int localID;
    private String name;
    private Path installationPath;
    private List<Playthrough> allPlaythroughs;
    private Playthrough lastPlaythrough;
    private Save lastSave;

    public Game(int localID,String name,Path installationPath){
        this.localID = localID;
        this.name = name;
        this.installationPath = installationPath;
    }

    // public Game(int globalID,int localID,String name,Path installationPath){
    //     this.globalID = globalID;
    //     this.localID = localID;
    //     this.name = name;
    //     this.installationPath = installationPath;
    // }

    public void setName(String name) { this.name = name; }

    public void setInstallationPath(Path installationPath) { this.installationPath = installationPath; }

    public void setAllPlaythroughs(List<Playthrough> allPlaythroughs) { this.allPlaythroughs = allPlaythroughs; }

    public void setLastPlaythrough(Playthrough lastPlaythrough) { this.lastPlaythrough = lastPlaythrough; }

    public void setLastSave(Save lastSave) { this.lastSave = lastSave; }

    public int getLocalID() { return localID; }

    public String getName() { return name; }

    public Path getInstallationPath() { return installationPath; }

    public List<Playthrough> getAllPlaythroughs() { return allPlaythroughs; }

    public Playthrough getLastPlaythrough() { return lastPlaythrough; }

    public Save getLastSave() { return lastSave; }
}
