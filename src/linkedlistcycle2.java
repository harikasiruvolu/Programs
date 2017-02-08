
public class linkedlistcycle2 {
	
	//  Definition for singly-linked list.
	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
	public class Solution {
	    public ListNode detectCycle(ListNode head) {
	        ListNode fast = head;
	        ListNode slow = head;
	 
	        while(fast != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next;
	              if (fast == slow){
	                        ListNode slow2 = head; //1-2-3-4-5
	                        while (slow2 != slow){
	                            slow = slow.next;
	                            slow2 = slow2.next;
	                        }
	                        return slow;
	                    }
	                }
	                return null;
	    }
	}
}
