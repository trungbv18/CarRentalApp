package com.example.carrental.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Feedbacks {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "feedback_id")
    private long feedbackId;
    @Basic
    @Column(name = "user_id")
    private long userId;
    @Basic
    @Column(name = "car_id")
    private long carId;
    @Basic
    @Column(name = "content")
    private String content;

    public long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(long feedbackId) {
        this.feedbackId = feedbackId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feedbacks feedbacks = (Feedbacks) o;
        return feedbackId == feedbacks.feedbackId && userId == feedbacks.userId && carId == feedbacks.carId && Objects.equals(content, feedbacks.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedbackId, userId, carId, content);
    }
}
