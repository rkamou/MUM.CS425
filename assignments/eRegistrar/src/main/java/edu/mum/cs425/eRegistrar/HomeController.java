package edu.mum.cs425.eRegistrar;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.mum.cs425.eRegistrar.model.Student;
import edu.mum.cs425.eRegistrar.service.StudentService;

@Controller
public class HomeController {

	@Autowired StudentService studentService;
	
	@GetMapping(value= {"/","/home"})
	public String homePage(Model model) {
		studentService.save(new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45f,  LocalDate.of(2019,12,12), true));
		studentService.save(new Student("000-61-0002", "Romuald", "Kamou", "Pogo", 3.85f,  LocalDate.of(2019,12,12), true));
//		if(studentService.findByStudentNumber("000-61-0001")!=null) {
//			System.out.println();
//			System.out.println("findByStudentNumber is Ok");
//		}
		return "redirect:/student/";
	}
	 
}
