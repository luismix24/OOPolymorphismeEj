package org.generation.classes;
import java.util.HashMap;

public class SalesManager extends SalesRep {
	
	private HashMap<Integer, SalesRep> salesTeam = new HashMap<Integer, SalesRep>();
	
	public SalesManager(String firsName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firsName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
	}//constructor
	
	   public double calculateComission(){
		      double total = 0;
		      for(SalesRep salesRep: salesTeam.values()) {
		    	  total += salesRep.getSalesMade();
		    	  
		      }//foreach
		      return 0.03 * total;
		   }//calculateComission
	   public void addSalesRep(SalesRep salesRep) {
		   salesTeam.put(salesRep.getRegistration(), salesRep);
	   }//addSalesRep
	   
	   public SalesRep getSalesRep(int registration) {
		   return salesTeam.get(registration);
	   }//getSalesRep
	   
	   public void printSalesTeamInfo() {
		   for(SalesRep salesRep: salesTeam.values()) {
			   System.out.println(salesRep);
		   }//foreach
	   }//printSalesTeamInfo

}// class Manager
