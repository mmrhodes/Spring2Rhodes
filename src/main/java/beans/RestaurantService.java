package beans;

public interface RestaurantService {
	public void addRestaurant(long id, String restaurantName, String location, double cost, int numOfPeople, String lunchOrDinner);
	public void showRestaurants(long accountId, String restaurantName, double cost, int numOfPeople, String lunchOrDinner)throws Exception;
	public Restaurant getRestaurant(long restaurantId);
	public Restaurant makeReservation(long restaurantId, int numOfPeople);
}
