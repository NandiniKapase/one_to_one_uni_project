package com.jsp.car.charsy.registration.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Charsy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String charsyno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCharsyno() {
		return charsyno;
	}
	public void setCharsyno(String charsyno) {
		this.charsyno = charsyno;
	}

}
