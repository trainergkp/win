package com.dxc.HiberOneToManyPro1.persist;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="mtm2")
public class Employee {
	@Id
	@Column(name="empcode", length=10)
	private int empcode;
	@Column(name="empname", length=10)
	private String empname;
	@Column(name="designation", length=10)
	private String designation;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Address> address;
	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

}
