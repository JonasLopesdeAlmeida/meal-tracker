package mealtracker;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import restaurant.OrderRepo;
import restaurant.OrderService;
import restaurant.AppConfiguration;
import restaurant.OrderValidator;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfiguration.class)
public class ContainerConfigTest {

    @Autowired
    private ApplicationContext ioContainer;

//    @BeforeEach
//    public void setUp(){
//        ioContainer = new AnnotationConfigApplicationContext(AppConfiguration.class);
//    }

    @Test
    public void mustRepoAndServiceNotNull(){
        assertNotNull(ioContainer.getBean(OrderRepo.class));
        assertNotNull(ioContainer.getBean(OrderValidator.class));
        assertNotNull(ioContainer.getBean(OrderService.class));
    }
}
