package srp;

public class incrementCal {
	public double calculateIncrement(int age, double afection) {
		double increment = 0;
		if(age > 65)
			increment = afection * 0.5;
		return increment;
	}

}
