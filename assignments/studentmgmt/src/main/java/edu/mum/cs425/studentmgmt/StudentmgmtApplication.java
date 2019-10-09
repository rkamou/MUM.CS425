package edu.mum.cs425.studentmgmt;
 

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs425.studentmgmt.model.Classroom;
import edu.mum.cs425.studentmgmt.model.Student;
import edu.mum.cs425.studentmgmt.model.Transcript;
import edu.mum.cs425.studentmgmt.repository.ClassromRepo;
import edu.mum.cs425.studentmgmt.repository.StudentRepo;
import edu.mum.cs425.studentmgmt.repository.TranscriptRepo;

@SpringBootApplication
public class StudentmgmtApplication  implements CommandLineRunner {
	
	@Autowired
	StudentRepo studentRepo;
	@Autowired
	ClassromRepo classromRepo;
	@Autowired
	TranscriptRepo transcriptRepo;
	
	Classroom classroom;
	Transcript transcript;
	public static void main(String[] args) {
		System.out.println("***************************   ***** Start Program **** *************************** ");
		SpringApplication.run(StudentmgmtApplication.class, args);
		System.out.println("***************************   ***** End Program **** *************************** ");
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("\t\t\t\t +++++++++++++++\t Call Run Method\t\t\t\t +++++++++++++++");
		
		initData();
		
		Student student = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45f, new Date(2019,5,24));
		student.setClassRoom(classroom);
		student.setTranscript(transcript);
		
		studentRepo.save(student);
    }
	
	public void initData() {
		classroom = classromRepo.save(new Classroom("McLaughlin building", "M105"));
		transcript = transcriptRepo.save(new Transcript("BS Computer Science"));
	}
	
}
