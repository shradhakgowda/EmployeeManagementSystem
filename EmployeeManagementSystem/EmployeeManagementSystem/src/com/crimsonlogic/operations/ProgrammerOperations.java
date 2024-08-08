package com.crimsonlogic.operations;

import java.util.Scanner;

public class ProgrammerOperations extends EmployeeOperations{
Scanner in =new Scanner(System.in);
public void calculateBonus()
{
	System.out.println("Enter the activity points");
	em.setPoint(in.nextInt());
	em.setBonus(em.getPoint()*(int)(em.getSalary()/10));
	System.out.println("bonus is:"+em.getBonus());
	
}
}
