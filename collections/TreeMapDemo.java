package keerthiravi.collections;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
	
	public static void main (String args[]) {
		
     Map<Integer,String> t=new TreeMap<>();
     
     t.put(3, "a");
     t.put(2, "b");
     t.put(1, "c");
     
     System.out.println(t);
     
     Map<String,Integer> h=new TreeMap<>();
     
     h.put( "a",2);
     h.put( "d",6);
     h.put( "c",1);
     
     System.out.println(h);
     
	}

}
