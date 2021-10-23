package dip;

public class main {

	public static void main(String[] args) {
		covid19Pacient cp= new covid19Pacient("Juan", 53, false); 
		symptom c= new cardioVascularSymptom("Dolor pecho", 34, 3, 32); 
		cp.addSymptom(c, 3); 
		symptom r= new respiratorySymptom("Silvido", 56, 5, 15); 
		cp.addSymptom(r, 2); 
		symptom n= new neuroMuscularSymptom("Dificultad Hablar", 78, 5, 20); 
		cp.addSymptom(n, 3); 
		symptom t = new showOnlySymptom("Depresion", 62, 4, 10);
		cp.addSymptom(t, 1);
		cp.showSymptoms();
		cp.cure();
		System.out.println("El impacto del paciente Covid "+cp.getName() + " es "+cp.covid19Impact()); 
		System.out.println("El dia que se requiere para recuperar del paciente Covid "+cp.getName() + " es "+cp.sanatedDays());

	}

}
