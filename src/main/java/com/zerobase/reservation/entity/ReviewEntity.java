package com.zerobase.reservation.entity;

import com.zerobase.reservation.model.ReviewDomain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "REVIEW")
@Getter
@Setter
@NoArgsConstructor
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "MEMBER_ID", insertable = false, updatable = false)
    private String memberId;
    @Column(name = "STORE")
    private String storeName;
    private String rating;
    private String comments;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID", referencedColumnName = "id")
    private MemberEntity member;

    public ReviewEntity(ReviewDomain reviewDomain) {
        this.memberId = reviewDomain.getMemberName();
        this.storeName = reviewDomain.getStoreName();
        this.rating = reviewDomain.getRating();
        this.comments = reviewDomain.getComments();
    }
}
