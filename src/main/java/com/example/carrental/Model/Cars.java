package com.example.carrental.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Cars {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "car_id")
    private long carId;
    @Basic
    @Column(name = "brand")
    private String brand;
    @Basic
    @Column(name = "seat_number")
    private int seatNumber;
    @Basic
    @Column(name = "license_plates")
    private String licensePlates;
    @Basic
    @Column(name = "color")
    private String color;
    @Basic
    @Column(name = "main_image")
    private String mainImage;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "rental_price")
    private double rentalPrice;
    @Basic
    @Column(name = "name")
    private String name;

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return carId == cars.carId && seatNumber == cars.seatNumber && Double.compare(cars.rentalPrice, rentalPrice) == 0 && Objects.equals(brand, cars.brand) && Objects.equals(licensePlates, cars.licensePlates) && Objects.equals(color, cars.color) && Objects.equals(mainImage, cars.mainImage) && Objects.equals(description, cars.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, brand, seatNumber, licensePlates, color, mainImage, description, rentalPrice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
