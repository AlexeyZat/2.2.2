package web.service;
import web.models.Car;
import java.util.List;


public interface CarServiceimnt {

    List<Car> getCars(int count);

    public interface CarService {
        List<Car> getCars(int count);
    }
}
