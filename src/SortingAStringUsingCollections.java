import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingAStringUsingCollections {

	private static String str = "Sandeep Seela, Prajyot Gaoli, Mahesh Patkar, Anjana Vasudevan";
	
	//using streams
	public static void main(String[] args) {
		String[] strArray = str.split(",");
		Stream<String> stream = Stream.of(strArray);
		List<String> list = stream.sorted((s1, s2)-> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(list);
	}
}

class SortingAStringUsingCollections1 {

	private static String str = "Sandeep Seela, Prajyot Gaoli, Mahesh Patkar, Anjana Vasudevan";

	public static void main(String[] args) {
		String[] strArray = str.split(",");
		
	}
}
