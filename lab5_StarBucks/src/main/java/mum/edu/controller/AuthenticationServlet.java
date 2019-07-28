package mum.edu.controller;

import mum.edu.domain.User;
import mum.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("user")
public class AuthenticationServlet {

	@Autowired
	private UserService userService;

	@GetMapping({"/","/login"})
	public String getLoginForm(HttpSession session) {

		return "login";
	}

	@PostMapping(value = "/login")
	public String LoginSuccess(Model model, User userName) {
		User user = userService.findByName(userName.getName());
		if(user ==null || !user.getPassword().equals(userName.getPassword())){
			throw new RuntimeException("UserName/Password is incorrect");

		}

	 		model.addAttribute("user", userName);
		    return "redirect:advice";
	}

	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String logout(Model model, SessionStatus status){
		status.setComplete();

		return "redirect:login";
	}

}
