package com.example.myapp.Convertor;

public class Mile implements Converts {

    @Override
    public String from() {
        return "Miles";
    }

    @Override
    public Double toSelf(Double value) {
        return value;
    }

    @Override
    public Double toMillimeters(Double value) {
        return value / 0.000000621371f;
    }

    @Override
    public Double toCentimeters(Double value) {
        return (Double) value / 0.00000621371f;
    }

    @Override
    public Double toMeters(Double value) {
        return (Double) value / 0.000621371f;
    }

    @Override
    public Double toMiles(Double value) {
        return toSelf(value);
    }

    @Override
    public Double toFeet(Double value) {
        return (Double) value  * 5280f;
    }
}
