package sisco.set;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeSetDemo {
	int id;
	String name;
	@Override
	public String toString() {
		return "EmployeeSetDemo [id=" + id + ", name=" + name + "]";
	}
	public EmployeeSetDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		HashSet<EmployeeSetDemo> hs=new HashSet<>();
		hs.add(new EmployeeSetDemo(104, "mahesh"));
		hs.add(new EmployeeSetDemo(101, "satesh"));
		hs.add(new EmployeeSetDemo(102, "anil"));
		hs.add(new EmployeeSetDemo(103, "harish"));
		hs.add(new EmployeeSetDemo(104, "mahesh"));
		
		
		Iterator<EmployeeSetDemo> it= hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
