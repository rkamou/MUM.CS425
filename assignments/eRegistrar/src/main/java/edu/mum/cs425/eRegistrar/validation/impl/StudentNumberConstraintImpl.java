package edu.mum.cs425.eRegistrar.validation.impl;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired; 


import edu.mum.cs425.eRegistrar.service.StudentService;
import edu.mum.cs425.eRegistrar.validation.StudentNumberConstraint;

public class StudentNumberConstraintImpl implements
ConstraintValidator<StudentNumberConstraint, String> {
	StudentService studentService;
	
	public StudentNumberConstraintImpl() {}
	
	@Autowired
	public StudentNumberConstraintImpl(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@Override
    public void initialize(StudentNumberConstraint studentNumber) {
    }
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("\\d+?-\\d+?-\\d+");
		return p.matcher(value).matches(); 
		
//			return (studentService.findByStudentNumber(value).isPresent()) ? false : true; 
//			return (studentService==null) ? false : true; 
			
		
	}

}
