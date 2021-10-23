package lsk;

public interface symptom {
	public String getName();
	public void setName(String name);
	public int getCovidImpact();
	public void setCovidImpact(int covidImpact);
	public int getSeverityIndex();
	public void setSeverityIndex(int severityIndex);
	public int getAffectedDays();
	public void setAffectedDays(int affectedDays);
	public void show();
	public void cure();

}
