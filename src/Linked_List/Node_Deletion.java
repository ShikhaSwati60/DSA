package Linked_List;

import java.util.Scanner;

public class Node_Deletion extends Linked_List {
    // DELETION OF FIRST NODE
    void delFirst()
    {
        head=head.next;
    }

    // DELETION OF LAST NODE
    void delLast()
    {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }

    // DELETION OF RANDOM NODE
    void delRandom(int key)
    {
        if(head.data==key)
            delFirst();

        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.next.data==key)
            {
                temp.next=temp.next.next;
                break;
            }
            else
                temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node_Deletion list=new Node_Deletion();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of nodes in the list: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insert(sc.nextInt());
        }
        System.out.print("Linked list: ");
        list.display();

        System.out.print("\n\nEnter the node to be deleted: ");
        int key=sc.nextInt();
        list.delRandom(key);
        System.out.print("Linked List after deletion: ");
        list.display();

    }
}
