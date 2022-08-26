package Linked_List;

import java.util.Scanner;

public class MiddleNode extends Linked_List{
    //....MIDDLE NODE OF LINKED LIST....
    static int midNode(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
            MiddleNode list=new MiddleNode();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of nodes in the list: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insert(sc.nextInt());
        }
        System.out.print("Linked list: ");
        list.display();
        int middle= midNode(list.head);
        System.out.println("\nMiddle element of the list is: "+middle);
    }
}
