package com.zerobase.reservation.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ReservationExceptionHandler {

    @ExceptionHandler(value = ReservationException.class)
    public ResponseEntity<ErrorResponse> handleRuntimeException(ReservationException e) {
        System.out.println("durl");
        ErrorResult result = ErrorResult.builder()
                .code(e.getCode().name())
                .message(e.getMessage())
                .build();
        return new ResponseEntity(result, e.getCode().getHttpStatus());
    }
}

