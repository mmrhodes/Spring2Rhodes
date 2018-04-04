package beans;

import java.util.List;

import org.springframework.context.annotation.Bean;

public class RestaurantDaoJpaImpl implements RestaurantDao {
	@Bean
	public RestaurantDao restaurantDaoJpa() {
		RestaurantDaoJpaImpl bean = new RestaurantDaoJpaImpl();
		return bean;
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
		
		return null;
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
