package Linked_List;

class Linked_List {
  //.........NODE REPRESENTATION...........
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null,tail=null;

//.........INSERTION............
    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
           head = node;
        }
        else {
            tail.next = node;     //insertion at end
            //node.next=head;      //insertion at beginning
            //head=node;
        }
        tail= node;

    }
 //........Displaying the nodes present in the list..........
    public void display() {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

}
public class Implementation {
    public static void main(String[] args) {
      Linked_List list=new Linked_List();
      list.insert(5);
      list.insert(18);
      list.insert(20);
      list.insert(22);
      list.insert(12);
      list.insert(4);
      list.display();
    }
}
