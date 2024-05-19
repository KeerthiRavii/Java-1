package keerthiravi.datatypes;

public class NonPrimitiveDataTypes {
	
  public static void main(String[] args) {
	
	String str = "test";
	System.out.println("string:"+str);
	
	String str1 = new String ("test");  
	System.out.println("another string:"+str1);
	
	int arr[];
	arr=new int[2];
	arr[0]=1;
	arr[1]=3;
	
	System.out.println("array:");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	
  }	

}
