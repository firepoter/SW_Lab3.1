package isp;

public class main {

	public static void main(String[] args) {
		person per = new person("Xabier", 35);
		per.calculateIncrementPerAge(per, 40);
		
		covid19Pacient cp= new covid19Pacient("Juan", 53, false); 
		symptom c= new cardioVascularSymptom("Dolor pecho", 34, 3, 32); 
		cp.addSymptom(c, 3); 
		symptom r= new respiratorySymptom("Silvido", 56, 5, 15); 
		cp.addSymptom(r, 2); 
		symptom n= new neuroMuscularSymptom("Dificultad Hablar", 78, 5, 20); 
		cp.addSymptom(n, 3); 
		System.out.println("El impacto del paciente Covid "+cp.getName() + " es "+cp.covid19Impact()); 
		System.out.println("El dia que se requiere para recuperar del paciente Covid "+cp.getName() + " es "+cp.sanatedDays());

	}

}
