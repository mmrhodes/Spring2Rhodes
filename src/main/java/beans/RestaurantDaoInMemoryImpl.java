package beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantDaoInMemoryImpl implements RestaurantDao {
	private Map<Long,Restaurant>restaurantMap = new HashMap<Long,Restaurant>();
	{
		Restaurant restaurant1 = new Restaurant(1L, "HuHot", "West Des Moines", 10, 2, "Lunch");
		Restaurant restaurant2 = new Restaurant(2L, "HuHot", "West Des Moines", 15, 2, "Supper");
		Restaurant restaurant3 = new Restaurant(3L, "Jethros", "Des Moines", 12, 2, "Lunch");
		Restaurant restaurant4 = new Restaurant(4L, "Jethros", "Des Moines", 12, 2, "Supper");
		restaurantMap.put(restaurant1.getId(), restaurant1);
		restaurantMap.put(restaurant2.getId(), restaurant2);
		restaurantMap.put(restaurant3.getId(), restaurant3);
		restaurantMap.put(restaurant4.getId(), restaurant4);
	}
	public void insert(Restaurant restaurant) {
		
		
	}
	public void update(Restaurant restaurant) {
		
		
	}
	public void update(List<Restaurant> restaurants) {
		
		
	}
	public void delete(long restaurantID) {
		
		
	}
	public Restaurant find(long restaurantID) {
		
		return restaurantMap.get(restaurantID);
	}
	public List<Restaurant> find(List<Long> restaurantIds) {
		
		return null;
	}
	public List<Restaurant> find(String restaurantName) {
		
		return null;
	}
	public List<Restaurant> find(Double costPerPerson) {
		
		return null;
	}


	
}
