package keerthiravi.collections;

import java.util.ArrayList;

public class ArrayListDemo {
   
	   public static void main(String[] args)
	   
	    {
		   
		   ArrayList<Integer> arrayList=new ArrayList<>(3);
		   
		   for(int i=1;i<=3;i++) 
			   arrayList.add(i);
		   
		   
		 System.out.println(arrayList);
		       
		     arrayList.remove(2);
		 System.out.println(arrayList);
		 
		 for(int i=0;i<arrayList.size(); i++)
			 System.out.println(arrayList.get(i)+ "");
		 
		 
		   
		   
	   }
	
} 
