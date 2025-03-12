package com.divagar.springapp.Entity;

import jakarta.persistence.*;

@Entity
public class City 
{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String name;

	@OneToOne(mappedBy = "city")
	private student std;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public student getStd() {
		return std;
	}

	public void setStd(student std) {
		this.std = std;
	}

	public City(Long id, String name, student std) {
		this.id = id;
		this.name = name;
		this.std = std;
	}

	public City() {
	}


	
}
