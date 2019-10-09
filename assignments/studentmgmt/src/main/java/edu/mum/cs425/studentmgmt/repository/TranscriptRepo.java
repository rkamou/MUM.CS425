package edu.mum.cs425.studentmgmt.repository;

import org.springframework.data.repository.CrudRepository;
 
import edu.mum.cs425.studentmgmt.model.Transcript;

public interface TranscriptRepo extends CrudRepository<Transcript, Long> {

}
