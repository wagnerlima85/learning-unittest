package br.com.wagnerlima85.unittest.resource.complex.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.wagnerlima85.unittest.resource.complex.ComplexResource;

public class ComplexResourceValid implements ConstraintValidator<ResourceValid, ComplexResource> {

	@Override
	public boolean isValid(ComplexResource value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
