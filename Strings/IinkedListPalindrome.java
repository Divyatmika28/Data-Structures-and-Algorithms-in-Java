public boolean ispaloindrome(ListNode head)
{
     // get to the centre of the list using fast and slow pointers and reverse the second half and then compare the list //. no space 
     if (head == null || head.next == null) return true; 

     Listnode fast = head;
     Listnode slow = head; 

     while(fast.next != null && fast.next.next != null)
     {

     	fast = fast.next.next;
     	slow = slow.next
     }
    Listnode secondhead = slow.next;
    slow.next = null; 

    //reverse the secondhead
    Listnode p1= secondhead;
    Listnode p2 = p1.next; 

    while(p1! = null && p2!= null)
    {
       Listnode temp = p2.next ; 
       p2.next = p1; 
       p1 = p2; 
       p2 = temp; 
    }

  secondhead.next = null; 
  //compare 

  ListNode p = (p2==null?p1:p2);
  ListNode q = head;

  	 while(p!=null){
        if(p.val != q.val)
            return false;
 
        p = p.next;
        q = q.next;
 
    }


}