package com.example.myapp.Convertor;

public class Foot implements Converts {

    @Override
    public String from() {
        return "Feet";
    }

    @Override
    public Double toSelf(Double value) {
        return value;
    }

    @Override
    public Double toMillimeters(Double value) {
        return value / 0.00328084f;
    }

    @Override
    public Double toCentimeters(Double value) {
        return (Double) value * 30.48f;
    }

    @Override
    public Double toMeters(Double value) {
        return (Double) value / 3.28084f;
    }

    @Override
    public Double toMiles(Double value) {
        return value / 5280;
    }

    @Override
    public Double toFeet(Double value) {
        return toSelf(value);
    }
}
