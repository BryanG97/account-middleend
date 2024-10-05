package com.msf.account.middleend.exceptions;
import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler({FeignException.class})
    public ResponseEntity<String> exceptionNotControled(FeignException exception){
        String errorMessage = exception.contentUTF8(); // o ex.contentUTF8() para el contenido de la respuesta
        // Devolver una respuesta con el mismo mensaje y un estado apropiado
        return ResponseEntity.status(HttpStatus.valueOf(exception.status())).body(errorMessage);
    }
}
