package com.alpha.hospital.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.alpha.hospital.ResponseStructure;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(PatientNotFoundException.class)
	public ResponseStructure<String> stuNotFoundExhandler(){
		ResponseStructure<String> rs =new ResponseStructure<String>();
		
			rs.setStatuscode(HttpStatus.NOT_FOUND.value());
			rs.setMessage("Patient NOT FOUND");
			rs.setData("Patient NOT FOUND");
		return rs;
		
	}

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public  ResponseStructure<Map<String, String>> handleMethodNotValid(MethodArgumentNotValidException ex) {

        Map<String, String> errormap = new HashMap<String, String>();

        List<ObjectError> objerrors = ex.getAllErrors();
        for (ObjectError err : objerrors) {
            System.err.println(err.getDefaultMessage());
            
            FieldError fr=(FieldError) objerrors;
            System.err.println(fr.getField());
            errormap.put(fr.getField(), err.getDefaultMessage());
        }

        ResponseStructure<Map<String, String>> rs = new ResponseStructure<Map<String, String>>();

        rs.setStatuscode(HttpStatus.NOT_ACCEPTABLE.value());
        rs.setMessage("VALIDATION FAILED");
        rs.setData(errormap);

        return rs;
    }

}