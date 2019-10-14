package edu.mum.cs425.eRegistrar.service;

import java.util.List;
import java.util.Optional;

import edu.mum.cs425.eRegistrar.model.Student;

public interface StudentService {
	public Student findById(long id);
	public Optional<Student> findByStudentNumber(String studentNumber);
	public List<Student> findAll();
	public void delete(Student student);
	public void delete(long studentId);
	public Student save(Student student);	
	public Student update(Student student);
	
}
