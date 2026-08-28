package Entities.Structures;

public class CQueue{
    private int capacity,size,front,rear;
    private Node[] mainQ;

    public CQueue(int capacity){
        this.capacity = capacity;
        front = rear = -1;
        mainQ = new Node[capacity];
    }

    public int getCapacity(){ return capacity; }

    public int getSize(){ return size; }

    public Node[] getMainQ(){ return mainQ; }

    public int getFront(){ return front; }

    public int getRear(){ return rear; }

    public Node getFrontNode(){
        if(isEmpty() || front < 0){
            return null;
        }
        return mainQ[front];
    }

    public Node getRearNode(){
        if(isEmpty() || rear < 0){
            return null;
        }
        return mainQ[rear];
    }

    public boolean isEmpty(){
        boolean empty1 = true;
        boolean empty2 = (front == -1);
        for(int i=0;i<capacity;i++){
            if(mainQ[i] != null){
                empty1 = false;
                break;
            }
        }
        if(empty1 == empty2){
            return empty1;
        } else{
            IO.println("Warning! Queue has been externally altered.");
            return false;
        }
    }

    public boolean isFull(){
        boolean full1 = true;
        boolean full2 = (rear == capacity-1);
        for(int i=0;i<capacity;i++){
            if(mainQ[i] == null){
                full1 = false;
                break;
            }
        }
        if(full1 == full2){
            return full1;
        } else{
            IO.println("Warning! Queue has been externally altered.");
            return false;
        }
    }

    public void enQ(Node newNode){
        if(isFull()){
            IO.println("The queue is full!");
        } else{
            if(isEmpty()){
                front = 0;
            }
            rear++;
            mainQ[rear] = newNode;
            size++;
        }
    }

    public Node deQ(){
        if(isEmpty()){
            IO.println("The queue is empty!");
            return null;
        } else{
            Node deq = mainQ[front];
            mainQ[front] = null;
            if(front == rear){
                front = rear = -1;
            } else{
                front++;
            }
            size--;
            return deq;
        }
    }

    public void wipeQ(){
        if(isEmpty()){
            IO.println("The queue is empty!");
        } else{
            for(int i=0;i<capacity;i++){
                mainQ[i] = null;
            }
        }
    }

    public String printQ(){
        String output = "";
        if(isEmpty()){
            output = "Queue is empty.";
        } else{
            for(int i=front;i<=rear;i++){
                output += (mainQ[i].getValue()+"  ");
            }
        }
        return output;
    }

    public void resizeQ(int newCapacity){
        if(isEmpty()){
            IO.println("Queue is empty. Nothing to copy.");
        } else{
            Node[] newQ = new Node[newCapacity];
            int index = 0;
            for(int i=front;i<=rear;i++){
                newQ[index++] = mainQ[i];
            }
            capacity = newCapacity;
            mainQ = newQ;
            front = 0;
            rear = index-1;
        }
    }
};
