package InterfaceDefaultMethod;

public class ImplementMultipleInterface implements DefaultInterfaceDemo, DefaultInterfaceDemo1 {

	
	/* ImplementMultipleInterface class is implementing DefaultInterfaceDemo, DefaultInterfaceDemo1 interfaces , where in both has same abstract methods
	 *  m1 , m2 and default methods m4 , m5 , in this case ImplementMultipleInterface class will not override any of the methods
	 *  so , m1 , m2 , m4 m m5 are the methods of this class only .
	 *  
	 *  If we want to call the defaultt method of interface we can all it using DefaultInterfaceDemo1.super.m4(), DefaultInterfaceDemo.super.m4()
	 * 
	 * 
	 * 
	 * 
	 * */
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
