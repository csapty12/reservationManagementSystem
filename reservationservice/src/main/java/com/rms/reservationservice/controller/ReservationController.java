package com.rms.reservationservice.controller;

import com.rms.reservationservice.model.Reservation;
import com.rms.reservationservice.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/reservation")
public class ReservationController {
    public final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }

    @GetMapping("/{reservationId}")
    @ResponseStatus(HttpStatus.OK)
    public Reservation get(@PathVariable("reservationId") String reservationId) {
        return reservationService.getReservationById(reservationId);
    }

    @PutMapping("/{reservationId}")
    @ResponseStatus(HttpStatus.OK)
    public Reservation update(@PathVariable("reservationId") String reservationId, @RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservationId, reservation);
    }

    @DeleteMapping("/{reservationId}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("reservationId") String reservationId){
        reservationService.deleteReservation(reservationId);
    }

}
