package com.example.myapp.Convertor;

import android.util.Log;

public class Factory {

    // Method to perform unit conversion
    public static Double convert(Double value, String from, String to) {
        // Initialise the Converts interface
        Converts convertor;

        // Determine the appropriate converter based on the 'from' unit
        switch(from) {
            case "Centimeters":
                convertor = new Centimeter();
                break;
            case "Meters":
                convertor = new Meter();
                break;
            case "Miles":
                convertor = new Mile();
                break;
            case "Feet":
                convertor = new Foot();
                break;
            case "Millimeters":
            default:
                convertor = new Millimeter();
                break;
        }

        // Log the source unit, converter, and target unit for debugging
        Log.i("from", from);
        Log.i("Convertor", convertor.from());
        Log.i("to", to);

        // Perform the conversions based on the 'to' unit
        switch(to) {
            case "Centimeters":
                return convertor.toCentimeters(value);
            case "Meters":
                return convertor.toMeters(value);
            case "Miles":
                return convertor.toMiles(value);
            case "Feet":
                return convertor.toFeet(value);
            case "Millimeters":
            default:
                return convertor.toMillimeters(value);
        }
    }
}
