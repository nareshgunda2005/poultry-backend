package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OutersSales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private int quantity;
    private double amount;

    // Constructors
    public OutersSales() {}
    public OutersSales(String date, int quantity, double amount) {
        this.date = date;
        this.quantity = quantity;
        this.amount = amount;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}