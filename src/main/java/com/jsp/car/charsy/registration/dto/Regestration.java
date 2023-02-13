package com.jsp.car.charsy.registration.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Regestration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long regestration_no;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getRegestration_no() {
		return regestration_no;
	}
	public void setRegestration_no(long regestration_no) {
		this.regestration_no = regestration_no;
	}

}
