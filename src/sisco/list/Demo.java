package sisco.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		ArrayList<DemoEmployee> al=new ArrayList<>();
		al.add(new DemoEmployee(101, "satesh"));
		al.add(new DemoEmployee(102, "anil"));
		al.add(new DemoEmployee(103, "harish"));
		al.add(new DemoEmployee(104, "Mahesh"));
		ListIterator<DemoEmployee> li= al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("=====================");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
			
	}

}
