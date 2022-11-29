package com.learncooking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Lecture {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer lecture_id;
	private String duration;
	//lectures can be in video format ...
}
