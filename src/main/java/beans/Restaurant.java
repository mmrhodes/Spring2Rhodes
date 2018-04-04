package beans;

import java.text.DecimalFormat;

public class Restaurant {
	private long id;
	private String restaurantName;
	private String location;
	private double costPerPerson;
	private int numOfPeople;
	private String lunchOrSupper;
	private double costOfReservation;
	DecimalFormat df = new DecimalFormat("##.##");
	public Restaurant(long id, String restaurantName, String location, double costPerPerson, int numOfPeople,
			String lunchOrSupper) {
		super();
		this.id = id;
		this.restaurantName = restaurantName;
		this.location = location;
		this.costPerPerson = costPerPerson;
		this.numOfPeople = numOfPeople;
		this.lunchOrSupper = lunchOrSupper;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getCostPerPerson() {
		return costPerPerson;
	}
	public void setCostPerPerson(double costPerPerson) {
		this.costPerPerson = costPerPerson;
	}
	public int getNumOfPeople() {
		return numOfPeople;
	}
	public void setNumOfPeople(int numOfPeople) {
		this.numOfPeople = numOfPeople;
	}
	public String getLunchOrSupper() {
		return lunchOrSupper;
	}
	public void setLunchOrSupper(String lunchOrSupper) {
		this.lunchOrSupper = lunchOrSupper;
	}
	public double getCostOfReservation() {
		return costOfReservation;
	}
	public void setCostOfReservation(double costOfReservation) {
		this.costOfReservation = costOfReservation;
	}
	@Override
	public String toString() {
		return restaurantName + ", in " + location + ", $" + df.format(costPerPerson) + " at " +  lunchOrSupper + "\n";
	}
	
	

}
