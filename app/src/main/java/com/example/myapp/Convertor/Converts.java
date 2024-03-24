package com.example.myapp.Convertor;

// Interface representing a unit converter
public interface Converts {

    // Method to get the name of the source unit
    String from();

    // Method to convert to the same unit
    Double toSelf(Double value);

    // Methods to convert to various other units
    Double toMillimeters(Double value);
    Double toCentimeters(Double value);
    Double toMeters(Double value);
    Double toMiles(Double value);
    Double toFeet(Double value);

}
