package eTradeSimulation.dataAccess.abstracts;

import java.util.List;

import eTradeSimulation.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getId(int id);
	List<User> getAll(); 
	List<User> getEmail(String email);
	List<User> getPassword(String password);
	

}
