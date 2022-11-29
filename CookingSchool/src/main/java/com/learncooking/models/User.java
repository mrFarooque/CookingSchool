package com.learncooking.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import lombok.Data;

@MappedSuperclass
@Data
public class User {
	private String name;
	private String email;
	private String mobile;
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Address> address = new HashSet<>();
}
