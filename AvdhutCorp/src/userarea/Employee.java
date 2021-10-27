package userarea;

import confidential.EmployeeSalary;

public class Employee {

	public static void main(String[] args) {
		EmployeeSalary empObj = new EmployeeSalary();
		
		int sal;
		 sal = empObj.getSalary();
		 System.out.println(sal);
	
		 empObj.setSalary(200000);
		 sal = empObj.getSalary();
		 System.out.println(sal);
	
	}
	
}
