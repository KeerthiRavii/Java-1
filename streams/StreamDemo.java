package keerthiravi.streams;

import java.util.List;
import java.util.ArrayList;


public class StreamDemo {
	
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();//without using stream 
		
		l.add(10);
		l.add(20);
		l.add(30);
		
		List<Integer>squaresList=new ArrayList<>();
		
	    for(Integer i:l) {
    	squaresList.add(i*i);
    }
	   System.out.println("h:"+squaresList);
	
	}
}
