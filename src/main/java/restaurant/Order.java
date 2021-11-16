package restaurant;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private Long id;
    private Integer tableNumber;
    private List<String> meals;
    private LocalDate dateAndTime;
    private OrderStatus status;

    public Order(Long id, Integer tableNumber, List<String> meals, LocalDate dateAndTime, OrderStatus status) {
        this.id = id;
        this.tableNumber = tableNumber;
        this.meals = meals;
        this.dateAndTime = dateAndTime;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
       this.id = id;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public List<String> getMeals() {
        return meals;
    }

    public void setMeals(List<String> meals) {
        this.meals = meals;
    }

    public LocalDate getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDate dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
}
