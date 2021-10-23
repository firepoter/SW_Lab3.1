package dip;

import java.util.Map;

public class afectionCal {
	public double affectionCal(Map<symptom, Integer> sympt) {
		double afection = 0;
		int element = 0;
		for (symptom s:sympt.keySet()) 
			if(s.getCovidImpact() > 50) {
				afection=afection+s.getSeverityIndex()*sympt.get(s);
				element++;
			} 
		afection=afection/element; 
		return afection;
	}

}
