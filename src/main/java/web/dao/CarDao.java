package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private static final List<Car> cars = new ArrayList<>(List.of(
            new Car(1, 123, "Toyota", 2020),
            new Car(2, 456, "BMW", 2018),
            new Car(3, 789, "Audi", 2019),
            new Car(4, 599, "Tachila", 2021),
            new Car(5, 900, "Mashina", 2022)));

    public List<Car> getCars() {
        return cars;
    }

}

