package sisco.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("satesh");
		ts.add("anil");
		ts.add("harish");
		ts.add("satesh");
		ts.add("anil");
		ts.add("harish");
		
		
		Iterator<String> it= ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
