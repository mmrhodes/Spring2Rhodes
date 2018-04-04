package beans;

import java.util.List;

public interface RestaurantDao {
	public void insert(Restaurant restaurant);
	public void update(Restaurant restaurant);
	public void update(List<Restaurant>restaurants);
	public void delete(long restaurantID);
	public Restaurant find(long restaurantID);
	public List<Restaurant>find(List<Long>restaurantIds);
	public List<Restaurant>find(String restaurantName);
	public List<Restaurant>find(Double costPerPerson);
}
