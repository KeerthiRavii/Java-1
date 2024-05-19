package keerthiravi.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	
	public static void main(String[] args)
	{
	
	 Map<String,Integer>h=new HashMap<>();
		
		h.put("a",10);
		h.put("b",20);
		h.put("c",30);
		h.put("c",40);
		
	
	System.out.println(h);
	
	System.out.println("Size of map is:"+h.size());
	
	if(h.containsKey("a")) {
		Integer a=h.get("a");
		System.out.println("Value for key:"+"\"a\"is:="+a);
	}
	
	if(h.containsKey("d")) {
		Integer a=h.get("a");
		System.out.println("Value for key:"+"\"a\"is:="+a);
	}
	
	if(h.containsKey("c")) {
		Integer a=h.get("c");
		System.out.println("Value for key:"+a);
		 
	}
	
	for(String Key: h.keySet()) {
		System.out.println("key:"+Key+",value:"+h.get(Key));
	}
	
	for(Entry<String,Integer>Entry:h.entrySet()) {
		System.out.println("key"+Entry.getKey()+",Value:"+Entry.getValue());
	}
	
	
}
}
