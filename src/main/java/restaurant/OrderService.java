package restaurant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;


@Component
@Transactional
public class OrderService  {

    private OrderRepo repo;
    private OrderValidator validation;

    public OrderService(OrderRepo repo, OrderValidator validation){
        this.repo = repo;
        this.validation = validation;
    }


    public Order addNewOrder(Order order) {
        if(validation.isValid(order)) {
            order.setStatus(OrderStatus.NOT_STARTED);
            order.setDateAndTime(LocalDateTime.now());
            return repo.save(order);
        }else {
            throw new BusinessNegotiationException("Sorry!! no more tables available!");
        }
    }


    public void updateOrder(Order order) {
        Objects.requireNonNull(order.getId());
        repo.update(order);
    }


    public List<Order> findAll() {
        return repo.findAll();
    }


    public List<Order> findingByStatus (OrderStatus status) {
        return repo.findAll().stream()
                .filter(order -> order.getStatus().equals(status))
                .collect(Collectors.toList());
    }


    public Optional<Order> findById(Long id) {
        return repo.findById(id);
    }


}
