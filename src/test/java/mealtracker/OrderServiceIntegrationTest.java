package mealtracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import restaurant.Order;
import restaurant.OrderRepo;
import restaurant.OrderService;
import restaurant.OrderValidator;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class OrderServiceIntegrationTest {
    private OrderRepo mockRepo;


    @BeforeEach
    public void setUp(){
        mockRepo = Mockito.mock(OrderRepo.class);
    }

    @Test
    public void mustAddNewOrder(){
        var order = startOrder();
        when(mockRepo.save(order)).thenReturn(order);
        assertNotNull(order.getId());
    }


    public static Order startOrder() {
        var order = new Order(1, List.of("pasta","orange juice"));
        return order;
    }
}
