package InterfaceStaticMethod.copy;

/*
 * Method of an interface having Default modifiers are Default Methods , 
 * -->Default Methods must have a body
 * --> Default Method of an Interface cannot be abstract,
 * --> An Interface can have 4 members Final static variable , public abstract method, public static method and public default method
 *  --> We cannot override the Object class methods in an Interface as default method because A default method cannot override a method from 
 *     java.lang.Object
 * 
 * 
 * */

public interface DefaultInterfaceDemo {
	
	
	
	
	public  abstract void m1();
	
	public  abstract void m2();
	
	//default void m3();// We Must give a body to a Default Method in Interface in java 8
	
	default void m4()
	{
		System.out.println("Hello DefaultInterfaceDemo m4()");
	}
	
	default void m5()
	{
		System.out.println("Hello DefaultInterfaceDemo m5()");
	}
	
	/*
	 * default boolean equals(Object o) {
	 * 
	 * }
	 */

}
