package Linked_List;

import java.util.Scanner;

public class Reverse_List extends Linked_List {
    // Iterative approach to reverse a linked list
    void reverse()
    {
        Node curr=head;
        Node prev=null;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        head=prev;

    }
    public static void main(String[] args) {
        Reverse_List list=new Reverse_List();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of nodes in the list: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insert(sc.nextInt());
        }
        System.out.print("Linked list: ");
        list.display();
        System.out.print("\nReversed Linked list: ");
        list.reverse();
        list.display();
    }
}
