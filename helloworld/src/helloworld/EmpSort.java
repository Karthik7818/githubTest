package helloworld;

import java.util.TreeSet;

public class EmpSort {

	public static void main(String[] args) {
		TreeSet<Employee>empls=new TreeSet<>();
		empls.add(new Employee(201,"xyz",7000));
	empls.add(new Employee(701,"uioz",5000));
	empls.add(new Employee(901,"ac",8000));
	for(Employee e:empls)
		System.out.println(e.getCode()+e.getName()+e.getSalary());
}
}