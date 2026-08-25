import Entities.Structures.CQueue;
import Entities.Structures.Node;

void main(){
    Node n1 = new Node(2);
    Node n2 = new Node(4);
    Node n3 = new Node(3);
    Node n4 = new Node(1);
    Node n5 = new Node(5);

    CQueue q1 = new CQueue(4);

    q1.enQ(n1);
    q1.enQ(n2);
    q1.enQ(n3);
    q1.enQ(n4);
    q1.enQ(n5);

    IO.println(q1.printQ());

    q1.deQ();
    q1.deQ();
    q1.deQ();
    q1.deQ();
    q1.deQ();

    IO.println(q1.printQ());
    IO.println("HTIW");
}
