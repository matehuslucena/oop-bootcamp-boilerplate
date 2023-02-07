package oop;

public abstract class ConverterAbstract {

    public static Double betweenUnits(Double quantity, Double convertionFactor) {
        return quantity * convertionFactor;
    }

}
