package keerthiravi.collections;

public class Constructors {
	
	int width;
	int height;
	int depth;
	
	Constructors(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	

	Constructors(int width,int height){
		this.width=width;
		this.height=height;
		this.depth=10;
	}
	

	Constructors(int dimension){
		width=dimension;
		height=dimension;
		depth=dimension;
	}
	
	Constructors(){
		this.width=10;
		this.height=10;
		this.depth=10;
	}
	
	int volume() {
		return width*height*depth;
	}
	
	public static void main(String args[]) {
		int volume;
		
		Constructors cuboid1=new Constructors(10,20,15);
		volume=cuboid1 .volume();
		System.out.println("volume of cuboid1 is"+volume);
		
		Constructors cuboid2=new Constructors(10,20);
		volume=cuboid2 .volume();
		System.out.println("volume of cuboid2 is"+volume);
		
		Constructors cuboid3=new Constructors(10);
		volume=cuboid3.volume();
		System.out.println("volume of cuboid3 is"+volume);
		
		
		Constructors cuboid4=new Constructors(10,20);
		volume=cuboid4.volume();
		System.out.println("volume of cuboid4 is"+volume);
		
		
	}

}
