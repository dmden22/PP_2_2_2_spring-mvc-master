package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllListCars();
    public List<Car> getAllListCars(int countCars);
}
