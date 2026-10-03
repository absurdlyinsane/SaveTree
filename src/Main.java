void main(){
    while(true){
        IO.println("---- SaveTree ----");
        IO.println("1. Add Game");
        IO.println("2. Manage Games");
        IO.println("3. Settings");
        IO.println();
        IO.println("0. Exit");
        IO.println();
        IO.println();
        
        int key = Functions.readInt("--> ");
        if(key == 0) break;

        switch(key){
            case 1:
                //addGame();
                IO.println("(addGame() placeholder)");
                break;
            case 2:
                //manageGame();
                IO.println("(manageGame() placeholder)");
                break;
            case 3:
                //settings();
                IO.println("(settings() placeholder)");
                break;
        
            default:
                IO.println("Invalid input!");
                break;
        }
    }
}
