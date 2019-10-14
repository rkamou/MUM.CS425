package edu.mum.cs425.eRegistrar.reposiroty;

import org.springframework.stereotype.Repository;

import edu.mum.cs425.eRegistrar.model.Student;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
	public Optional<Student> findByStudentNumber(String studentNumber);
}
