import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratingList {

	public static void main(String[] args) {

		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		/*In Java 7 and older version a list can be itteraterd in below manners*/
		
		
		for(int i = 0 ; i< list.size() ; i++)
		{
			System.out.println(list.get(i));
			
			
		}
		
		System.out.println("--------------------------------------------");
		
		// Above is legacy FOr loop
		
		for(Object i : list) {
			System.out.println(i);
		}
// ABove is the advanced for loop
		
		System.out.println("------------------------------------------");
		/*We aalso collection framework support to iterate lists in below manners*/
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("-------------------------------------------");
		
		Iterator itr1 = list.listIterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
	// We can iterate list using java 8 features
		
		
		
		
		
		
		
	}
	

	

}
