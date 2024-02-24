package com.example.myapp.Convertor;

public class Meter implements Converts {

    @Override
    public String from() {
        return "Meters";
    }

    @Override
    public Double toSelf(Double value) {
        return value;
    }

    @Override
    public Double toMillimeters(Double value) {
        return value * 1000;
    }

    @Override
    public Double toCentimeters(Double value) {
        return value * 100;
    }

    @Override
    public Double toMeters(Double value) {
        return toSelf(value);
    }

    @Override
    public Double toMiles(Double value) {
        return (Double) value * 0.000621371f;
    }

    @Override
    public Double toFeet(Double value) {
        return (Double) value * 3.28084f;
    }
}
