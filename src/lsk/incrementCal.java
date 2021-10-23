package lsk;

public class incrementCal {
	public double incrementCal(int age, double afection) {
		double increment = 0;
		if (age > 65) increment=afection*0.5; 
		else if(age >= 45 && age <= 65) increment = afection * 0.3;
		
		return increment;
	}
}
