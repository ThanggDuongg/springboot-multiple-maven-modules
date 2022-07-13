package com.ddt.domain.dtos.common;

import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

@Data
@Accessors(chain = true)
public class ApiResponse<T> {
    private boolean success;
    private int statusCode;

    private String message;
    private T data;
    private Timestamp date;


    public ApiResponse<T> baseResponse() {
        this.date = new Timestamp(System.currentTimeMillis());
        return this;
    }

    public ApiResponse<T> responseEntity(ResponseCode responseCode) {
        return baseResponse()
                .setSuccess(responseCode.isSuccess())
                .setStatusCode(responseCode.getValue())
                .setMessage(responseCode.getMessage());
    }

    public ApiResponse<T> responseEntity(T data, ResponseCode responseCode) {
        return responseEntity(responseCode)
                .setData(data);
    }
}
