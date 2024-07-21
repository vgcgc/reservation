package com.zerobase.reservation.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDomain {

    private String memberName;
    private String storeName;
    private String rating;
    private String comments;
}
