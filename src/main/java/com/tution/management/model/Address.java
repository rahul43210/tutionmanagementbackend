package com.tution.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer id;
	
	@Column(name = "HOUSE_NUMBER")
	private String hourseNumber;
	
	@Column(name = "ADDRESS_LINE_FIRST")
	private String addressFirstLine;
	
	@Column(name = "ADDRESS_LINE_SECOND")
	private String addressSecondLine;
	
	@Column(name = "LOCALITY")
	private String locality;
	
	@Column(name = "AREA_NAME")
	private String areaName;
	
	@Column(name = "CITY", nullable = false)
	private String city;
	
	@Column(name = "STATE", nullable = false)
	private String state;
	
	@Column(name = "COUNTRY", nullable = false)
	private String country;
	
	@Column(name = "PINCODE", nullable = false)
	private Long pinCode;
	
	@Column(name = "RES_PHONE_NUMBER")
	private Long residentalPhoneNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHourseNumber() {
		return hourseNumber;
	}

	public void setHourseNumber(String hourseNumber) {
		this.hourseNumber = hourseNumber;
	}

	public String getAddressFirstLine() {
		return addressFirstLine;
	}

	public void setAddressFirstLine(String addressFirstLine) {
		this.addressFirstLine = addressFirstLine;
	}

	public String getAddressSecondLine() {
		return addressSecondLine;
	}

	public void setAddressSecondLine(String addressSecondLine) {
		this.addressSecondLine = addressSecondLine;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getPinCode() {
		return pinCode;
	}

	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}

	public Long getResidentalPhoneNumber() {
		return residentalPhoneNumber;
	}

	public void setResidentalPhoneNumber(Long residentalPhoneNumber) {
		this.residentalPhoneNumber = residentalPhoneNumber;
	}
}
