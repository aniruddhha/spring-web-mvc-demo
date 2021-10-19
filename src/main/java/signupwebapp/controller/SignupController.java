package signupwebapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import signupwebapp.model.User;
import signupwebapp.service.UserService;

@Controller
@RequestMapping
public class SignupController {
	
	@Autowired
	private UserService userService; 
	
	@RequestMapping("/signuppage")
	public String signupForm(Model model)
	{
		return "signup";
	}
	
	@RequestMapping(path="/processsignup", method=RequestMethod.POST)
	public RedirectView signupDataHandler(@ModelAttribute User user, HttpServletRequest request, Model model)
	{
		System.out.println(user);
		this.userService.createUser(user);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/userlist");
		return redirectView;
	}
	
	@RequestMapping("/userlist")
	public String showUseList(Model model)
	{
		List<User> users=this.userService.getUserList();
		model.addAttribute("users",users);
		for(User user: users)
		{
			System.out.println(user);
		}
		return "userlist";
	}
	
	@RequestMapping("/delete/{userId}")
	public RedirectView deleteUser(@PathVariable("userId") int userId, HttpServletRequest request )
	{
		this.userService.deleteUser(userId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/userlist" );
		return redirectView;
	}

	@RequestMapping("/update/{userId}")
	public String updateUser(@PathVariable("userId") int userId, Model model )
	{
		
		User user = this.userService.getuser(userId);
		System.out.println("Updating the user: "+user);
		model.addAttribute("user",user);
		return "updateuser";
	}
}
