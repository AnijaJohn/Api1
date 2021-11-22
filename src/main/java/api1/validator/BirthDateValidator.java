package api1.validator;

import java.sql.Date;
import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class BirthDateValidator implements ConstraintValidator<BirthDate, String> {

/* @Override
public void initialize(UserDob udob)
{
}*/
@Override
public boolean isValid(String BirthDate ,ConstraintValidatorContext constraintValidatorContext ) {

//if(!BirthDate.matches("^\\d{2}-\\d{2}-\\d{4}$"))
//{
//return false;
//}
LocalDate dates=LocalDate.of(Integer.parseInt(BirthDate.substring(6)),
Integer.parseInt(BirthDate.substring(3,5)), Integer.parseInt(BirthDate.substring(0,2)));


if(!Date.valueOf(dates).before(Date.valueOf(LocalDate.now())))
{
return false;
}
return true;

}
} 


