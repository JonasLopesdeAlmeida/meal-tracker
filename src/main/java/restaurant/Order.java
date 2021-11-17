package restaurant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Order {

    private long id;
    private int tableNumber;
    private List<String> meals;
    private LocalDateTime dateAndTime;
    private OrderStatus status;

    private static long nextId = 1;

    public Order( Integer tableNumber, List<String> meals) {
        this.id = nextId++;
        this.tableNumber = tableNumber;
        this.meals = meals;
    }

    public Order(long id, int tableNumber, List<String> meals, LocalDateTime dateAndTime, OrderStatus status) {
        this.id = id;
        this.tableNumber = tableNumber;
        this.meals = meals;
        this.dateAndTime = dateAndTime;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public List<String> getMeals() {
        return meals;
    }

    public void setMeals(List<String> meals) {
        this.meals = meals;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }


    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", tableNumber=" + tableNumber +
                ", meals=" + meals +
                ", dateAndTime=" + dateAndTime +
                ", status=" + status +
                '}';
    }
}
