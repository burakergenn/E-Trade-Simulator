package eTradeSimulation.dataAccess.concretes;

import java.util.List;

import eTradeSimulation.dataAccess.abstracts.UserDao;
import eTradeSimulation.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı sisteme eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı sistemden silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı sistemde güncellendi");
		
	}

	@Override
	public User getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getPassword(String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
