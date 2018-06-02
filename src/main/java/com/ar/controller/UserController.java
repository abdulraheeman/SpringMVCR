package com.ar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ar.dao.StudentDao;
import com.ar.model.Student;

@Controller
public class UserController {
	
	@Autowired
	StudentDao studentDao;
    
	@RequestMapping(name="/student")
	public ModelAndView homePage() {
		return new ModelAndView("student", "command", new Student());
	}
	@RequestMapping(name="/save",method=RequestMethod.POST )
	public ModelAndView addStudent(@ModelAttribute("student") Student student) {
            studentDao.create(student);
		return new ModelAndView("redirect:/viewStudent");
	}
	
	@RequestMapping(name="/delete/{id}",method=RequestMethod.GET)
	public ModelAndView deleteStudent(@PathVariable int id) {
		studentDao.delete(id);
		return new ModelAndView("redirect:/viewStudent");
	}
	
}
