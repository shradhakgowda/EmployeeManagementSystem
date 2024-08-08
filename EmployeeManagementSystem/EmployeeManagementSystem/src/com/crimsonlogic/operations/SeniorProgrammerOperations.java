package com.crimsonlogic.operations;

public class SeniorProgrammerOperations extends ProgrammerOperations {

	public void calculateStocks() throws Exception
	{
		System.out.println("enter the yrs of experiece to get the stocks:");
		if(em.getExperience_yrs()<45&&em.getExperience_yrs()>5)
		{
			em.setStocks(em.getExperience_yrs()*50);
			System.out.println("total number of stocks user holds  "+em.getStocks());
		}
		else
		{
			try
			{
				throw new NotEligibleForStocksException("not eligible for stocks if experience is lesser than ");
			}catch(NotEligibleForStocksException e)
			{
				System.out.println(e.toString());
			}
					
		}
			
		
		
	}
}
