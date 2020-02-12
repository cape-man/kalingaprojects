package com.mindtree.adminanduser.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.mindtree.adminanduser.exceptions.controllerexception.ControllerException;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler
	public String ControllerExceptionHandler(ControllerException c, Model model) {
		
		Map<String,Object> error = new HashMap<String,Object>();
		error.put("timestamp", new Date());
		error.put("httpStatus", HttpStatus.BAD_REQUEST.value());
		error.put("message", c.getMessage());
		model.addAttribute("error",error);
		return "ErrorPage";
	}
}
