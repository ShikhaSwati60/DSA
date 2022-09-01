package Linked_List;

import java.util.Scanner;

public class Merge_two_sorted_list extends Linked_List {
    static Node merge(Node l1,Node l2){
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        if(l1.data<=l2.data)
        {
            l1.next=merge(l1.next,l2);
            return l1;
        }
        else
        {
            l2.next=merge(l1,l2.next);
            return l2;
        }

    }
    public static void main(String[] args) {
       Linked_List list1=new Merge_two_sorted_list();
        Linked_List list2=new Merge_two_sorted_list();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of nodes in the first list: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list1.insert(sc.nextInt());
        }
        System.out.print("Enter no. of nodes in the second list: ");
        int m=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            list2.insert(sc.nextInt());
        }
        System.out.print("First sortedLinked list: ");
        list1.display();
        System.out.print("Second sortedLinked list: ");
        list2.display();
        Node head1=list1.head;
        Node head2=list2.head;
        Node res=merge(head1,head2);
    }
}
