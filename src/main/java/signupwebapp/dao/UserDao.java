package signupwebapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import signupwebapp.model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void saveUser(User user)
	{
		this.hibernateTemplate.saveOrUpdate(user);
	}
	
	
	// method to get all users
	public List<User> getUsers()
	{
		List<User> users=this.hibernateTemplate.loadAll(User.class);
		return users;
	}
	
	// delete the user
	@Transactional
	public void deleteUser(int id)
	{
		System.out.println("\n Deleting the user Having ID"+id);
		User user=this.hibernateTemplate.load(User.class, id);
		this.hibernateTemplate.delete(user);
		System.out.println("\n User Deleted");
	}
	
	// get the single to update based on id
	public User getUser(int id)
	{
		User user=this.hibernateTemplate.get(User.class, id);
		System.out.println("\n Updating User: "+user);
		return user;		
	}
	
}
