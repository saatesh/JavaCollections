package sisco.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(101);
		v.add(102);
		v.add(103);
		v.add(104);
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(null);

		Enumeration<Integer> e= v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
