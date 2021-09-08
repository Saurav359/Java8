import java.util.ArrayList;
import java.util.Comparator;

public class LambdaExpressionComparator {

	// Comparator is an Functional Interface , because it has only one Abstract method i:e compare , in earlier days(before Java 8)
	//we used to implement this method in below ways
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);

		l1.add(20);
		
		l1.add(30);
		
		l1.add(-30);
		
		l1.add(-130);
		l1.add(130);
		
		System.out.println(l1);
		l1.sort(new myComparator());
		
		System.out.println(l1);
		
		l1.sort(new myComparator1());
		
		System.out.println(l1);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		//Comparator<Integer> cmp = (a,b) -> (a<b)?-1:(a>b)?1:0;
		
		l2.add(-40);
		
		l2.add(40);
		
		l2.add(10);
		
		l2.add(100);
		
		l2.add(110);
		
		l2.add(150);
		
		System.out.println(l2);
		
	//	l2.sort(cmp);
		
		System.out.println(l2);
	}

}

// Comparator for descending order in jdk<1.8
class myComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {

		if(a<b)
		{
			return -1;
		}
		if(a>b)
		{
			return 1;
		}
		else {
			return 0;
		}
		
		
	}
	
	
}

//Comparator for descending order in jdk<1.8
class myComparator1 implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {

		if(a<b)
		{
			return 1;
		}
		if(a>b)
		{
			return -1;
		}
		else {
			return 0;
		}
			
	}
}
