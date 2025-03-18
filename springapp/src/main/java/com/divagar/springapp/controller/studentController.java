package com.divagar.springapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.divagar.springapp.Entity.student;
import com.divagar.springapp.service.studentService;

@RestController
public class studentController 
{
	@Autowired
	studentService stdService;

	@PostMapping("/post/student")
	public ResponseEntity<?> createStudent(@RequestBody student s)
	{
		return new ResponseEntity<>(stdService.createStudent(s),HttpStatus.CREATED);
	}

	@GetMapping("/get/student")
	public ResponseEntity<List<student>> getAllStudents()
	{
		return new ResponseEntity<>(stdService.getAllStudents(),HttpStatus.OK);
	}

	@PutMapping("/put/student/{id}")
	public ResponseEntity<?> updateStudent(@PathVariable Long id,@RequestBody student S)
	{
		return new ResponseEntity<>(stdService.updateStudent(id,S),HttpStatus.OK);
	}

	@DeleteMapping("/delete/student/{id}")
public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
    try {
        boolean deleted = stdService.deleteStudent(id);
        if (deleted) {
            return ResponseEntity.ok("Student deleted successfully"); // HTTP 200 with message
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found"); // HTTP 404
        }
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting student"); // HTTP 500
    }
}

}
