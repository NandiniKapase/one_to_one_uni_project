package com.jsp.car.charsy.registration.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String brand;
	@OneToOne
	private Charsy charsy;
	@OneToOne
	private Regestration regestration_no;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Charsy getCharsy() {
		return charsy;
	}
	public void setCharsy(Charsy charsy) {
		this.charsy = charsy;
	}
	public Regestration getRegestration_no() {
		return regestration_no;
	}
	public void setRegestration_no(Regestration regestration_no) {
		this.regestration_no = regestration_no;
	}
	
	
	

}
