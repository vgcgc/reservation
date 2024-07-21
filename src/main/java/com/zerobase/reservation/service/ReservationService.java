package com.zerobase.reservation.service;

import com.zerobase.reservation.entity.ReservationEntity;
import com.zerobase.reservation.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Boolean isReservation(String memberId, String storeName){

        return reservationRepository.existsByMemberIdAndStoreName(memberId, storeName);
    }
}
