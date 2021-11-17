package api1.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BirthDateValidator implements ConstraintValidator<BirthDate, String> {
	  @Override
	  public boolean isValid(String BirthDate, ConstraintValidatorContext context) {
		  if(!BirthDate.matches("^\\d{4}-\\d{2}-\\d{2}$")) {
			  return false;
		  }if(Date.valueOf(BirthDate).before(Date.valueOf(LocalDate.now()))) {
			  return false;
		  }
		  return true;
	  }
}
