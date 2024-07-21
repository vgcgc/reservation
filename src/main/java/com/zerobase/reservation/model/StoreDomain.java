package com.zerobase.reservation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
public class StoreDomain {

    private String name;
    private String address;
    private String info;
    private LocalTime open;
    private LocalTime close;
    private String owner;

}
