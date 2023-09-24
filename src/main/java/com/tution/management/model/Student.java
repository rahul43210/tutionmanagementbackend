package com.tution.management.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
}
