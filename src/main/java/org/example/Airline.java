package org.example;

public class Airline {
    private String airlineName;

    public Airline(String airlineName) {
        this.airlineName = airlineName;
    }

    public boolean isNotSpecified() {
        return airlineName.isEmpty();
    }
}
