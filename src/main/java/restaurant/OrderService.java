package restaurant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
@ComponentScan
public class OrderService  {

    private OrderRepo repo;

    public OrderService(final OrderRepo repo){
        this.repo = repo;
    }

    @Bean
    public Order save(Order order) {
        validation(order);
        return repo.save(order) ;
    }

    @Bean
    public Order update(Order order) {
        Objects.requireNonNull(order.getId());
        return repo.update(order);
    }

    @Bean
    public List<Order> findAll(Order order) {
        return repo.findAll(order);
    }

    @Bean
    public Order findByStatus(OrderStatus status) {
        return repo.findByStatus(status);
    }

    @Bean
    public Optional<Order> findById(Long id) {
        return repo.findById(id);
    }

    public void validation(Order order){
        if(order.getTableNumber() > 20){
            throw new BusinessNegotiationException("Sorry!! No more tables available");
        }
    }
}
