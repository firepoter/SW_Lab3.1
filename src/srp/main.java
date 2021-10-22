package srp;

public class main {

	public static void main(String[] args) {
		covid19Pacient cp= new covid19Pacient("Juan", 53, false); 
		  CardioVascularSymptom c= new CardioVascularSymptom(34, 3); 
		  cp.addSympt(c, 3); 
		  RespiratorySymptom r= new RespiratorySymptom(56, 5); 
		  cp.addSympt(r, 2); 
		  NeuroMuscularSymptom n= new NeuroMuscularSymptom(78, 5); 
		  cp.addSympt(n, 3); 
		  System.out.println("El impacto del paciente Covid "+cp.getName()+ " es "+cp.covid19Impact()); 

	}

}
