package com.msf.account.middleend.exceptions;

import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler({FeignException.BadGateway.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.BadGateway e) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Error Bad Gateway");
    }

    @ExceptionHandler({FeignException.BadRequest.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.BadRequest e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Solicitud incorrecta (BAD REQUEST)");
    }

    @ExceptionHandler({FeignException.FeignClientException .class})
    public ResponseEntity<String> exceptionNotControled(FeignException.FeignClientException e) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Error (CLIENT EXCEPTION)");
    }

    @ExceptionHandler({FeignException.FeignServerException  .class})
    public ResponseEntity<String> exceptionNotControled(FeignException.Gone  e) {
        return ResponseEntity.status(HttpStatus.GONE).body("Error server");
    }

    @ExceptionHandler({FeignException.Forbidden  .class})
    public ResponseEntity<String> exceptionNotControled(FeignException.Forbidden  e) {
        return ResponseEntity.status(HttpStatus.GONE).body("Error server");
    }
    ///////////////////////////////////////

    @ExceptionHandler({FeignException.InternalServerError.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.InternalServerError e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error en la petición InternalServerError");
    }

    @ExceptionHandler({FeignException.Conflict.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.Conflict e){
        return ResponseEntity.status(HttpStatus.CONFLICT).body("error en la petición Conflict");
    }

    @ExceptionHandler({FeignException.MethodNotAllowed.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.MethodNotAllowed e){
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body("error en la petición MethodNotAllowed");
    }

    @ExceptionHandler({FeignException.NotAcceptable.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.NotAcceptable e){
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("error en la petición NotAcceptable");
    }

    @ExceptionHandler({FeignException.NotFound.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.NotFound e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("FeignException.NotFound");
    }

    @ExceptionHandler({FeignException.NotImplemented.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.NotImplemented e){
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("error en la petición NotImplemented");
    }

    @ExceptionHandler({FeignException.ServiceUnavailable.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.ServiceUnavailable e){
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("error en la petición ServiceUnavailable");
    }

    @ExceptionHandler({FeignException.TooManyRequests.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.TooManyRequests e){
        return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body("error en la petición TooManyRequests");
    }

    @ExceptionHandler({FeignException.Unauthorized.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.Unauthorized e){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("error en la petición Unauthorized");
    }

    @ExceptionHandler({FeignException.UnprocessableEntity.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.UnprocessableEntity e){
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body("error en la petición UnprocessableEntity");
    }

    @ExceptionHandler({FeignException.UnsupportedMediaType.class})
    public ResponseEntity<String> exceptionNotControled(FeignException.UnsupportedMediaType e){
        return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body("error en la petición UnsupportedMediaType");
    }
}
