package com.studyopedia;

class Ford extends Car{

	//attributes
	private boolean isEcoBoost;
	private int warrantyYears;
	
	//constructor
	public Ford(String modelName, double price, int year, boolean isEcoBoost, int warrantyYears) {
		super(modelName,price,year);
		
		this.isEcoBoost = isEcoBoost;
		this.warrantyYears = warrantyYears;
	}
	
	//Get
	public boolean isEcoBoost() {
		return isEcoBoost;
	}
	public int getWarrantyYears() {
		return warrantyYears;
	}
	
	//Abstract Method
	public void showCarDetails() {
		System.out.println("Ford Model: " + getModelName());
		System.out.println("Price: $" + getPrice());
		System.out.println("Year: " + getYear());
		System.out.println("EcoBoost: " + (isEcoBoost ? "Yes" : "No"));
		System.out.println("Warranty: " + warrantyYears + " years");
	}
}
