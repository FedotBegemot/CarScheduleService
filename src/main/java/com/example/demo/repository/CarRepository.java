package com.example.demo.repository;

import com.example.demo.domain.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

    Car findByVinCode(String vinCode);

}
