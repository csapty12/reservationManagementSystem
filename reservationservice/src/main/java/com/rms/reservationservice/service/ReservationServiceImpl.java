package com.rms.reservationservice.service;

import com.rms.reservationservice.model.Reservation;
import com.rms.reservationservice.repository.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation getReservationById(String reservationId) {
        return null;
    }

    @Override
    public Reservation updateReservation(String reservationId, Reservation reservation) {
        return null;
    }

    @Override
    public void deleteReservation(String reservationId) {

    }
}
