package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Person;
import id.ac.undiksha.siak.entities.Student;
import id.ac.undiksha.siak.entities.Lecturer;
import id.ac.undiksha.siak.entities.Staff;

public class Main {

	public static void main(String[] args) {
//		Student std1 = new Student();
//		std1.setName("Tegar");
//		std1.printAllInfo();
		
//		Student std2 = new Student(
//			"2115101032",
//			"Tegar",
//			"Gilimanuk",
//			false,
//			"Computer Science",
//			"Technical Information",
//			"Technical and Vocational"
//		);
//		std2.printAllInfo();	
	
//		Lecturer lect1 = new Lecturer(
//			"198806222015041003",
//			"Yudhi Paramartha",
//			"Singaraja",
//			true,
//			"Computer Science",
//			"Technical Information",
//			"Technical and Vocational",
//			"Koorprodi"
//		);
//		lect1.printAllInfo();
		
//		Staff staff1 = new Staff(
//				"221123456789103",
//				"Clark Kent",
//				"Denpasar",
//				true,
//				"UPT TIK"
//		);
//		staff1.printAllInfo();
		
//		Person prs1 = new Person();
//		prs1.setName("Samjoe");
//		System.out.printIn(prs1.getName());
		
//		Student std1 = new Student();
//		std1.setNim("2115101032");
//		std1.printAllInfo();
//		System.out.println(std1.getName());
		
//		Person siX = new Student();
//		siX.getName();

//		Student siY = new Person();
//		siY.getFaculty();
		
//		person siY = new Person("Tifa", "Singaraja", false);
		Student siZ = new Student("220304", "ILKOM", "TI", "FTK");
		Student siA = new Student ("Tifa", "Singaraja", false, "12345", "ILKOM", "TI", "FTK");
		siA.printAllInfo();		
	}
}