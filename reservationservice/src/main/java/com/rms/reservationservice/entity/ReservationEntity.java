package com.rms.reservationservice.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "reservation")
public class ReservationEntity {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private LocalDateTime reservationTime;
    private int numberOfGuests;

}