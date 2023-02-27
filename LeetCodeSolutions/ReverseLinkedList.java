class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode previous = null;
       ListNode after = head;
       while(head!=null){
           after = head.next;
            head.next = previous;
           previous = head;
           
           head = after;
           
       }
       return previous;


    }
}