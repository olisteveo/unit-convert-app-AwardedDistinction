package com.example.myapp.Convertor;

// Class implementing Converts interface for Millimeter unit conversion
public class Millimeter implements Converts {

    // Method to get the name of the source unit
    @Override
    public String from() {
        return "Milimeters"; // Return the name of the source unit
    }

    // Method to convert to the same unit (identity conversion)
    @Override
    public Double toSelf(Double value) {
        return value; // Return the input value unchanged
    }

    // Method to convert to Millimeters (identity conversion)
    @Override
    public Double toMillimeters(Double value) {
        return toSelf(value); // Return the input value unchanged
    }

    // Method to convert to Centimeters
    @Override
    public Double toCentimeters(Double value) {
        return value / 10; // Convert to centimeters by dividing by 10
    }

    // Method to convert to Meters
    @Override
    public Double toMeters(Double value) {
        return value / 1000; // Convert to meters by dividing by 1000
    }

    // Method to convert to Miles
    @Override
    public Double toMiles(Double value) {
        return value * 0.000000621371f; // Convert to miles using a predefined conversion factor
    }

    // Method to convert to Feet
    @Override
    public Double toFeet(Double value) {
        return value * 0.00328084f; // Convert to feet using a predefined conversion factor
    }
}
