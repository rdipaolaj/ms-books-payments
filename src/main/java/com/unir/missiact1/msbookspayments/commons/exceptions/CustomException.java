package com.unir.missiact1.msbookspayments.commons.exceptions;

import com.unir.missiact1.msbookspayments.commons.enums.ApiErrorCode;

public class CustomException extends RuntimeException {
    private final ApiErrorCode errorCode;

    public CustomException(String message, ApiErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public ApiErrorCode getErrorCode() {
        return errorCode;
    }
}