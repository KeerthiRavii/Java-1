package keerthiravi.collections;

public class Student {
	
		String name;
		int age;
		String address;
		
		
		public Student(String name,int age,String address) {
			this.name=name;
			this.age=age;
			this.address=address;
		}
		
		public void Setname(String name) {
			this.name=name;
		}
		
		public void Setage(int age) {
			this.age=age;
		}
		
		public void Setaddress(String address) {
			this.address=address;
		}
		
		public String getname() {
			return name;
		}
		
		public int getage() {
			return age;
		}
		
		public String getaddress() {
			return address;
		}
     public String String() {
    	 return("Student name is"+this.getname()+"age is:"+ this.getage()+"and address is:" + this.getaddress());
    	 
     }
     
     public static void main (String[] args) {
    	 Student john=new Student("john",23,"23 east california");

    	 System.out.println(john.toString());
    	 System.out.println(john.getname());
    	 System.out.println(john.getage());
    	 System.out.println(john.getaddress());
     }
     
}
     
	
			
	



