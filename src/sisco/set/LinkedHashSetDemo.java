package sisco.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(101);
		lhs.add(103);
		lhs.add(102);
		lhs.add(104);
		lhs.add(null);
		System.out.println(lhs);
	}

}
