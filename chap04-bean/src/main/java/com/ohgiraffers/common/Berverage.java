package com.ohgiraffers.common;

public class Berverage extends Product{
    private int capacity;

    public Berverage() {
    }

    public Berverage(int capacity) {
        this.capacity = capacity;
    }

    public Berverage(String name, int price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.capacity;
    }
}
