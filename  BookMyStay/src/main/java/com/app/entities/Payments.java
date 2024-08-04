package com.app.entities;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "payments")
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    private double amount;
    private String paymentMode;
    private LocalDate paymentDate;


    public Payments() {}

    public Payments(double amount, String paymentMode, LocalDate paymentDate) {
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.paymentDate = paymentDate;
    }

    // Getters and Setters
    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "paymentId=" + paymentId +
                ", amount=" + amount +
                ", paymentMode='" + paymentMode + '\'' +
                ", paymentDate=" + paymentDate +
                '}';
    }
}

