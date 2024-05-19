package keerthiravi.controlflowstatements;

public class SwitchCaseStatement {
	
	public static void main(String[] args) {
		
		int month=5;
	    String monthname;
		
    switch(month) {
    
    case 1:
    	monthname="January";
    	break;
    	
    case 2:
    	monthname="February";
    	break;
    	
    case 3:
    	monthname="March";
    	break;
    	
    case 4:
    	monthname="April";
    	break;
    	
    case 5:
    	monthname="May";
    	break;
   
    default:
    	monthname="Invalid string";
    	break;
	}
    
    System.out.println(monthname);
    
    
	}
}
