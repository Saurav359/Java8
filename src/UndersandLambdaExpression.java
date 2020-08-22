/**
 * 
 */

/**
 * @author SSahay
 *
 */
public class UndersandLambdaExpression {
	
	
	// In earlier version of Java , we were bound  to do Object oriented programming but from jdk 1.8 and above Java allows us to do functional programming.
	// Using lambda expressions , we can right a code which is easily maintainable , concise , Readable
	// Lambda expression are the Anonymous methods which doesn't have any , method name , return type, and access modifier
	// Lambda expressions are used to implement the methods of Functional Interface
	
	//Example1 : Plane normal method
	//The first example is written based on jdk 1.7 feature and we will see how it has been concised because of lambda expressions
	
	// Till Java 1.7
	
	
	public void method1()
	{
		System.out.println("In Java 7");
	}
	
	
	//in 1.8 itself , we dont need to right these lines of code , we can just right right in below manner
	
	
	//as we know, Lambda expressions doesnt have name , return type and access modifiers , so the above method can be written as
	
	() ->  System.out.println("In Java 7");
	
	/*Rules : 
		1) No method name , return type and no access modifier
		2) -> is the notation for lambda expression
		3) If the implementing code has more than one line , than {} are compulsory
		4) If the implementing code has only one line than {} are not compulsory 
		
		
		
		*/
	
	// Example 2 : Method with one argument and no return type
	
	//in Java 7
	
	{
		if(a>0)
		{System.out.println(a*a);}
	}

	
	
	// in Java 8
	
	(a) -> {if(a>0) System.out.println(a*a);}
	
	//Note : In above example we havent specified the type of argument as it is already detected by compiler itself
	
	
	
}
