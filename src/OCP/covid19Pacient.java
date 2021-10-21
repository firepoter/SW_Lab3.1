package OCP;

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
			  for (symptom c:sympt.keySet()) 
				  afection=afection+c.getSeverityIndex()*sympt.get(c); 
			 
			  afection=afection/(sympt.size()); 
			 
			   //calculate increment 
			  if (getAge()> 65) increment=afection*0.5; 
			   
			  //calculate impact 
			  impact= afection+ increment; 
			   
			  return impact; 
			 } 

}
