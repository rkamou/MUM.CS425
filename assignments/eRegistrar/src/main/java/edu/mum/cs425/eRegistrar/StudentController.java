package edu.mum.cs425.eRegistrar;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.mum.cs425.eRegistrar.model.Student;
import edu.mum.cs425.eRegistrar.service.StudentService;

@Controller
@RequestMapping( "/student")
public class StudentController {
	@Autowired StudentService studentService;
	
	@GetMapping(value= {"","/","/list"})
	public String listPage(Model model) { 
		return "index";
	}
	
	@GetMapping(value = "/delete/{id}")
	public String delete(@PathVariable("id") Integer id, Model model) {
		studentService.delete(id); 
		return "index";
	}
	
	@GetMapping(value = "/add")
	public String initAddNewUserForm(Model model) {
		model.addAttribute("newStudent", new Student());
		return "index";
	}
	
	@PostMapping(value = "/add")
	public String saveAddNewUserForm(@Valid @ModelAttribute("newStudent")  Student newStudent,BindingResult result, Model model) {
		if(!result.hasErrors()) {
			studentService.save(newStudent);
			return "redirect:/student/";
		}
//		model.addAttribute("errors", result.getAllErrors());
		return "index";
	}
	
	@GetMapping(value = "/edit/{id}")
	public String initEditNewUserForm(@ModelAttribute("id") long id,Model model) {
		model.addAttribute("newStudent", studentService.findById(id));
		return "index";
	}
	
	
	@ModelAttribute(value = "newStudent")
	public Student newStudent()
	{
	    return new Student();
	}
	
	@ModelAttribute(value = "students")
	public List<Student> listStudent ()
	{
	    return studentService.findAll();
	}
	
}
