package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class CheckInTest {
    @Test
    void returns_passengers_not_specified() {
        CheckInService checkInService = new CheckInService();

        String result = checkInService.doCheckInFor(0, "Iberia");

        assertEquals("Passengers not specified", result);
    }
}
