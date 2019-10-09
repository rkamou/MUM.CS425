package edu.mum.cs425.studentmgmt.repository;

import org.springframework.stereotype.Repository;

import edu.mum.cs425.studentmgmt.model.Student;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {

}
