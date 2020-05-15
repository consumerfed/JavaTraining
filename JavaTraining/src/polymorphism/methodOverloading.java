package polymorphism;

class A{
	void add(int a)
	{
		return (a+a);
	}
	
	void add(int a, int b)
	{
		return (a+b);
	}
	
	void return(int a, int b, int c)
	{
		return (a+b+c);
	}
}

public class methodOverloading {
	public static void main()
	{
		A a=new A();
		System.out.println(a.add(10));
	}

}
