package com.example.carrental.Model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Orders {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id")
    private long orderId;
    @Basic
    @Column(name = "user_id")
    private long userId;
    @Basic
    @Column(name = "order_number")
    private int orderNumber;
    @Basic
    @Column(name = "order_date")
    private Date orderDate;
    @Basic
    @Column(name = "rental_date")
    private Date rentalDate;
    @Basic
    @Column(name = "return_date")
    private Date returnDate;
    @Basic
    @Column(name = "car_id")
    private long carId;
    @Basic
    @Column(name = "rental_status_id")
    private int rentalStatusId;
    @Basic
    @Column(name = "rental_purpose")
    private String rentalPurpose;
    @Basic
    @Column(name = "total_money")
    private double totalMoney;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public int getRentalStatusId() {
        return rentalStatusId;
    }

    public void setRentalStatusId(int rentalStatusId) {
        this.rentalStatusId = rentalStatusId;
    }

    public String getRentalPurpose() {
        return rentalPurpose;
    }

    public void setRentalPurpose(String rentalPurpose) {
        this.rentalPurpose = rentalPurpose;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return orderId == orders.orderId && userId == orders.userId && orderNumber == orders.orderNumber && carId == orders.carId && rentalStatusId == orders.rentalStatusId && Double.compare(orders.totalMoney, totalMoney) == 0 && Objects.equals(orderDate, orders.orderDate) && Objects.equals(rentalDate, orders.rentalDate) && Objects.equals(returnDate, orders.returnDate) && Objects.equals(rentalPurpose, orders.rentalPurpose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, userId, orderNumber, orderDate, rentalDate, returnDate, carId, rentalStatusId, rentalPurpose, totalMoney);
    }
}
