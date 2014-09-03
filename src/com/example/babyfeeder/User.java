package com.example.babyfeeder;

public class User {
	private String Name;
	private int Weight;
	private int CalculatedWeight;
	private int MealsPerDay;
	private String LastMealTime;
	private int VolumePerMeal;
	private int VolumePerDay;

	User(String name){
		this.Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public int getCalculatedWeight() {
		return CalculatedWeight;
	}

	public void setCalculatedWeight(int calculatedWeight) {
		CalculatedWeight = calculatedWeight;
	}

	public int getMealsPerDay() {
		return MealsPerDay;
	}

	public void setMealsPerDay(int mealsPerDay) {
		MealsPerDay = mealsPerDay;
	}

	public String getLastMealTime() {
		return LastMealTime;
	}

	public void setLastMealTime(String lastMealTime) {
		LastMealTime = lastMealTime;
	}

	public int getVolumePerMeal() {
		return VolumePerMeal;
	}

	public void setVolumePerMeal(int volumePerMeal) {
		VolumePerMeal = volumePerMeal;
	}

	public int getVolumePerDay() {
		return VolumePerDay;
	}

	public void setVolumePerDay(int volumePerDay) {
		VolumePerDay = volumePerDay;
	}
	
	
	
}
