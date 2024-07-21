package com.zerobase.reservation.controller;

import com.zerobase.reservation.exception.ExceptionCode;
import com.zerobase.reservation.exception.ReservationException;
import com.zerobase.reservation.model.ReviewDomain;
import com.zerobase.reservation.service.ReservationService;
import com.zerobase.reservation.service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private final ReviewService reviewService;
    private final ReservationService reservationService;

    public ReviewController(ReviewService reviewService, ReservationService reservationService) {
        this.reviewService = reviewService;
        this.reservationService = reservationService;
    }

    @PostMapping
    public ResponseEntity<?> createReview(ReviewDomain reviewDomain) {
        Boolean isUsed = reservationService.isReservation(reviewDomain.getMemberName(), reviewDomain.getStoreName());

        if (isUsed) {
            reviewService.addReview(reviewDomain);
        } else {
            throw new ReservationException(ExceptionCode.NOT_STORE);
        }
        return ResponseEntity.ok(reviewDomain);
    }
}
