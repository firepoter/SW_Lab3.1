package dip;

import java.util.HashMap;
import java.util.Map;

public class covid19Pacient extends pacient{
	
	private final afectionCalT afectioncalt;
	private final incrementCalT incrementcalt;
	
	public covid19Pacient(String name, int age, boolean isAlergic, afectionCalT afectioncalt, incrementCalT incrementcalt) {
		this.setName(name);
		this.setAge(age);
		this.setAlergic(isAlergic);
		this.afectioncalt = afectioncalt;
		this.incrementcalt = incrementcalt;
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
			  afection = afectioncalt.affectionCal(sympt);
			 
			   //calculate increment 
			  increment = incrementcalt.incrementCalc(getAge(), afection);
			   
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
