package Linked_List;

import java.util.Scanner;

public class Palindrome extends Linked_List{

    //Code to find middle node of the list
    static Node midNode(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //For reversing half of the linked list
    static Node reverse(Node head)
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
            return prev;
    }
     //Here we compare the reversed list with the first half of the list
    static boolean compare(Node l1,Node l2)
    {
        while(l1!=null && l2!=null)
        {
            if(l1.data!=l2.data)
                return false;
            l1=l1.next;
            l2=l2.next;
        }
        return true;
    }

    static boolean isPalindrome(Node head)
    {
        if(head==null)
            return false;
        if(head.next==null)
            return true;
        Node mid=midNode(head);
        Node temp=mid.next;
        mid.next=null;
        temp=reverse(temp);
        return compare(temp,head);
    }
    public static void main(String[] args) {
       Linked_List list= new Palindrome();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of nodes in the list: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insert(sc.nextInt());
        }
        System.out.print("Linked list: ");
        list.display();
        if(isPalindrome(list.head))
          System.out.println("\nThe linked list is palindrome");
        else
            System.out.println("\nThe linked list is not palindrome");
    }
}
