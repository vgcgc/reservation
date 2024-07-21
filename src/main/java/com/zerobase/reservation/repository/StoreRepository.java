package com.zerobase.reservation.repository;

import com.zerobase.reservation.entity.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<StoreEntity, Long> {

    StoreEntity findByName(String name);

    Boolean existsByName(String name);
}
