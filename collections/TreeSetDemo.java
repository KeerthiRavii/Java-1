package keerthiravi.collections;

import java.util.Set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args)
	{
	
	 Set<String> t=new TreeSet<>();
	 
	    t.add("b");
		t.add("a");
		t.add("c");
		t.add("c");
		
		System.out.println(t);
		
		boolean r1=t.add("t");
		System.out.println(r1);
		
		 System.out.println("list contains c or not:"+t.contains("c"));
		   
		   t.remove("a");
		   System.out.println("set after removing a:"+t);
		   
		   for(String i:t) {
			   System.out.println(i);
				
		
}
	
}
	
}
	
