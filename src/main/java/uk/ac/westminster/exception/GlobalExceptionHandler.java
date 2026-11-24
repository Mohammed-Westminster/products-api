package uk.ac.westminster.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
// @ControllerAdvice is a stereotype, so the component scan
// registers this class as a bean like any other.
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(
            ProductNotFoundException ex) {
        ErrorResponse body =
                new ErrorResponse(ex.getMessage(), 404);
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(body);
    }
}