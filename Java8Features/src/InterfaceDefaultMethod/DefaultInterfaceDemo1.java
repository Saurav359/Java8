package InterfaceDefaultMethod;

public interface DefaultInterfaceDemo1 {

	public  abstract void m1();
	
	public  abstract void m2();
	
	default void m4() {
		System.out.println("DefaultInterfaceDemo1 m4()");
	}

	
	default void m5() {
		System.out.println("DefaultInterfaceDemo1 m5()");
	}
}
