package com.duong_nguyen.sleep_tracker.Entity;

public class ErrorResponse extends RuntimeException {
    public ErrorResponse(String message)
    {
        super(message);
    }
}