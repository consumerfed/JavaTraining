package polymorphism;


    class First{
	
	void method() {
		System.out.println("Message from first class");
	}
	}
    class Second extends First{
	
	void method() {
		System.out.println("Method from second class");
	}
	}

public class methodOverriding {
	
	public static void main() {
		Second s=new Second();
		s.method();
		
	}
}
