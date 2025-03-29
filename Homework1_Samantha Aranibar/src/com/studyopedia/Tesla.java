package com.studyopedia;

class Tesla extends Car{
	
	//Attributes
	private boolean autopilotEnabled;
	private int batteryLife;
	
	//Constructor
	public Tesla(String modelName, double price, int year, boolean autopilotEnabled, int batteryLife) {
		super(modelName, price, year);
		this.autopilotEnabled = autopilotEnabled;
		this.batteryLife = batteryLife;
	}
	
	//Gets
	public boolean isAutopilotEnabled() {
		return autopilotEnabled;
	}
	public int getBatteryLife() {
		return batteryLife;
	}
	
	//Abstract
	public void showCarDetails() {
		System.out.println("Tesla Model: " + getModelName());
		System.out.println("Price: $" + getPrice());
		System.out.println("Year: " + getYear());
		System.out.println("Autopilot Enabled: " + (autopilotEnabled ? "Yes" : "No"));
		System.out.println("Battery Life: " + batteryLife + " miles");
	}
}
