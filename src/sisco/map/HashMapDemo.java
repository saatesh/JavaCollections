package sisco.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(101, "satesh");
		map.put(102, "anil");
		map.put(103, "hari");
		
		System.out.println(map);
		System.out.println(map.size());
		
		Set<Integer> keys= map.keySet();
		System.out.println("Keys:"+keys);
		
		Collection<String> values= map.values();
		System.out.println("values:"+values);
		
		Set<?> entry= map.entrySet();
		System.out.println(entry);
		
		System.out.println(map.containsKey(104));
	}

}
