package com.jsp.car.charsy.registration.service;

import com.jsp.car.charsy.registration.dao.CarDao;
import com.jsp.car.charsy.registration.dto.Car;
import com.jsp.car.charsy.registration.dto.Charsy;
import com.jsp.car.charsy.registration.dto.Regestration;

public class CarService {
	CarDao carDao=new CarDao();
	public Car insertCar(Car car,Charsy charsy,Regestration regestration) {
		return carDao.insertCar(car, charsy, regestration);
	}
	
	public Car deleteCar(Car car,Charsy charsy,Regestration regestration) {
		return carDao.deleteCar(car, charsy, regestration);
	}


	public Car updateCar(Car car,Charsy charsy,Regestration regestration) {
	 return carDao.updateCar(car, charsy, regestration);
}
	public void getAllDetails() {
		carDao.getAllDetails();
	}
}
