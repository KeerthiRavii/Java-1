package keerthiravi.collections;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class StackDemo {
	
	public static void main (String args[]) {
		
	     Stack<String> s=new Stack <>();
	     
	     s.push("kk");
	     s.push("mm");
	     s.push("ss");
	     
	     System.out.println("Stack is:"+s);
	     
	     String j=s.pop();
	     System.out.println("Popped element is:"+j);
	     System.out.println(" now the Stack is:"+s);
	     
	     String  j1=s.peek();
	     System.out.println("top element is:"+j1);
	     System.out.println("Stack is:"+s);
	     
	     
	     
	     
	     
	}    
	     
	     
	     

}
