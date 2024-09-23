package org.generation;
import org.generation.classes.SalesManager;
import org.generation.classes.SalesRep;

public class Main {

	public static void main(String[] args) {
		SalesManager manager = new SalesManager("Michael","Scott",1000,45,152,0,950.25,15,2500);
		manager.addSalesRep(new SalesRep("Luis","Ramirez",2501,29,152,0,350.15,3,2500));
		
		System.out.println(manager.getSalary()+ manager.calculateBonus());
		
		System.out.println(manager.getSalesRep(2501).calculateComission());
		
		manager.printSalesTeamInfo();

	}//main

}//class Main
