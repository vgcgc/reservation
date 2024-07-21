package com.zerobase.reservation.service;

import com.zerobase.reservation.entity.ReviewEntity;
import com.zerobase.reservation.model.ReviewDomain;
import com.zerobase.reservation.repository.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository, ReservationService reservationService) {
        this.reviewRepository = reviewRepository;
    }

    public ReviewDomain addReview(ReviewDomain review) {

        reviewRepository.save(new ReviewEntity(review));

        return review;
    }
}
