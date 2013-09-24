package com.codetutr.validator;

import com.codetutr.form.Subscriber;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Right constraint validator
 *
 * @author Paul Kulitski
 */
public class RightConstraintValidator implements ConstraintValidator<Right, Subscriber> {

    @Override
    public void initialize(Right a) {
    }

    @Override
    public boolean isValid(Subscriber subscriber, ConstraintValidatorContext cvc) {
        System.out.println(subscriber);
        if (subscriber.getAge() < 18) {
            return false;
        }
        System.out.println("is valid?: " + true);
        return true;
    }
}
