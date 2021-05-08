package eTradeSimulation.core.concretes;

import eTradeSimulation.core.abstracts.EmailActivationService;

public class EmailActivationManager implements EmailActivationService {

	@Override
	public boolean activateEmail(int validate) {
		if (validate==1) {
			System.out.println("Hesap aktif edildi.");
			return true;
		}else {
			return false;
		}
		
		
	}

}
