package com.crimsonlogic.operations;

import java.util.Scanner;

import com.crimsonlogic.singlelevel.Programmer;
import com.crimsonlogic.singlelevel.SeniorProgrammer;

public class EmployeeOperations {
	Scanner in =new Scanner(System.in);
	SeniorProgrammer em=new SeniorProgrammer();
	public void readEmployeeData()
	{
		System.out.println("Enter employee details");
		System.out.println("Enter employee id:");
		em.setEmployeeId(new Double((Math.random())*1000).toString());
		System.out.println("Enter employee name");
		em.setEmployeeName(in.nextLine());
		System.out.println("Enter employee address");
		em.setEmployeeAdress(in.next());
		System.out.println("Enter employee salary");
		em.setSalary(in.nextFloat());
		
		
	}
	public void displayEmployeeData()
	{
		System.out.println("Display employee details");
		System.out.println(" employee id :"+em.getEmployeeId());
		System.out.println(" employee name :"+em.getEmployeeName());
		System.out.println(" employee address :"+em.getEmployeeAdress());
		System.out.println(" employee Salary :"+em.getSalary());
		
	}
	
}
