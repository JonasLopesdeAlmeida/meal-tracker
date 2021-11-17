package restaurant;

import java.util.List;
import java.util.Optional;

public interface OrderRepo {

    Order save(Order order);
    Order update(Order order);
    List<Order> findAll();
    Optional<Order> findById(Long id);



}
