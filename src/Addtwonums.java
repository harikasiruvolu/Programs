
public class Addtwonums {

	// * Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}


	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1==null||l2==null){
			return null;
		}
		ListNode previous= new ListNode(0);
		ListNode head =previous;
		int sum=0;
		while(l1!=null||l2!=null){
			if(l1!=null){
				sum +=l1.val;
				l1=l1.next;
			}
			if(l2!=null){
				sum +=l2.val;
				l2=l2.next;
			}
			head.next= new ListNode(sum%10);
			head=head.next;
			sum=sum/10;
		}
		if(sum==1){
			head.next=new ListNode(1);
		}
		return previous.next;
	}
}

