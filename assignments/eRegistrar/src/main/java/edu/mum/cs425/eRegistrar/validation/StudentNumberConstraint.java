package edu.mum.cs425.eRegistrar.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.OverridesAttribute;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraintvalidation.SupportedValidationTarget;
import javax.validation.constraintvalidation.ValidationTarget;

import edu.mum.cs425.eRegistrar.validation.impl.StudentNumberConstraintImpl;

//@NotNull
//@Size
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {StudentNumberConstraintImpl.class})
@Documented
@SupportedValidationTarget(ValidationTarget.ANNOTATED_ELEMENT)
//@ReportAsSingleViolation
public @interface StudentNumberConstraint {
	String message() default "Number must have minimum value";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {  };
	
	//000-61-0001
//	@OverridesAttribute(constraint=Size.class, name="max")
//    int max() default 13;
}
