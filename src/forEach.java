import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class forEach {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Hi1");
		map.put(2, "Hi2");
		map.put(3, "Hi3");
		map.put(4, "Hi4");
		map.put(5, "Hi5");
		map.put(6, "Hi6");
		map.forEach((key, value) -> {
			System.out.println("Key : " + key + " Value : " + value);
		});
		
		Map<Integer,List<String>> map2 = new HashMap<Integer,List<String>>();
		map2.put(1, Arrays.asList("Hi1"));
		map2.put(2, Arrays.asList("Hi2"));
		map2.put(3, Arrays.asList("Hi3"));
		map2.put(4, Arrays.asList("Hi4"));
		map2.put(5, Arrays.asList("Hi5"));
		map2.put(6, Arrays.asList("Hi6","Hi61"));
		map2.forEach((key, value) -> {
		System.out.println("Key : " + key + " Value : " + value);
		value.forEach(val->System.out.println(val));
		
		});
		Map<Integer,Map<Integer,List<String>>> map3 = new HashMap<Integer,Map<Integer,List<String>>>();
		map3.put(1, map2);
		map3.forEach((key, value) -> {
		System.out.println("OuterMap==========Key : " + key + " Value : " + value);

		value.forEach((key1,value1)->{
			System.out.println("InnerMap======Key: " + key1 + " Value : " + value1);
			value1.forEach(val->System.out.println(val));
		});
		});
		
		//If Lambda expression is not there then for iteration we write the below code
		//so lambda expression reduce the line of code
		System.out.println("=======================================================================================");
		
		for (Entry<Integer, Map<Integer, List<String>>> entry : map3.entrySet()) {
			
			System.out.println("OuterMap==========Key : " + entry.getKey() + " Value : " + entry.getValue());
            for (Entry<Integer, List<String>> entry2 : entry.getValue().entrySet()) {
            	System.out.println("InnerMap======Key: " + entry2.getKey() + " Value : " + entry2.getValue());
            	
            	for (String string : entry2.getValue()) {
					System.out.println(string);
				}
            }
            
		}
	}

}
