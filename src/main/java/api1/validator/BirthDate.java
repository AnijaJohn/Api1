package api1.validator;

import java.lang.annotation.*;



import javax.validation.Constraint;
import javax.validation.Payload;



@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@Constraint(validatedBy = BirthDateValidator.class)
public @interface BirthDate {



String message() default "This date pattern is not allowed.";



Class<?>[] groups() default {};



Class<? extends Payload>[] payload() default {};



}