import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class forEach {

	public static void main(String[] args) {
		/*Map<Integer,List<String>> map = new HashMap<Integer,List<String>>();
		map.put(1, Arrays.asList("Hi1"));
		map.put(2, Arrays.asList("Hi2"));
		map.put(3, Arrays.asList("Hi3"));
		map.put(4, Arrays.asList("Hi4"));
		map.put(5, Arrays.asList("Hi5"));
		map.put(6, Arrays.asList("Hi6","Hi61"));
		map.forEach((key, value) -> {
		System.out.println("Key : " + key + " Value : " + value);
		value.forEach(val->System.out.println(val));
		
		});*/
		Map<Integer,List<String>> map1 = new HashMap<Integer,List<String>>();
		Map<Integer,Map<Integer,List<String>>> map = new HashMap<Integer,Map<Integer,List<String>>>();
		map1.put(1,Arrays.asList("Hi1"));
		map1.put(2, Arrays.asList("Hi2"));
		map1.put(3, Arrays.asList("Hi3"));
		map1.put(4, Arrays.asList("Hi4"));
		map1.put(5, Arrays.asList("Hi5"));
		map1.put(6, Arrays.asList("Hi6","Hi61"));
		map.put(1, map1);
		/*map.put(2, Arrays.asList("Hi2"));
		map.put(3, Arrays.asList("Hi3"));
		map.put(4, Arrays.asList("Hi4"));
		map.put(5, Arrays.asList("Hi5"));
		map.put(6, Arrays.asList("Hi6","Hi61"));*/
		map.forEach((key, value) -> {
		System.out.println("OuterMap==========Key : " + key + " Value : " + value);
		//
		value.forEach((key1,value1)->{
			System.out.println("InnerMap======Key: " + key1 + " Value : " + value1);
			value1.forEach(val->System.out.println(val));
		});
		});
		
		
		System.out.println("=======================================================================================");
		
		for (Entry<Integer, Map<Integer, List<String>>> entry : map.entrySet()) {
			
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
