package restaurant;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestaurantApp {

    public static void main(String[] args) {
        var ioContainer = new AnnotationConfigApplicationContext(RestaurantApp.class);
        var controller = ioContainer.getBean(OrderController.class);
        controller.addNewOrder();

    }
}
