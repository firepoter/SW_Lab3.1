package isp;

public class calculateIncrement {
	public double calculateIncrementPerAge(pacientAge p, int afection) { 
		if (p.getAge() > 65) 
			return afection * 0.5; 
		else 
			return 0; 
		 }
}
