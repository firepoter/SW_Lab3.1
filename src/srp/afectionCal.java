package srp;

import java.util.Map;

public class afectionCal {
	public double calculateAfection(Map<symptom, Integer> sympt) {
		double afection = 0;
		for (symptom c:sympt.keySet()) 
			  afection=afection+c.getSeverityIndex()*sympt.get(c); 
		 
		  afection=afection/(sympt.size()); 
		  return afection;
	}

}
