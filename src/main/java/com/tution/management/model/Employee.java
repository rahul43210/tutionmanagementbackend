package com.tution.management.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer id;
	
	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@OneToOne
	@JoinColumn(name = "CURRENT_ADDRESS")
	private Address currentAddress;
	
	@OneToOne
	@JoinColumn(name = "CURRENT_ADDRESS")
	private Address permanentAddress;
	
	@Column(name = "PHONE_NUMBER")
	private Long phoneNumber;
	
	@Column(name = "ALTERNATE_PHONE_NUMBER")
	private Long alternatePhoneNumber;
	
	@Column(name = "EMPLOYEE_ID", unique = true, nullable = false)
	private String employeeID;
	
	@ManyToOne
	@JoinColumn(name = "DEPARTMENT")
	private Department department;
	
	@Column(name = "JOINING_DATE", nullable = false)
	private LocalDate joiningDate;
	
	@Column(name = "EXIT_DATE")
	private LocalDate exitDate;
	
	@Column(name = "NATIONAL_ID", unique = true, nullable = false)
	private String nationalId;
	
	@Column(name = "IS_EMPLOYEE_ACTICE", nullable = false, columnDefinition = "boolean default true")
	private Boolean isEmployementActive;
	
	@Column(name = "IS_DELETED", nullable = false, columnDefinition = "boolean default false")
	private Boolean isDeleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getAlternatePhoneNumber() {
		return alternatePhoneNumber;
	}

	public void setAlternatePhoneNumber(Long alternatePhoneNumber) {
		this.alternatePhoneNumber = alternatePhoneNumber;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public LocalDate getExitDate() {
		return exitDate;
	}

	public void setExitDate(LocalDate exitDate) {
		this.exitDate = exitDate;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public Boolean getIsEmployementActive() {
		return isEmployementActive;
	}

	public void setIsEmployementActive(Boolean isEmployementActive) {
		this.isEmployementActive = isEmployementActive;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}
