package org.example;

public class CheckInService {
    public String doCheckInFor(int passengers, String airlineName) {
        Airline airline = new Airline(airlineName);

        if (airline.isNotSpecified())
            return "Airline not specified";

        return "Passengers not specified";
    }
}
