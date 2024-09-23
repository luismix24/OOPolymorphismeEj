package org.generation.classes;

public class SalesRep extends Employee {
	private double salesMade;
	
	   public SalesRep(String firsName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firsName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}//constructor
	   
	   public double calculateComission(){
		   return 0.1 * salesMade;
		   }
	   
	public double getSalesMade() {
		return salesMade;
	}

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}

	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", getFirsName()=" + getFirsName() + ", getLastName()="
				+ getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge()
				+ ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken()
				+ ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked() + ", timeToRetirement()="
				+ timeToRetirement() + ", vacationTimeLeft()=" + vacationTimeLeft() + ", calculateBonus()="
				+ calculateBonus() + "]";
	}//toString

}

