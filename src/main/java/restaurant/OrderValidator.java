package restaurant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderValidator {


        private final int numOfTables = 20;

        public boolean isValid(Order order){
           return order.getTableNumber() >=1 && order.getTableNumber() <= numOfTables;
        }
    }

