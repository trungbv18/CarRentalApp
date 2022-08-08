package com.example.carrental.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "car_images", schema = "dbo", catalog = "carRental")
public class CarImages {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "image_id")
    private long imageId;
    @Basic
    @Column(name = "car_id")
    private long carId;
    @Basic
    @Column(name = "sub_image")
    private String subImage;

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getSubImage() {
        return subImage;
    }

    public void setSubImage(String subImage) {
        this.subImage = subImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarImages carImages = (CarImages) o;
        return imageId == carImages.imageId && carId == carImages.carId && Objects.equals(subImage, carImages.subImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, carId, subImage);
    }
}
