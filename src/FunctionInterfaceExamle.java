// This peace of code shows the ways of implementation of the Functional Interface inetr1 using lambda expression
public class FunctionInterfaceExamle {

	// This is the class which is implementing the Functional Interface inetr1 using lambda expression
	public static void main(String[] args) {
		
		inter1 i1= (int a, int b) -> {System.out.println(a*b);};
		
		i1.product(2, 5);
		
		// As per rule of Lambda expression we have implemented the  product method of FI, 
		//How ever if the implementation code is a single line code than use of {} is not compulsory , in that case we can implement in below manner
		
		inter1 i2 = (int a, int b) -> System.out.println(a*b);
		
		i2.product(2, 3);
		
		// in Java 8 the we use lambda expression to implement abstract method of FI , as we know a FI can have only one Abstract method hence the compiler recognises the type of 
		//aruguments and we dont neet to specify it while implementing the method , 
		//below is the example
		
		inter1 i3 = ( a, b) -> System.out.println(a*b);
		
		i3.product(10, 20);

		
		/* Example of Multiple line implementing */
		
		inter2 i4 = (a) ->{if(a>0) System.out.println(a*a);};
		 
		i4.square(5);

	}

}


interface inter1{
	public void product(int a , int b);
	
}



interface inter2{
	public void square(int a );
	
}
		

