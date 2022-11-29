package com.learncooking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Admin extends User{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer admin_id;
}
