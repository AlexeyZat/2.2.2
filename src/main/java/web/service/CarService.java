package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarService {

    private CarDao carDao = new CarDao();

    public CarService(CarDao carDao) {
        this.carDao = carDao;

    }

    public List<Car> getAllCars(int count) {
        List<Car> cars = carDao.getCars();
        if (count >= cars.size() || count <= 0) {
            return cars;
        }
        return cars.subList(0,count);
    }
}
