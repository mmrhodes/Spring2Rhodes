package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				//BeanConfiguration.class);
		 ClassPathXmlApplicationContext applicationContext = new
		 ClassPathXmlApplicationContext("beans/beans.xml");
		RestaurantService restaurantService = applicationContext.getBean("restaurantService", RestaurantService.class);
		System.out.println("Restaurant Options: " + "\n"+ restaurantService.getRestaurant(1)+ restaurantService.getRestaurant(2)+ restaurantService.getRestaurant(3)+ restaurantService.getRestaurant(4));
		System.out.println("Restaurant cost for 2 people: ");
		int numForRes = 2;
		System.out.println(restaurantService.makeReservation(1, numForRes).toString()+ restaurantService.makeReservation(2, numForRes).toString()+ restaurantService.makeReservation(3, numForRes).toString()+ restaurantService.makeReservation(4, numForRes).toString());
	}

}

