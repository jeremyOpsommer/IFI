package musikkloud.dao;

import musikkloud.model.User;

public interface UserDao {

	User findByUserName(String username);

}
