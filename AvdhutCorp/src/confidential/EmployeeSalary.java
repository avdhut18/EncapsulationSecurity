package confidential;

import java.util.Scanner;

public class EmployeeSalary {

	private int Salary = 100000;

	public int getSalary() {     
		/////use to read the data from specific user///
		 Scanner Security = new Scanner(System.in);
		 String Password;
		 System.out.println("Enter Password :");
		  Password = Security.nextLine();
		  if(Password.equals("avdhut1806"))
			  return Salary;
		  else
		return (Integer) null;
	}

	
	public void setSalary(int Salary) {    
		///use to write the data from specific user/////
		this.Salary = Salary;
	}	
}
