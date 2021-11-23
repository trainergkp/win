package com.dxc.HiberOneToManyPro1.persist;

import javax.persistence.*;

@Entity
@Table(name="mtm1")
public class Address {
	@Id
	@Column(name="hno", length=10)
	private int hno;
	@Column(name="colony", length=10)
	private String colony;
	@Column(name="city", length=10)
	private String city;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
