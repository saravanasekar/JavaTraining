package com.dal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	public long addrId;
	public int doorNo;
	public String street;
	public String city;
	public int pincode;
	
	@ManyToOne
	@JoinColumn(name="eid", referencedColumnName = "EID")
	public Employee employee;

	public long getAddrId() {
		return addrId;
	}

	public void setAddrId(long addrId) {
		this.addrId = addrId;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Address(long addrId, int doorNo, String street, String city, int pincode, Employee employee) {
		super();
		this.addrId = addrId;
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.employee = employee;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", doorNo=" + doorNo + ", street=" + street + ", city=" + city
				+ ", pincode=" + pincode + ", employee=" + employee + "]";
	}
	
	
}
