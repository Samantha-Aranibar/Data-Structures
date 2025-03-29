package com.studyopedia;
import java.util.ArrayList;
import java.util.List;

class CarShowroom implements IShowroom{
	private List<Car> inventory;
	private int carCount;
	
	public CarShowroom() {
		this.inventory = new ArrayList<>();
		this.carCount = 0;
	}
	
	public void addCar(Car car) {
		if (carCount < MAX_NUM_OF_CARS) {
			inventory.add(car);
			carCount++;
			System.out.println(car.getModelName() + " added to the showroom.");
		} else {
			System.out.println("Cannot add this car, inventory full!");
		}
	}
	
	public void showInventory() {
		System.out.println("Total number of cars in the showroom: " + carCount);
		for (Car car : inventory) {
			car.showCarDetails();
			System.out.println();
		}
	}
}