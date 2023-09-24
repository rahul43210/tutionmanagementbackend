package com.tution.management.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer id;
	
	@Column(name = "DEPARTMENT_NAME", nullable = false, unique = true)
	private String departmentName;
	
	@Column(name = "DEPARTMENT_ID", nullable = false, unique = true)
	private String departmentId;
	
	@ManyToOne
	@JoinColumn(name = "HOD", nullable = true)
	private Employee hod;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "CREATE_DATE")
	private LocalDate departmentCreateTime;
	
	@Column(name = "CLOSE_DATE")
	private LocalDate departmentDeleteTime;
	
	@Column(name = "IS_ACTIVE")
	private Boolean isActive;
	
	@Column(name = "IS_DELETED")
	private Boolean isDeleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public Employee getHod() {
		return hod;
	}

	public void setHod(Employee hod) {
		this.hod = hod;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDepartmentCreateTime() {
		return departmentCreateTime;
	}

	public void setDepartmentCreateTime(LocalDate departmentCreateTime) {
		this.departmentCreateTime = departmentCreateTime;
	}

	public LocalDate getDepartmentDeleteTime() {
		return departmentDeleteTime;
	}

	public void setDepartmentDeleteTime(LocalDate departmentDeleteTime) {
		this.departmentDeleteTime = departmentDeleteTime;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}
