package com.learncooking.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Student extends User{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer student_id;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Course> courses = new ArrayList<>();
		
	@OneToOne(cascade = CascadeType.ALL)
	CookingScore cookingScore;
}	
