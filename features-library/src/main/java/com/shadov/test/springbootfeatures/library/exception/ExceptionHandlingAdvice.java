package com.shadov.test.springbootfeatures.library.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlingAdvice {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handle(Exception ex) {
		return ResponseEntity.status(504).body(ex.getMessage());
	}
}
