package InterfaceStaticMethod.copy;

public class MyClassDefaultMethod implements DefaultInterfaceDemo {

	/* MyClassDefaultMethod 
	 * 
	 * As this class implements DefaultInterfaceDemo interface , it must implement the abstract methods of this interface,
	 * Also this class can implement all the Default methods of this interface
	 * -> A class cannot have a default method, it is only allowed in Interface 
	 * */
	
	@Override
	public void m1() {
		System.out.println( " MyClassDefaultMethod :DefaultInterfaceDemo : m1() overriden" );

	}

	@Override
	public void m2() {

		System.out.println( " MyClassDefaultMethod :DefaultInterfaceDemo : m2() overriden" );

	}
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * MyClassDefaultMethod myClassDefaultMethod = new MyClassDefaultMethod();
	 * 
	 * myClassDefaultMethod.m1();
	 * 
	 * myClassDefaultMethod.m2();
	 * 
	 * myClassDefaultMethod.m4();
	 * 
	 * myClassDefaultMethod.m5();
	 * 
	 * }
	 */
	
	
	/*
	 * o/P:
	 *  MyClassDefaultMethod :DefaultInterfaceDemo : m1() overriden
	 * MyClassDefaultMethod :DefaultInterfaceDemo : m2() overriden 
	 * Hello DefaultInterfaceDemo m4()
	 * Hello DefaultInterfaceDemo m5()
	 */

	

	// Note : We can override Default method of interface in its implementing class
	
	
	@Override
	public  void m4() // While overriding the default method of an interface it must have a public modifier
	{
		System.out.println("MyClassDefaultMethod overiden m4()");
	}
	
	@Override
	public void m5()
	{
		System.out.println("MyClassDefaultMethod overiden m5()");
	}
	
	
	public void CallDefMethodOfInterface()
	{
		// We can call the default method of interface even if we have overriden the method in child class by using super keyword
		DefaultInterfaceDemo.super.m4();
		DefaultInterfaceDemo.super.m5();;
	}
	public static void main(String[] args) {
		
		MyClassDefaultMethod myClassDefaultMethod = new MyClassDefaultMethod();
		
		myClassDefaultMethod.m4();
		myClassDefaultMethod.m5();
		myClassDefaultMethod.CallDefMethodOfInterface();
		
//		O/P :
//			MyClassDefaultMethod overiden m4()
//			MyClassDefaultMethod overiden m5()
//			Hello DefaultInterfaceDemo m4()
//			Hello DefaultInterfaceDemo m5()
	}
	
	
}


