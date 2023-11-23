package web.DAO;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO implements CarService {

    private List<Car> listCars;

    {
        listCars = new ArrayList<>();

        listCars.add(new Car("Model1", "Series1", "12345"));
        listCars.add(new Car("Model2", "Series2", "23456"));
        listCars.add(new Car("Model3", "Series3", "34567"));
        listCars.add(new Car("Model4", "Series4", "45678"));
        listCars.add(new Car("Model5", "Series5", "56789"));
    }

    @Override
    public List<Car> getAllListCars() {
        return listCars;
    }

    @Override
    public List<Car> getAllListCars(int countCars) {
        if (countCars >= 5){
            return this.getAllListCars();
        } else {
            return listCars.stream().limit(countCars).collect(Collectors.toList());
        }
    }
}
