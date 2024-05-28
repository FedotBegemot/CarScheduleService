package com.example.demo.controller;

import com.example.demo.domain.entity.Car;
import com.example.demo.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public List<Car> findAllCars(){
        return carService.findAllCars();
    }

    @GetMapping("/{vinCode}")
    public Car findByVinCode(@PathVariable("vinCode") String vinCode){
        return carService.findByVinCode(vinCode);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Car car, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return ResponseEntity.badRequest().build();
        }
        carService.updateCar(car);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Car car, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return ResponseEntity.badRequest().body(HttpStatus.BAD_REQUEST);
        }
        carService.saveCar(car);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{vinCode}")
    public ResponseEntity delete(@PathVariable("vinCode") String vinCode) {
        carService.deleteCar(vinCode);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
