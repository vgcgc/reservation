package com.zerobase.reservation.controller;

import com.zerobase.reservation.model.StoreDomain;
import com.zerobase.reservation.service.StoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> getStore(@PathVariable String name) {
        StoreDomain storeDomain = storeService.getStore(name);
        return ResponseEntity.ok(storeDomain);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerStore(@RequestBody StoreDomain storeDomain) {
        storeService.registStore(storeDomain);
        return ResponseEntity.ok(storeDomain);
    }
}
