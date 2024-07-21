package com.zerobase.reservation.entity;

import com.zerobase.reservation.model.StoreDomain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity(name = "STORE")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "NAME", unique = true, nullable = false)
    private String name;
    private String addr;
    private String info;
    private LocalTime open;
    private LocalTime end;
    @Column(name = "MEMBER_ID", insertable=false, updatable=false)
    private String owner;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID", referencedColumnName = "id")
    private MemberEntity member;

    public StoreEntity(StoreDomain storeDomain) {
        this.name = storeDomain.getName();
        this.addr = storeDomain.getAddress();
        this.info = storeDomain.getInfo();
        this.open = storeDomain.getOpen();
        this.end = storeDomain.getClose();
        this.owner = storeDomain.getOwner();
    }
}
