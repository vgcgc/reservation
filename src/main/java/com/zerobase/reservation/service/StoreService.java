package com.zerobase.reservation.service;

import com.zerobase.reservation.entity.StoreEntity;
import com.zerobase.reservation.exception.ExceptionCode;
import com.zerobase.reservation.exception.ReservationException;
import com.zerobase.reservation.model.StoreDomain;
import com.zerobase.reservation.repository.StoreRepository;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    private final StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public StoreDomain getStore(String storeName){

        StoreEntity storeEntity = storeRepository.findByName(storeName);
        if(storeEntity == null){
            throw new ReservationException(ExceptionCode.NOT_STORE);
        }

        return new StoreDomain(storeEntity.getName(), storeEntity.getAddr(),
                                storeEntity.getInfo(), storeEntity.getOpen(),
                                storeEntity.getEnd(), storeEntity.getOwner());
    }

    public void registStore(StoreDomain storeDomain){

        Boolean isStore = storeRepository.existsByName(storeDomain.getName());

        if(isStore){
            throw new ReservationException(ExceptionCode.NOT_STORE);
        }

        storeRepository.save(new StoreEntity(storeDomain));
    }
}
