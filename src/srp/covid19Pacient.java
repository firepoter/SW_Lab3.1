package srp;

import java.util.HashMap;
import java.util.Map;

public class covid19Pacient extends Pacient{
	private Map<symptom, Integer> sympt=new HashMap<symptom, Integer>(); 
	
	public covid19Pacient(String name, int age, boolean isAlergic) {
		this.setName(name);
		this.setAge(age);
		this.setAlergic(isAlergic);
	}
			 
	public void addSympt(symptom c, Integer weight){
		sympt.put(c, weight); 
	}
			 
	public double covid19Impact() { 
			  double afection=0; 
			  double increment=0; 
			  double impact; 
			 
			  //calculate afection 
			  afectionCal afectionCalculator = new afectionCal();
			  afection = afectionCalculator.calculateAfection(sympt);
			 
			   //calculate increment 
			  incrementCal incrementCalculator = new incrementCal();
			  increment = incrementCalculator.calculateIncrement(getAge(), afection);
			   
			  //calculate impact 
			  impact= afection+ increment; 
			   
			  return impact; 
	}
	
	public int sanatedDays() {
		int days = 0;
		
		for(symptom c:sympt.keySet()) {
			if(c.getAffectedDays()>days)
				days = c.getAffectedDays();
		}
		
		return days;
	}

}
