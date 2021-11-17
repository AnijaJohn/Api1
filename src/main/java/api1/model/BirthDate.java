package api1.model;

import javax.validation.Payload;

public @interface BirthDate {
	String message() default "Enter a valid date in DD-MM-YYY format";
	 
	 
	  Class <?> [] groups() default {};
	  
	  
	  Class <? extends Payload> [] payload() default {};
	}



