
package com.jsp.car.charsy.registration.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax
.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.car.charsy.registration.dto.Car;
import com.jsp.car.charsy.registration.dto.Charsy;
import com.jsp.car.charsy.registration.dto.Regestration;

public class CarDao { 
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nandini");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public Car insertCar(Car car, Charsy charsy,Regestration regestration) {
		entityTransaction.begin();
		entityManager.persist(charsy);
		entityManager.persist(car);
		entityManager.persist(regestration);
		entityTransaction.commit();
		System.out.println("record added");
		return car;
	}
	public Car deleteCar(Car car,Charsy charsy,Regestration regestration) {
		Car car2=entityManager.find(Car.class,car.getId());
		Charsy charsy2=entityManager.find(Charsy.class,charsy.getId());
		Regestration regestration2 =entityManager.find(Regestration.class,regestration.getId());
		entityTransaction.begin();
		entityManager.remove(regestration2);
		entityManager.remove(charsy2);
		entityManager.remove(car2);
		entityTransaction.commit();
		System.out.println("record deleted");
		return car2;
	}
	public Car updateCar(Car car,Charsy charsy,Regestration regestration) {
		Car car2=entityManager.find(Car.class,car.getId());
		Charsy charsy2=entityManager.find(Charsy.class,charsy.getId());
		Regestration regestration2 =entityManager.find(Regestration.class,regestration.getId());
		if(car2!=null) {
			car2.setName(car.getName());
			car2.setBrand(car.getBrand());
			System.out.println("record deleted");
			
		}
		else {
			System.out.println("record not deleted");
		}
		entityTransaction.begin();
		entityManager.merge(car2);
		entityTransaction.commit();
		return car2;
		
		
	}
	public void getAllDetails() {
		String sql1="select car from Car car";
		String sql2="select charsy from Charsy charsy";
		String sql3="select regestration from Regestration regestration";
		Query query1=entityManager.createQuery(sql1);
		Query query2=entityManager.createQuery(sql2);
		Query query3=entityManager.createQuery(sql3);
		
		
		List<Car>cars=query1.getResultList();
		List<Charsy>charsies=query2.getResultList();
		List<Regestration>regestrations=query3.getResultList();
		
		for(Regestration r:regestrations) {
		System.out.println(r.getId());
		System.out.println(r.getRegestration_no());	
		}
		for(Car car:cars) {
			System.out.println(car.getId());
			System.out.println(car.getName());
			System.out.println(car.getBrand());
		}
		for(Charsy c:charsies) {
			System.out.println(c.getId());
			System.out.println(c.getCharsyno());
		}
		
}

	
	

}
