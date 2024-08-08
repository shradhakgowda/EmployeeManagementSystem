package com.crimsonlogic;

import com.crimsonlogic.operations.SeniorProgrammerOperations;

public class EmployeeMain  {

	public static void main(String[] args) throws Exception {
		
		SeniorProgrammerOperations pm=new SeniorProgrammerOperations();
		pm.readEmployeeData();
		pm.displayEmployeeData();
		pm.calculateBonus();
		pm.calculateStocks();
	}
}
