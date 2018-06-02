package com.ar.dao;

import java.util.List;

import com.ar.model.Student;

public interface StudentDao {

	
	public void create(Student student);
	public void delete(int id);
	public List<Student> getAllStudents();
}
