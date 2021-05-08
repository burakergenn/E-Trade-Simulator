package eTradeSimulation.business.abstracts;

import java.util.List;

import eTradeSimulation.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	User getId(User user);
	List<User> getAll();

}
