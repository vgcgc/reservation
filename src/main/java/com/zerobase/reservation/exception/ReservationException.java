package com.zerobase.reservation.exception;

import lombok.Getter;

@Getter
public class ReservationException extends RuntimeException {

    private final ExceptionCode code;

    public ReservationException(ExceptionCode code) {
        this.code = code;
    }

    public ReservationException(String message, ExceptionCode code) {
        super(message);
        this.code = code;
    }

    public ReservationException(String message, Throwable cause, ExceptionCode code) {
        super(message, cause);
        this.code = code;
    }

    public ReservationException(Throwable cause, ExceptionCode code) {
        super(cause);
        this.code = code;
    }

    public ReservationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ExceptionCode code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public ReservationException(ExceptionCode exceptionCode, String message){
        super(message);
        this.code = exceptionCode;
    }

    public ReservationException(ExceptionCode exceptionCode, String message, Throwable cause){
        super(message, cause);
        this.code = exceptionCode;
    }
}
