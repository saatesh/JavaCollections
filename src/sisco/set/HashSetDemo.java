package sisco.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		hs.add("five");
		hs.add(null);
		hs.add(null);
		
		Iterator<String> i= hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
