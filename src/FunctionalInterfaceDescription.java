
public class FunctionalInterfaceDescription {
	//1) A FI is an interface which should have only one and one Abstract method and can have any numbers of Default and static method
	//2) We have @Functionalinterface annotation to define an interface as FUnctions Interface which is optional ,
	//any interface which falls under line 1. rule is by default a functional interface
	// 

}


interface inter3{
	
	public void m1(); // it is an functional interface
}

@FunctionalInterface
interface inter4
{
	public void m2(); // it is an functional interface
}

// above 2 interfaces have only one abstract method hence both of them are example of functional interface



interface inter5
{
	public void m1();
	
	
	public void m2();
	
	// this is  not a functional interface because it has 2 abstaract method
}


interface inter6{
	
public void m1();
	
	
	public void m2();
	
	
	default void m3() 
	{
		
	}
	
	public static void m4() {
		
	}
	
	
	// This example is not an FI because  it doesn't falls FI rules (only one abstract method) and still we are using default and static method
	// Note :  Default and static methods are  allowed and optional in  interface , 
}

@FunctionalInterface
interface inter7
{
	public void m1();
	
	
	//public void m2();
	
	
	default void m3() {
		
	}
	
	public static void m4() {
		
	}
	// This code compiles fine , because it is a FI and it has only one abstract method , and  default and static methods are allowed and optional in case of FI and Interface
	
}


/* Functional Interface with inheritance  */


interface parent
{
	
	public void m1(); // this is FUnctional interface
	
}

interface child1 extends parent{
	// here child1 interface doesnt have any abstract method and but its extending parent interface so the child1 interface has only 1 abstract method inherited by parent , hence compiles files
	// here both the interfaces parent and child1 are Functional interfaces
}

@FunctionalInterface
interface child2 extends parent{
	public void m1();
	/// this exaple compiles fine because , we are just overriding the method m1 which it inheritates from parent
}

@FunctionalInterface
interface child3 extends parent{
	
	public void m2();
	// this gives compilation error because FI child3 has 2 abstract methods m1 and m2 and as per the rule a FI can have only 1 abstract method
}