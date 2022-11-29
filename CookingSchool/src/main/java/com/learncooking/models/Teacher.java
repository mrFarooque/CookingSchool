package com.learncooking.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Teacher extends User{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer teacher_id;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Course> courses = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Lecture> lectures = new ArrayList<>();
}
