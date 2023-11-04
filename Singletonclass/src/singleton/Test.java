package singleton;

public class Test 
{
	public static void main(String[] args) 
	{
		Demo demo=Demo.getDemo();
		
		System.out.println(demo.hashCode());
		
		Demo demo1=Demo.getDemo();
		
		System.out.println(demo1.hashCode());
		
		Demo demo2=Demo.getDemo();
		System.out.println(demo2);
	}

}
		