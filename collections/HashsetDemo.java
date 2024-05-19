package keerthiravi.collections;

import java.util.*;

public class HashsetDemo{
	public static void main(String[] args)
	{
	
	 Set<String>h=new HashSet<>();
		
		h.add("a");
		h.add("b");
		h.add("c");
		h.add("c");
		
	
	System.out.println(h);
	
		
	
	h.add("a");
	h.add("b");
	
	boolean r1=h.add("t");
	System.out.println(r1);
	
	boolean r2=h.add("c");
	System.out.println(r2);
	
   System.out.println(h);
   
   System.out.println("list contains c or not:"+h.contains("c"));
   
   h.remove("a");
   System.out.println("set after removing a:"+h);
   
   for(String item:h) {
	   System.out.println(item);
		
   }

	
  
}
}