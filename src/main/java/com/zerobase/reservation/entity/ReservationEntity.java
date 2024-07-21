package com.zerobase.reservation.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Entity(name = "RESERVATION")
@Getter
@Setter
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "MEMBER_ID", insertable=false, updatable=false)
    private String memberId;

    @Column(name = "STORE", insertable=false, updatable=false)
    private String storeName;

    @Column(name = "START_AT")
    private LocalTime startTime;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID", referencedColumnName = "id")
    private MemberEntity member;

    @ManyToOne
    @JoinColumn(name = "STORE", referencedColumnName = "NAME")
    private StoreEntity store;
}
