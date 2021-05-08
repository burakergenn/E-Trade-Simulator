package eTradeSimulation.business.concretes;

import eTradeSimulation.business.abstracts.LoginService;
import eTradeSimulation.core.abstracts.AuthService;
import eTradeSimulation.dataAccess.abstracts.UserDao;
import eTradeSimulation.entities.concretes.User;

public class LoginManager implements LoginService {

	private UserDao userDao;
	private AuthService authService;
	
	
	public LoginManager(UserDao userDao, AuthService authservice) {
		super();
		this.userDao = userDao;
		this.authService=authservice;
	}
	@Override
	public void login(String email, String password) {
		
		for (User user : userDao.getAll() ) {
			
			if (user.getEmail().equalsIgnoreCase(password) && user.getPassword().equalsIgnoreCase(password)) {
				System.out.println("Giriş yapıldı");
			}else {
				System.out.println("Kullanıcı bilgilerinizi kontrol ediniz");
			}
		}
		
	}
	@Override
	public void googleLogin() {
		authService.auth();
		
	}

}
