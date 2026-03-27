package edu.eci.arsw.blueprints.controllers;

public class ApiResponse<T> {
    private final int status;
    private final String message;
    private final T data;

    public ApiResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // Static factory methods
    public static <T> ApiResponse<T> success(int status, String message, T data) {
        return new ApiResponse<>(status, message, data);
    }

    public static <T> ApiResponse<T> success(int status, T data) {
        return new ApiResponse<>(status, "Success", data);
    }

    public static <T> ApiResponse<T> error(int status, String message) {
        return new ApiResponse<>(status, message, null);
    }

    // Getters
    public int getStatus() { return status; }
    public String getMessage() { return message; }
    public T getData() { return data; }
}
