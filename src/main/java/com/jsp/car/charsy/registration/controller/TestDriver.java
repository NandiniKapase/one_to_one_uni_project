package com.jsp.car.charsy.registration.controller;

import com.jsp.car.charsy.registration.dto.Car;
import com.jsp.car.charsy.registration.dto.Charsy;
import com.jsp.car.charsy.registration.dto.Regestration;
import com.jsp.car.charsy.registration.service.CarService;

public class TestDriver {

	public static void main(String[] args) {
//		Charsy charsy=new Charsy();
//		charsy.setCharsyno("1234");
//		Regestration  regestration=new Regestration();
//		regestration.setRegestration_no(1234567890l);
//		Car car=new Car();
//		car.setName("toyota");
//		car.setBrand("fortuner");
//		car.setCharsy(charsy);
//		car.setRegestration_no(regestration);
//		CarService carService =new CarService();
//		carService.insertCar(car, charsy, regestration);
	//deleting  a record	
//		Charsy charsy2=new Charsy();
//		charsy2.setId(1);
//		Regestration regestration2=new Regestration();
//		regestration2.setId(1);
//		Car car2=new Car();
//		car2.setId(1);
//		CarService carService2=new CarService();
//		carService2.deleteCar(car2, charsy2, regestration2);
//		
//		Charsy charsy3=new Charsy();
//		Regestration regestration3=new Regestration();
//		Car car3=new Car();
//		car3.setName("tata");
//		car3.setBrand("tiago");
//		car3.setId(2);
//		CarService carService=new CarService();
//		carService.updateCar(car3, charsy3, regestration3);
//		
	
	//getting all records
	CarService carService4=new CarService();
	carService4.getAllDetails();

}
}