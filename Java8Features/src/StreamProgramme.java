import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

public class StreamProgramme {

	public static void main(String[] args) {
	
		
		ArrayList<Integer> arry1 = new ArrayList<Integer>();
		arry1.add(0);
		arry1.add(15);
		arry1.add(20);
		arry1.add(5);
		arry1.add(10);
		
		System.out.println(arry1);
		
		// Even numbers using Stream Api
		List<Integer> list = arry1.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(list);
		
		
		// Square of arry1 elements using stream API
		List<Integer> square = arry1.stream().map(i->i*i).collect(Collectors.toList());
		
		System.out.println(square);
		
		List<Integer> ascsort = arry1.stream().sorted().collect(Collectors.toList());
		
		System.out.println(ascsort);
	// Length of array
		long sort = arry1.stream().count();
		
		System.out.println(sort);
	
		
		// Customized sorting order
		List<Integer> dscsort = arry1.stream().sorted((i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		
		System.out.println(dscsort);
		
		
		
		// get Minimum value using string api
		
		Integer minVal = arry1.stream().min((i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0).get();
		
		System.out.println(minVal);
		
	// get Maximum value using string api
		
		Integer maxVal = arry1.stream().max((i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0).get();
		
		System.out.println(maxVal);
	}
	
	


}



