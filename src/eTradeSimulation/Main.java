package eTradeSimulation;


import eTradeSimulation.business.abstracts.LoginService;
import eTradeSimulation.business.abstracts.UserService;
import eTradeSimulation.business.concretes.LoginManager;
import eTradeSimulation.business.concretes.UserManager;
import eTradeSimulation.core.concretes.AuthManagerAdapter;
import eTradeSimulation.core.concretes.EmailActivationManager;
import eTradeSimulation.core.concretes.RegexEmailValidationManager;
import eTradeSimulation.dataAccess.concretes.HibernateUserDao;
import eTradeSimulation.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Burak","Ergen","burak@gmail.com","şifre1234");
		User user2 = new User(2,"Berke","Bağıröz","berke@gma","şifre12345");
		
		UserService userManager = new UserManager(new HibernateUserDao(), new RegexEmailValidationManager() , new EmailActivationManager());
		userManager.add(user1);
		System.out.println("-------------------------------");
		userManager.add(user2);
		
		System.out.println("-------------------------------");
		LoginService login = new LoginManager(new HibernateUserDao(), new AuthManagerAdapter() );
		login.login("burak@gmail.com", "şifre124");
		
	}	

}
