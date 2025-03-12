package com.divagar.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divagar.springapp.Entity.student;
import com.divagar.springapp.Repository.studentRepository;

@Service
public class studentService 
{
	@Autowired
	studentRepository stdRepo;

	public student createStudent(student s)
	{
		return stdRepo.save(s);
	}

	public List<student> getAllStudents()
	{
		return stdRepo.findAll();
	}
}
