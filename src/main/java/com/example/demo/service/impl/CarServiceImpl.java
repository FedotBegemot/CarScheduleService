package com.example.demo.service.impl;

import com.example.demo.domain.entity.Car;
import com.example.demo.exception.NoSuchEntityException;
import com.example.demo.repository.CarRepository;
import com.example.demo.service.CarService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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
        var carFromDb = carRepository.findByVinCode(car.getVinCode());
        if (carFromDb == null){
            throw new NoSuchEntityException("Car for updating not found");
        }
        if (car.getBodyNumber() != null & !Objects.equals(car.getBodyNumber(), "")) {
            carFromDb.setBodyNumber(car.getBodyNumber());
        }
        if (car.getColor() != null & !Objects.equals(car.getBodyNumber(), "")) {
            carFromDb.setColor(car.getColor());
        }
        if (car.getEngineType() != null & !Objects.equals(car.getBodyNumber(), "")) {
            carFromDb.setEngineType(car.getEngineType());
        }
        if (car.getEngineNumber() != null & !Objects.equals(car.getBodyNumber(), "")) {
            carFromDb.setEngineNumber(car.getEngineNumber());
        }
        if (car.getLicensePlate() != null & !Objects.equals(car.getBodyNumber(), "")) {
            carFromDb.setLicensePlate(car.getLicensePlate());
        }
        if (car.getTransmission() != null & !Objects.equals(car.getBodyNumber(), "")) {
            carFromDb.setTransmission(car.getTransmission());
        }
        carRepository.save(carFromDb);
    }

    @Override
    @Transactional
    public void deleteCar(String vinCode) {
        Car car = carRepository.findByVinCode(vinCode);
        carRepository.delete(car);
    }
}
