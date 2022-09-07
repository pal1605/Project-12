package PKJ1;

public class Method1234{
	public void defaultmethod()
	
	
	{
		System.out.println("Default method");
	
	}
	public void method(int a)
	{
		this.method(5,4,1);
		this.defaultmethod();
		this. method(4,1);
		this.method(5,4,1,2);
		System.out.println("one perameterized method");
	
		
	}
	
public void method(int a, int b)
{
	System.out.println("two perameterized method");

}
public void method(int a, int b, int c)
{
	System.out.println("three perameterized method"); 

}
public void method(int a, int b, int c, int d)
{
	System.out.println("four perameterized method");

}
public static void main(String[] args) {
	Method1234 obj=new Method1234();
	obj.method(1);
}
}
