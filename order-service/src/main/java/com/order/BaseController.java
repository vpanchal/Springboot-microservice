package com.order;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class BaseController {

	public BaseController() {
		super();
	}

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	Map<String, String> handleValidationErrors(MethodArgumentNotValidException exception) {
		Map<String, String> errorMessages= new HashMap<>();
		exception.getAllErrors().forEach(error-> {
			String fieldName = ((FieldError) error).getField();
			String message = ((FieldError) error).getDefaultMessage();
			errorMessages.put(fieldName, message);
			
		});
		return errorMessages;
	}

}