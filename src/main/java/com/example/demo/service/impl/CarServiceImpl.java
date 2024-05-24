package com.example.demo.service.impl;

import com.example.demo.domain.entity.Car;
import com.example.demo.repository.CarRepository;
import com.example.demo.service.CarService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    @Override
    @Transactional
    public void saveCar(Car car) {
        carRepository.save(car);
    }

    @Override
    @Transactional
    public Car findByVinCode(String vinCode) {
        return carRepository.findByVinCode(vinCode);
    }

    @Override
    @Transactional
    public void updateCar(Car car) {
        carRepository.save(car);
    }

    @Override
    @Transactional
    public void deleteCar(String vinCode) {
        Car car = carRepository.findByVinCode(vinCode);
        carRepository.delete(car);
    }
}
