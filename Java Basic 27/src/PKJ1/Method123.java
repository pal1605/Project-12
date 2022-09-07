package PKJ1;

public class Method123 {

	public void method()
	{System.out.println("Default method");}
	public void method1()
	{
		this.method3();
		this.method();
		this.method2();
		this.method4();
		System.out.println("one method");
		
		}
	public void method2()
	{System.out.println("two method");
	
	}
	public void method3()
	{System.out.println("three method");
	
	}
	public void method4()
	{System.out.println("four method");
	
	}
	public static void main(String[] args) {
		Method123 obj=new Method123();
		obj.method1();
	}
}
