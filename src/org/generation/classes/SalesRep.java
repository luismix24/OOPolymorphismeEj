package org.generation.classes;

public class SalesRep {
	double salesMade;

	public SalesRep(double salesMade) {
		super();
		this.salesMade = salesMade;
	}//constructor
	
	   public double calculateComission(){
		   return 0.1 * salesMade;
		   }

}
