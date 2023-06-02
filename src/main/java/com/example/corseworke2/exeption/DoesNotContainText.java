package com.example.corseworke2.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DoesNotContainText extends RuntimeException {
    public DoesNotContainText() {
    }

    public DoesNotContainText(String message) {
        super(message);
    }

    public DoesNotContainText(String message, Throwable cause) {
        super(message, cause);
    }

    public DoesNotContainText(Throwable cause) {
        super(cause);
    }

    public DoesNotContainText(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
