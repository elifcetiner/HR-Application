package bootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bootsample.model.LoginBean;
import bootsample.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
	public String defaultPage(LoginBean loginBean,BindingResult bindingResult) {
		loginService.addLogin(loginBean);
		return "index";
	}
	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public String logout() {
			return "logout";
	}
	
	
}
