package com.example.carrental.Service;

import com.example.carrental.Model.Cars;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Cars> getAllCar();
    public Optional<Cars> getCarById(Long id);
    void addCar(Cars car);
    public boolean  deleteCar(Long id);
    public Cars updateCar (Long id, Cars car);
}
