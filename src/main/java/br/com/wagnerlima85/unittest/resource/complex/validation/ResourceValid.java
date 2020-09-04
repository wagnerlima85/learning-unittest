package br.com.wagnerlima85.unittest.resource.complex.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ComplexResourceValid.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResourceValid {
	String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
