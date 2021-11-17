package restaurant;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        var ioContainer = new AnnotationConfigApplicationContext(AppConfiguration.class);
        var service = ioContainer.getBean(OrderService.class);

    }
}
