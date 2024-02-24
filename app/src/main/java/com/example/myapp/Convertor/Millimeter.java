package com.example.myapp.Convertor;

public class Millimeter implements Converts {

    @Override
    public String from() {
        return "Milimeters";
    }

    @Override
    public Double toSelf(Double value) {
        return value;
    }

    @Override
    public Double toMillimeters(Double value) {
        return toSelf(value);
    }

    @Override
    public Double toCentimeters(Double value) {
        return (Double) value / 10;
    }

    @Override
    public Double toMeters(Double value) {
        return (Double) value / 1000;
    }

    @Override
    public Double toMiles(Double value) {
        return (Double) value * 0.000000621371f;
    }

    @Override
    public Double toFeet(Double value) {
        return (Double) value * 0.00328084f;
    }
}
