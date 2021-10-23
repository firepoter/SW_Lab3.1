package lsk;

public class neuroMuscularSymptom implements symptom{
	private String name;
	private int covidImpact;
	private int severityIndex;
	private int affectedDays;
	
	public neuroMuscularSymptom(String name, int covidImpact, int severityIndex, int affectedDays) {
		this.name = name;
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
		this.affectedDays = affectedDays;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getSeverityIndex() {
		return severityIndex;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
	public int getAffectedDays() {
		return affectedDays;
	}
	public void setAffectedDays(int affectedDays) {
		this.affectedDays = affectedDays;
	}
	
	public void show(){ 
		System.out.println("symptom value :"+name+" severityIndex :"+ severityIndex+" covidImpact:"+covidImpact); 
	} 
	public void cure(){ 
		System.out.println("treatment applied to: "+affectedDays+ " days"); 
	}

}
