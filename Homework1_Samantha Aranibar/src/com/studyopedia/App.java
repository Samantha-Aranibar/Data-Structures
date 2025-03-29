package com.studyopedia;

public class App {
	public static void main(String[] args) {
		CarShowroom showroom = new CarShowroom();
		
		Ford fordCar1 = new Ford("Ford Mustang",55000,2023,true,5);
		Tesla teslaCar1 = new Tesla("Tesla Model 3", 48000,2024,true,350);
		Ford fordCar2 = new Ford("Ford Explorer",40000,2022,false,3);
		Tesla teslaCar2 = new Tesla("Tesla Model S", 90000,2024,true,400);
		Ford fordCar3 = new Ford("Ford F-150",45000,2023,true,6); 
		
		showroom.addCar(fordCar1);
		showroom.addCar(teslaCar1);
		showroom.addCar(fordCar2);
		showroom.addCar(teslaCar2);
		showroom.addCar(fordCar3);
		
		showroom.showInventory();
	}
}
