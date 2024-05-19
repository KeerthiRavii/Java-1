package keerthiravi.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	 
	 public static void main(String[] args)
	   
	    {
		   LinkedList<String>list=new LinkedList<>();
		   
		   list.add("a");
		   list.add("b");
		   list.addLast("c");
		   list.addFirst("r");
		   
		   System.out.println(list);
		   
		   list.remove("a");
		   list.remove("b");
		   list.removeLast();
		   list.removeFirst();
		   
		   System.out.println(list);
		  
	    }
		   
		   
}
