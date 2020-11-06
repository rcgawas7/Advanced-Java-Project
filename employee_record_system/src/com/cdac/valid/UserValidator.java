package com.cdac.valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.dto.User;

@Service
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName","unmKey","user Name required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPass","passkey","Password required");
		
	}
	
	public void validate1(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName","unmKey","user Name required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPass","passkey","Password required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailAdderss","passkey","Email required");
		
	}
	


	
	
	

}
