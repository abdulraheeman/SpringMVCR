package com.ar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ar.model.Student;

public class StudentDaoImpl implements StudentDao {
  
     
	JdbcTemplate jdbcTemplate;

	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void create(Student student) {
		String query="insert into student values("+student.getId()+",'"+student.getName()+"','"+student.getAddress()+"','"+student.getAddress()+"','"+student.getMarks()+"')";
    	jdbcTemplate.update(query);
    }
    
    public void delete(int id) {
    	String query="delete from student where id="+id+"";
    	jdbcTemplate.update(query);
    }
    
    public List<Student> getAllStudents(){
    	
    	
    	return jdbcTemplate.query("select * from student", new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setMarks(rs.getDouble(4));
				s.setAddress(rs.getString(3));
				return s;
			}
    		
		});
    }
}
