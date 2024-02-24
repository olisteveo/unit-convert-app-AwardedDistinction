package com.example.myapp.Convertor;

import android.util.Log;

public class Factory {

    public static Double convert(Double value, String from, String to)
    {
        Converts convertor;
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
            case "Milimeters":
            default:
                convertor = new Millimeter();
                break;
        }
        Log.i("from", from);
        Log.i("Convertor", convertor.from());
        Log.i("to", to);
        switch(to) {
            case "Centimeters":
                return convertor.toCentimeters(value);
            case "Meters":
                return convertor.toMeters(value);
            case "Miles":
                return convertor.toMiles(value);
            case "Feet":
                return convertor.toFeet(value);
            case "Milimeters":
            default:
                return convertor.toMillimeters(value);
        }
    }
}
