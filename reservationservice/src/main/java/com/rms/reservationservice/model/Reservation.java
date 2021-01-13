package com.rms.reservationservice.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
public class Reservation {
    private String id;
    private String firstName;
    private String lastName;
    private LocalDateTime reservationTime;
    private int numberOfGuests;
    private int duration;
}