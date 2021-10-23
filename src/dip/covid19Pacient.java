package dip;

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
		double impact = 0; 
			 
			  //calculate afection 
			  afectionCal afectionCalculator = new afectionCal();
			  afection = afectionCalculator.affectionCal(sympt);
			 
			   //calculate increment 
			  incrementCal incrementCalculator = new incrementCal();
			  increment = incrementCalculator.incrementCal(getAge(), afection);
			   
			  //calculate impact 
			  if(getAge() >= 10)
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
	
	public void showSymptoms(){ 
		for (symptom s: sympt.keySet()) 
			s.show(); 
	}
	
	public void cure(){ 
		for (symptom s: sympt.keySet()) 
			s.cure(); 
		 }
}
