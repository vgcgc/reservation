package com.zerobase.reservation.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ExceptionCode {

    TEST_CODE(HttpStatus.INTERNAL_SERVER_ERROR, "test"),
    NOT_STORE(HttpStatus.NOT_FOUND, "존재하지 않는 가게 이름입니다.");

    private final HttpStatus httpStatus;
    private final String message;

}

