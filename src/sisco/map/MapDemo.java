package sisco.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(101, "satesh");
		map.put(102, "anil");
		map.put(103, "harish");
		
		System.out.println("Map size is:"+map.size());
		
		Set<Entry<Integer, String>> entryset= map.entrySet();
		System.out.println("=======Using foreach=====");
		for(Entry<Integer, String> entry:entryset) {
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		System.out.println("==========Using iterator=======");
		Iterator<Entry<Integer, String>> entry1= entryset.iterator();
		while(entry1.hasNext()) {
			System.out.println(entry1.next());
		}
		
		System.out.println(map.containsKey(104));
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("anil"));
		System.out.println(map.containsValue("mahesh"));
		System.out.println(map.isEmpty());
		
		
		
		
		
		
		
		
		
		/*
		 * Map<Integer, String> map=new HashMap<>(); map.put(101, "satesh");
		 * map.put(102, "anil"); map.put(103, "harish"); map.put(104, "harish");
		 * 
		 * System.out.println("Map size::"+map.size());
		 * System.out.println(map.get(101)); System.out.println(map.get(103));
		 * 
		 * System.out.println("=============Get all values.........");
		 * Collection<String> values= map.values(); for(String v:values) {
		 * System.out.println(v); } System.out.println("============get keys.........");
		 * Set<Integer> keyset= map.keySet(); for(Integer key:keyset) {
		 * System.out.println( key); }
		 * 
		 * System.out.println("=======using iterator==========="); Set<Entry<Integer,
		 * String>> entryset= map.entrySet(); Iterator<Entry<Integer, String>> entry
		 * =entryset.iterator(); while(entry.hasNext()) {
		 * System.out.println(entry.next()); }
		 * System.out.println("==========using for each==========="); for(Entry<Integer,
		 * String> entry1:entryset) {
		 * System.out.println(entry1.getKey()+"--"+entry1.getValue()); }
		 * System.out.println("===========testing=========");
		 * System.out.println(map.containsKey(101));
		 * System.out.println(map.containsKey(103)); System.out.println(map.isEmpty());
		 * 
		 * map.clear();
		 * 
		 * System.out.println(map.size());
		 */
	}

}
