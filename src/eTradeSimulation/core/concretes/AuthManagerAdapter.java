package eTradeSimulation.core.concretes;

import GoogleAuth.Authentication;
import eTradeSimulation.core.abstracts.AuthService;


public class AuthManagerAdapter implements AuthService {
	
	@Override
	public void auth() {
		Authentication authentication = new Authentication();
		authentication.auth();
	}

}
