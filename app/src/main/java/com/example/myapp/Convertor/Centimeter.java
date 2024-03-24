package com.example.myapp.Convertor;

import com.example.myapp.R;

public class Centimeter implements Converts {

    @Override
    public String from() {
        return String.valueOf(R.string.Centimeters);
    }

    @Override
    public Double toSelf(Double value) {
        return value;
    }

    @Override
    public Double toMillimeters(Double value) {
        return value * 10;
    }

    @Override
    public Double toCentimeters(Double value) {
        return toSelf(value);
    }

    @Override
    public Double toMeters(Double value) {
        return (Double) value / 100;
    }

    @Override
    public Double toMiles(Double value) {
        return (Double) value * 0.00000621371f;
    }

    @Override
    public Double toFeet(Double value) {
        return (Double) value / 30.48f;
    }
}
