package com.zerobase.reservation.entity;

import com.zerobase.reservation.model.MemberType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "MEMBER")
@Getter
@Setter
@NoArgsConstructor
public class MemberEntity {//implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    private String pw;
    private MemberType type;

//    @Builder
//    public MemberEntity(String id, String pw, String auth){
//        this.id = id;
//        this.pw = pw;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return List.of(new SimpleGrantedAuthority("member"));
//    }
//
//    @Override
//    public String getPassword() {
//        return pw;
//    }
//
//    @Override
//    public String getUsername() {
//        return id;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        //return UserDetails.super.isAccountNonExpired();
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
////        return UserDetails.super.isAccountNonLocked();
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        //return UserDetails.super.isCredentialsNonExpired();
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        //return UserDetails.super.isEnabled();
//        return true;
//    }
}