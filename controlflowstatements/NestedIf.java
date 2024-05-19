package keerthiravi.controlflowstatements;

public class NestedIf {
	
	public static void main(String[] args) {
	
	int i=40;
	
	if(i==50) {
		System.out.println("i is 50");
	}
	 if(i<50) {
		 System.out.println("i is greater than 50");
	 }
	 if(i>50) {
		 System.out.println("i is less than 50");
		 }
	
	
	
	int a=1;
	int b=2;
	int r;
	{
	r=a<b ? a:b;
	System.out.println(r);
	}
 }
}
	
