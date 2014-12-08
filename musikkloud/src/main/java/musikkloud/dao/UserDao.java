package musikkloud.dao;

import musikkloud.model.User;

public interface UserDao {
	
	public void addUser(User u);
	
	public int connect(User u);
	
	public boolean isAdmin(int id);

}
