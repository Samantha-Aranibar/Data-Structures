package com.studyopedia;

abstract class Car {

	//Private attributes
	private String modelName;
	private double price;
	private int year;
	
	//Constructor
	public Car(String modelName, double price,int year) {
		this.modelName = modelName;
		this.price = price;
		this.year = year;
	}
	
	//Gets
	public String getModelName() {
		return modelName;
	}
	public double getPrice() {
		return price;
	}
	public int getYear() {
		return year;
	}
	
	public abstract void showCarDetails();
}
