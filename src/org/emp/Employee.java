package org.emp;
import org.client.*; 
import org.company.*;
import org.project.*;
public class Employee  {
	private void empName() {
		System.out.println("swathi");
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empName();
		Client cl = new Client();
		cl.clientName();
		cl.clientName2();
		Company co=new Company();
		co.companyName();
		Project pro = new Project();
		pro.projectName();
	}
}
