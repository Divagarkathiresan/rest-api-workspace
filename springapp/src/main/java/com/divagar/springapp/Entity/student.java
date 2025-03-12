package com.divagar.springapp.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class student 
{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	@Column(name = "student_name")
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "city_id" , referencedColumnName = "id")
	private City city;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public City getCity() {
		return city;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public student(Long id, String name, City city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public student() {
	}

	

}
