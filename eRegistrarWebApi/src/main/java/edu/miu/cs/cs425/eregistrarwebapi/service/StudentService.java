package edu.miu.cs.cs425.eregistrarwebapi.service;

import edu.miu.cs.cs425.eregistrarwebapi.dto.StudentRequest;
import edu.miu.cs.cs425.eregistrarwebapi.model.Student;

import java.util.List;

public interface StudentService {

	public abstract List<Student> getAllStudents();
   
	public abstract Student registerStudent(StudentRequest studentRequest);
	public abstract Student getStudentById(Integer studentId);
	 Student updateStudentById(StudentRequest studentRequest, Integer studentId);
    void removeStudentById(Integer studentId);
}
