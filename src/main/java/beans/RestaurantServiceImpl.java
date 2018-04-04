package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class RestaurantServiceImpl implements RestaurantService {
private RestaurantDao restaurantDao;

public RestaurantServiceImpl() {
	super();
}

public RestaurantServiceImpl(RestaurantDao restaurantDao) {
	this.restaurantDao = restaurantDao;
}

 public RestaurantDao getRestaurantDao() {
 return restaurantDao;
}


public void setRestaurantDao(RestaurantDao restaurantDao) {
	this.restaurantDao = restaurantDao;
}


public Restaurant makeReservation(long restaurantId, int numOfPeople) {
	Restaurant restaurant = restaurantDao.find(restaurantId);
	//Restaurant restaurantReservation = restaurantDao.find(numOfPeople);

	//costOfReservation = restaurant.setCostOfReservation(restaurant.getCostPerPerson()* numOfPeople);
	
	
	restaurant.setCostPerPerson(restaurant.getCostPerPerson()* numOfPeople);
	//restaurantReservation.setBalance(targetAccount.getBalance() + amount);
	//restaurantDao.getList();
	restaurantDao.update(restaurant);
	return restaurantDao.find(restaurantId);
}



public Restaurant getRestaurant(long restaurantId) {
	return restaurantDao.find(restaurantId);

}

public void addRestaurant(long id, String restaurantName, String location, double cost, int numOfPeople,
		String lunchOrDinner) {
	// TODO Auto-generated method stub
	
}

public void showRestaurants(long id, String restaurantName, double cost, int numOfPeople, String lunchOrDinner)
		throws Exception {
	// TODO Auto-generated method stub
	
}
}
