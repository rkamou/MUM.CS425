package edu.mum.cs425.studentmgmt.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.cs425.studentmgmt.model.Classroom; 

public interface ClassromRepo extends CrudRepository<Classroom, Long>{

}
