package com.zerobase.reservation.repository;

import com.zerobase.reservation.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {

    Boolean existsByMemberIdAndStoreName(String memberId, String storeName);
}