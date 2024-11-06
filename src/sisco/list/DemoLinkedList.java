package sisco.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class DemoLinkedList {
	public static void main(String[] args) {
	 LinkedList<DemoEmployee> emp=new LinkedList<>();
	 emp.add(new DemoEmployee(111, "satesh"));
	 emp.add(new DemoEmployee(112, "anil"));
	 emp.add(new DemoEmployee(113, "harish"));
	 emp.add(new DemoEmployee(114, "mahesh"));
	 emp.add(1, new DemoEmployee(115, "jaggu"));
	 System.out.println("===============Using forEach()");
	 emp.forEach(i->
	 System.out.println(i)
			 );
	 System.out.println("==============Using iterator====");
	 ListIterator<DemoEmployee> li= emp.listIterator();
	 while(li.hasNext()) {
		 System.out.println(li.next());
	 }
	}

}
