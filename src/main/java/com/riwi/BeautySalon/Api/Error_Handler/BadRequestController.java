package com.riwi.BeautySalon.Api.Error_Handler;

import com.riwi.BeautySalon.Api.Dto.Response.Errors.BaseResponse;
import com.riwi.BeautySalon.Api.Dto.Response.Errors.ErrorResp;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

//escuchador que eescucha en todo momento se va a estar ejecuntando
@RestControllerAdvice
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestController {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseResponse handleBadRequest(
            MethodArgumentNotValidException exception
    ){
        List<String> errors = new ArrayList<>();
        exception.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));

        return ErrorResp.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .status(HttpStatus.BAD_REQUEST.name())
                .errors(errors)
                .build();

    }
}
