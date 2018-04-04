package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	@Bean
	public RestaurantDao restaurantDao() {
		RestaurantDaoInMemoryImpl bean = new RestaurantDaoInMemoryImpl();
		return bean;
	}

	@Bean(autowire=Autowire.BY_NAME)
	public RestaurantService restaurantService() {
		RestaurantServiceImpl bean = new RestaurantServiceImpl();
		//bean.setRestaurantDao(restaurantDao());
		return bean;
	}
}
