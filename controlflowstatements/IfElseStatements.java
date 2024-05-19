package keerthiravi.controlflowstatements;

public class IfElseStatements {
	
	public static void main(String[] args) {
		
		int mark=40;
		char grade;
		{	
		if(mark>=90){
			grade='a';
		}
		else if(mark>=80){
			grade='b';
		}
		else if(mark>=70) {
			grade='c';
		}
		else {
			grade='d';
		}
		System.out.println("grade is="+grade);
		}
		
	}	
	
}

