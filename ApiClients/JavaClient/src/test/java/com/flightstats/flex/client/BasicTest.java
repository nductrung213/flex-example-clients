package com.flightstats.flex.client;


import com.flightstats.flex.FlexCredentials;
import com.flightstats.flex.domain.flightstatus.FlightStatusResponse;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashMap;

public class BasicTest {

    @Test
    public void testFlightStatusByDepartingFlight() {
        CurrentFlightStatusClient client = CurrentFlightStatusClient.builder()
                .appId(FlexCredentials.appId)
                .appKey(FlexCredentials.appKey)
                .build();

        FlightStatusResponse response = client.byDepartingFlight("AA", "100", LocalDate.now(), new HashMap<>());

        System.out.println(response);
    }
}