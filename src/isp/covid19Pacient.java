package isp;

import java.util.HashMap;
import java.util.Map;

public class covid19Pacient extends pacient{
	
	public covid19Pacient(String name, int age, boolean isAlergic) {
		this.setName(name);
		this.setAge(age);
		this.setAlergic(isAlergic);
	}
	private Map<symptom, Integer> sympt = new HashMap<symptom, Integer>(); 
	
	public void addSymptom(symptom c, Integer weight){ 
		sympt.put(c, weight); 
	} 
			 
	public double covid19Impact() { 
		double afection=0; 
		double increment=0; 
		double impact; 
			 
			  //calculate afection 
			  for (symptom s:sympt.keySet()) 
			   afection=afection+s.getSeverityIndex()*sympt.get(s); 
			 
			  afection=afection/(sympt.size()); 
			 
			   //calculate increment 
			  calculateIncrement incrementCal = new calculateIncrement();
			  increment = incrementCal.calculateIncrementPerAge(this, getAge());
			   
			  //calculate impact 
			  impact= afection+ increment; 
			   
			  return impact; 
	}
	
	public int sanatedDays() {
		int dia = 0;
		for(symptom s:sympt.keySet())
			if(s.getAffectedDays() > dia)
				dia = s.getAffectedDays();
		return dia;
	}
}
