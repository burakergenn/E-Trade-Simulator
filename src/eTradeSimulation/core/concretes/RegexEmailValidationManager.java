package eTradeSimulation.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTradeSimulation.core.abstracts.EmailValidationService;

public class RegexEmailValidationManager implements EmailValidationService {

	private String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	private Pattern pattern = Pattern.compile(regex);
	private Matcher matcher;
	
	@Override
	public boolean checkEmail(String email) {
		matcher= pattern.matcher(email);
		if (matcher.matches()) {
			return true;
		}
		
		
		return false;
	}

}
