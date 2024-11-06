package sisco.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("==============Using for loop======");
		// Approch-1
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("===============Using for-each loop-===========");
		for (Integer integer : al) {
			System.out.println(integer);
		}
		System.out.println("=============Iterator Approach=========");
		Iterator iterator= al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("============List Iterator Approach=========");
		ListIterator li= al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("========== forEach() Approach==========");
		al.forEach(i->{
			System.out.println(i);
		});
		
		
		
		
	}

}
