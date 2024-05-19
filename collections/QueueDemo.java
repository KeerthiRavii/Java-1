package keerthiravi.collections;

import java.util.Queue;
import java.util.PriorityQueue; 


public class QueueDemo {
	
	public static void main (String args[]) {
		
	     Queue<String> q=new PriorityQueue <>();
	     
	     q.add("dd");
	     q.add("jj");
	     q.add("hh");
	     
	     System.out.println("Original queue is:"+q);
	     
	     q.remove();
	     System.out.println("queue after removing the head element :"+q);
	     
	     String head=q.peek();
	     System.out.println("head of the queue is:"+head);
	    
	     head=q.poll();
	     System.out.println("removed head is:"+head);
	     
	     System.out.println("now the queue is:"+q);
	     
	     
	     
	     
	     
	     
	     
	     

	     
	}	

}
