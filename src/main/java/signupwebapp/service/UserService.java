package signupwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import signupwebapp.dao.UserDao;
import signupwebapp.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void createUser(User user)
	{
		 this.userDao.saveUser(user);
	}
	public List<User> getUserList()
	{
		return this.userDao.getUsers();
	}
	public void deleteUser(int id)
	{
		this.userDao.deleteUser(id);
	}
	public User getuser(int id)
	{
		//System.out.println("getuser Service"+id);
		return this.userDao.getUser(id);
	}
}
