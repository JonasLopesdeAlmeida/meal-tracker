package restaurant;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@ComponentScan
public class OrderController {

    private OrderService service;

    public OrderController(final OrderService service){
        this.service = service;
    }

    @Bean
    @Qualifier("addNewOrder")
    public void addNewOrder(){
        Order order = new Order(1l,2, List.of("cake","pasta"), LocalDate.now(), OrderStatus.COOKING);
        service.save(order);
    }

    @Bean
    @Qualifier("findingByStatus")
    public Order findingByStatus (OrderStatus status){
        Order result = service.findByStatus(status);
        return result;
    }

    @Bean
    @Qualifier("updateOrder")
    public Order updateOrder(Order order){
        return service.update(order);
       }
    }
