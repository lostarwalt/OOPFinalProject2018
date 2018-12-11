package edu.century.finalproject;

public class Temperature {

    public double convertCtoF(double c) {;
        return (9 * c + 160)/5f;
    }

    public double convertFtoC(double f) {
        return (5* (f - 32))/9f;
   }
}