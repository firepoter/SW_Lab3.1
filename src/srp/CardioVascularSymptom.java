package srp;

public class CardioVascularSymptom implements symptom{
	private int covidImpact;
	private int severityIndex;
	private int affectedDays;
	
	public CardioVascularSymptom(int covidImpact, int severityIndex) {
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
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
	

}