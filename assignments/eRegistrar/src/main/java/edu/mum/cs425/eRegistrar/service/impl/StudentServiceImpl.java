package edu.mum.cs425.eRegistrar.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs425.eRegistrar.model.Student;
import edu.mum.cs425.eRegistrar.reposiroty.StudentRepo;
import edu.mum.cs425.eRegistrar.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired StudentRepo studentRepo;

	@Override
	public Student findById(long id) {
		// TODO Auto-generated method stub
			return studentRepo.findById(id).orElse(null);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return (ArrayList<Student>)studentRepo.findAll();
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		try {
			studentRepo.delete(student);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void delete(long studentId) {
		// TODO Auto-generated method stub
		try {
			studentRepo.delete(this.findById(studentId));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Optional<Student> findByStudentNumber(String studentNumber) {
		// TODO Auto-generated method stub
		return studentRepo.findByStudentNumber(studentNumber);
	}
	
}
