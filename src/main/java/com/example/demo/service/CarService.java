package com.example.demo.service;

import com.example.demo.domain.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> findAllCars();
    void saveCar(Car car);
    Car findByVinCode(String vinCode);
    void updateCar(Car car);
    void deleteCar(String vicCode);
}
