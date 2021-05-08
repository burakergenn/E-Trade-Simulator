package eTradeSimulation.business.concretes;


import java.util.List;

import eTradeSimulation.business.abstracts.UserService;
import eTradeSimulation.core.abstracts.EmailActivationService;
import eTradeSimulation.core.abstracts.EmailValidationService;
import eTradeSimulation.dataAccess.abstracts.UserDao;
import eTradeSimulation.entities.concretes.User;

public class UserManager implements UserService  {
	
	private UserDao userDao;
	private EmailValidationService emailValidation;
	private EmailActivationService emailActivation;


	public UserManager(UserDao userDao , EmailValidationService emailValidation , EmailActivationService emailActivation) {
		super();
		this.userDao = userDao;
		this.emailValidation=emailValidation;
		this.emailActivation=emailActivation;
	}
	
	
	@Override
	public void add(User user) {
		if (user.getPassword().length()<=5) {
			System.out.println("Parola 6 karakterden az olamaz!");
		}
		if (user.getFirstName().length()<=1 && user.getLastName().length()<=1) {
			System.out.println("Adınız ve Soyadınız 2 karaterden az olmaz!");
		}
		if (user.getEmail().isEmpty()) {
			System.out.println("Email alanı boş olamaz!");
		}else if (this.emailValidation.checkEmail(user.getEmail())==false) {
			System.out.println("Lütfen emailinizi kontrol ediniz.");
		}
		
		if (emailActivation.activateEmail(1)) {
			System.out.println("Başarıyla Kaydoldunuz");
			this.userDao.add(user);
		}else {
			System.out.println("Öncelikle email aktivasyonunuzu tamamlayınız.");
		}
		
		
		
		
		
		
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public List<User> getAll() {
		this.userDao.getAll();
		return null;
	}


	@Override
	public User getId(User user) {
		this.userDao.getId(user.getId());
		return null;
	}

}
