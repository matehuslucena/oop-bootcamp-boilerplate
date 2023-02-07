package oop;

public class Converter extends ConverterAbstract {

    public static final double FEET_TO_METERS_FACTOR = 0.3048;
    public static final double INCHES_TO_YARDS_FACTOR = 0.0278;
    public static final double BASE_TO_CENTI_FACTOR = 100;
    public static final double GALLONS_TO_LITERS_FACTOR = 3.7854;

    public static Double feetToMeters(Double feet) {
        return betweenUnits(feet, FEET_TO_METERS_FACTOR);
    }

    public static Double inchesToYards(Double inches) {
        return betweenUnits(inches,INCHES_TO_YARDS_FACTOR);
    }

    public static Double metersToCentimeters(Double meters) {
        return betweenUnits(meters,BASE_TO_CENTI_FACTOR);
    }

    public static Double gallonsToLiters(Double gallons) {
        return betweenUnits(gallons,GALLONS_TO_LITERS_FACTOR);
    }

}