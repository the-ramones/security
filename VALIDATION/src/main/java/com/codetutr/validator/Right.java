package com.codetutr.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.persistence.ElementCollection;
import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

/**
 * Constraint to an {@link com.codetutr.form.Subscriber} object as a whole
 *
 * @author Paul Kulitski
 */
@Documented
@Constraint(validatedBy = RightConstraintValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Right {

    String message() default "{Right}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
