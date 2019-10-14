package edu.mum.cs425.eRegistrar.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import edu.mum.cs425.eRegistrar.validation.StudentNumberConstraint;

@Entity
@Table(name = "STUDENT")
public class Student {
//
//	studentId : (should be primary key field)
//	   studentNumber: e.g. 000-61-0001 (required)
//	   FirstName: e.g. Anna (required)
//	   MiddleName: (optional)
//	   LastName: e.g. Smith (required)
//	   cgpa: e.g. 3.78 (optional)
//	   enrollmentDate: e.g. 2019-5-12 (required)
//	   isInternational: (values: "Yes", "No") (required) - Hint: Implement/present this data in a drop-down list
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long studentId;
	
	@StudentNumberConstraint( message = "Student Number required, example = 000-61-0001")
	String studentNumber;
	@NotNull(message = "Student First Name required")
	@Size(min = 2, message = "First Name Min size = 2")
	String firstName;  
	String middleName;
	String lastName;   
	float cgpa;  
	@DateTimeFormat(pattern = "yyyy-dd-MM")
	LocalDate dateOfEnrollment; 
	boolean isInternational;
	
	
	public Student()
	{
		
	}
	public Student(String studentNumber, String firstName, String middleName, String lastName, float cgpa,
			LocalDate dateOfEnrollment, boolean isInternational) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
		this.isInternational = isInternational;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}
	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}
	public boolean getIsInternational() {
		return isInternational;
	}
	public void setInternational(boolean isInternational) {
		this.isInternational = isInternational;
	}
	
	
	
}
